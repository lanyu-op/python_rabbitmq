package com.microservice.rabbitmq.component;

import java.util.Calendar;
import java.util.Date;

public class ShardingUtil {
	   private static SpinLock mLock = new SpinLock();
	    private static int rotateId = 0;
	    private static int nodeId = 0;

	    private static int rotateIdWidth = 15;
	    private static int rotateIdMask = 0x7FFF;

	    private static int nodeIdWidth = 6;
	    private static int nodeIdMask = 0x3F;

	    private static final long T201801010000 = 1514736000000L;

	    public static void setNodeId(int nodeId) {
	        ShardingUtil.nodeId = nodeId;
	    }

	    /**
	     * ID = timestamp(43) + nodeId(6) + rotateId(15)
	     * 所以时间限制是到2157/5/15（2的42次幂代表的时间 + (2018-1970)）。节点数限制是小于64，每台服务器每毫秒最多发送32768条消息
	     * @return
	     */
	    public static long generateId() {
	        mLock.lock();
	        rotateId = (rotateId + 1)&rotateIdMask;
	        mLock.unLock();

	        long id = System.currentTimeMillis() - T201801010000;


	        id <<= nodeIdWidth;
	        id += (nodeId & nodeIdMask);

	        id <<= rotateIdWidth;
	        id += rotateId;
	        return id;
	    }

	    public static String getMessageTable(long mid) {
	   

	        Calendar calendar = Calendar.getInstance();
	        if (mid != Long.MAX_VALUE) {
	            mid >>= (nodeIdWidth + rotateIdWidth);
	            Date date = new Date(mid + T201801010000);
	            calendar.setTime(date);
	        } else {
	            Date date = new Date(System.currentTimeMillis());
	            calendar.setTime(date);
	        }
	        int month = calendar.get(Calendar.MONTH);
	        int year = calendar.get(Calendar.YEAR);
	        year %= 3;
	        return "t_messages_" + (year * 12 + month);
	    }

	    public static String getPreviousMessageTable(long mid) {
	    

	        mid >>= (nodeIdWidth + rotateIdWidth);
	        Date date = new Date(mid + T201801010000);
	        Calendar calendar = Calendar.getInstance();
	        calendar.setTime(date);
	        int month = calendar.get(Calendar.MONTH);
	        int year = calendar.get(Calendar.YEAR);
	        year %= 3;
	        month = month - 1;
	        if (month == -1) {
	            month = 11;
	            year = (year + 3 - 1)%3;
	        }
	        return "t_messages_" + (year * 12 + month);
	    }
}
