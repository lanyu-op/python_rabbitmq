package com.microservice.rabbitmq.component;

import java.util.ArrayList;
import java.util.List;

public class DecryptionHelper {
    //private static final String SECRET_KEY = "Lt&wg@TCjdiA%YwLAsw^%t1ou94Tnqys";
    private static final String SECRET_KEY = "bbooyez";
    public static String decryption(String text){
        List<String> textList=new ArrayList<>();
        for (char c : text.toCharArray()) {
            String s = UnicodeUtil.cnToUnicode(c);
            textList.add(s);
        }
        List<String>keyList=new ArrayList<>();
        for (char c : SECRET_KEY.toCharArray()) {
            String s = UnicodeUtil.cnToUnicode(c);
            keyList.add(s);
        }
        String resultStr="";
        List<Integer> resultArr = decryption(textList, keyList);
        for (Integer integer : resultArr) {
            resultStr+=UnicodeUtil.fromCharCode(integer);
        }
        //System.out.println(resultStr);
        return resultStr;
    }

    public static List<Integer> decryption( List<String> secretBytes,  List<String> keyBytes) {
        int keyLength = keyBytes.size();
        int sLength = secretBytes.size();
        int index = 0;

        List<Integer> resultArr = new ArrayList<Integer>();
        for (int i = 0; i < sLength; i++) {
            String keyAt = keyBytes.get(index);
            String sByte = secretBytes.get(i);
            resultArr.add((Integer.parseInt(sByte) ^ Integer.parseInt(keyAt)));
            index = (index >= keyLength - 1) ? 0 : (index + 1);
        }
        return resultArr;
    }

    public static byte[] decryption(byte[] secretBytes) {
        return decryption(secretBytes, SECRET_KEY.getBytes());
    }

    static byte[] decryption(byte[] secretBytes, byte[] keyBytes) {
        int keyLength = keyBytes.length;
        int sLength = secretBytes.length;
        int index = 0;

        byte[] resultArr = new byte[sLength];
        for (int i = 0; i < sLength; i++) {
            byte keyAt = keyBytes[index];
            byte sByte = secretBytes[i];
            resultArr[i] = (byte) (sByte ^ keyAt);
            index = (index >= keyLength - 1) ? 0 : (index + 1);
        }
        return resultArr;
    }

}
