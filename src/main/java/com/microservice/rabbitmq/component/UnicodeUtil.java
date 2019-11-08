package com.microservice.rabbitmq.component;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UnicodeUtil {

    /**
     * 字符转ASC
     *
     * @param st
     * @return
     */
    public static int getAsc(String st) {
        byte[] gc = st.getBytes();
        int ascNum = (int) gc[0];
        return ascNum;
    }
    /**
     * Ascii转换为字符串
     * @param value
     * @return
     */
    public static String asciiToString(String value){
        StringBuffer sbu = new StringBuffer();
        String[] chars = value.split(",");
        for (int i = 0; i < chars.length; i++) {
            sbu.append((char) Integer.parseInt(chars[i]));
        }
        return sbu.toString();
    }
    /**
     * 字符串转换为Ascii
     *
     * @param value
     * @return
     */
    public static String stringToAscii(String value) {
        StringBuffer sbu = new StringBuffer();
        char[] chars = value.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i != chars.length - 1) {
                sbu.append((int) chars[i]).append(",");
            } else {
                sbu.append((int) chars[i]);
            }
        }
        return sbu.toString();

    }

    /*
    * 把中文字符串转换为十六进制Unicode编码字符串
    */
    public static String stringToUnicode(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            int ch = (int) s.charAt(i);
            if (ch > 255)
                str += "\\u" + Integer.toHexString(ch);
            else
                str += "\\" + Integer.toHexString(ch);
        }
        return str;
    }

    /*
    * 把十六进制Unicode编码字符串转换为中文字符串
    */
    public static String unicodeToString(String str) {
        Pattern pattern = Pattern.compile("(\\\\u(\\p{XDigit}{4}))");
        Matcher matcher = pattern.matcher(str);
        char ch;
        while (matcher.find()) {
            ch = (char) Integer.parseInt(matcher.group(2), 16);
            str = str.replace(matcher.group(1), ch + "");
        }
        return str;
    }


    /**
     * 字符转换成unicode十进制编码
     *
     * @param c
     * @return
     */
    public static String cnToUnicode(char c) {
        //获得字符的uncoide编码
        String uncoide = Integer.toHexString(c);
        // System.out.println(c+"的uncoide编码:\t"+uncoide);
        //从uncoide编码转换成10进制
        int x = Integer.parseInt(uncoide, 16);
        // System.out.println(uncoide+"转成10进制:\t"+x);
        return x + "";
    }

    /**
     * 将十进制形式的Unicode编码转换为字符，例如 36215->北 （&#36215;）
     *
     * @param codePoints
     * @return
     */
    public static String fromCharCode(int... codePoints) {

        StringBuilder builder = new StringBuilder(codePoints.length);
        for (int codePoint : codePoints) {
            builder.append(Character.toChars(codePoint));
        }
        return builder.toString();
    }

    /**
     * 将&#36215;&#39134; 转化为 只含有整数值的数组 result[0]=36215,result[1]=39134
     *
     * @param unicodeStr
     * @return
     */
    public static int[] removeUnicodeFlag(String unicodeStr) {
        String regex = "&#(\\d+);";
        int result[] = new int[unicodeStr.split(";").length];
        Pattern p = Pattern.compile(regex);
        Matcher ma = p.matcher(unicodeStr);
        int i = 0;
        while (ma.find()) {
            result[i++] = Integer.parseInt(ma.group(1));
        }
        return result;
    }

    /**
     * 签名
     * @param createDate
     * @param fontId
     * @return
     */
    public static String getSignature(String createDate,String fontId){
        Map<String, String> map=new TreeMap<String, String>();
        map.put("createDate", createDate);
        map.put("fontId", fontId);
        Set<String> keySet = map.keySet();
        String str="";
        for (String key : keySet) {
            str+=key+map.get(key);
        }
        System.out.println(str);
        String encryption = encryption(str);
        return encryption.toUpperCase();
    }

    /**
     * MD5加密
     * @param plainText
     * @return
     */
    public static String encryption(String plainText) {
        String re_md5 = new String();
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(plainText.getBytes());
            byte b[] = md.digest();

            int i;

            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }

            re_md5 = buf.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return re_md5;
    }
}
