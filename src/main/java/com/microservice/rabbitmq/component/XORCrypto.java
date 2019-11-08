package com.microservice.rabbitmq.component;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

/**
 * 异或加密算法满足如下两个条件时，异或加密算法便是一个安全的加密算法
 * 1. 密钥变更频繁
 * 2. 密钥的长度大于等于明文的长度
 */
public class XORCrypto {
    private static byte[] keyBytes; // 密钥
    private static int k;

    public XORCrypto(String key) {
        keyBytes = key.getBytes();
        k = keyBytes.length;
    }

    private static String coding(String key,String message) throws UnsupportedEncodingException {
        keyBytes = key.getBytes();
        k = keyBytes.length;
        byte[] origin = message.getBytes();
        byte[] master = new byte[origin.length];
        for (int i = 0, len = origin.length; i < len; i++) {
            master[i] = (byte) (origin[i] ^ keyBytes[i % k]);
        }
        return new String(master);

    }

    public static String encoding(String key,String plaintext) throws UnsupportedEncodingException {
        return coding(key,plaintext);
    }

    public static String decoding(String key,String cipherText) throws UnsupportedEncodingException {
        return coding(key,cipherText);
    }
    public static String asciiToString(String value)  
    {  
        StringBuffer sbu = new StringBuffer();  
        String[] chars = value.split(",");  
        for (int i = 0; i < chars.length; i++) {  
            sbu.append((char) Integer.parseInt(chars[i]));  
        }  
        return sbu.toString();  
    }  
    public static String stringToAscii(String value)  
    {  
        StringBuffer sbu = new StringBuffer();  
        char[] chars = value.toCharArray();   
        for (int i = 0; i < chars.length; i++) {  
            if(i != chars.length - 1)  
            {  
                sbu.append((int)chars[i]).append(",");  
            }  
            else {  
                sbu.append((int)chars[i]);  
            }  
        }  
        return sbu.toString();  
    }  

	/**
	 * 字符串转unicode
	 * 
	 * @param str
	 * @return
	 */
	public static String stringToUnicode(String str) {
		StringBuffer sb = new StringBuffer();
		char[] c = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			sb.append("\\u" + Integer.toHexString(c[i]));
		}
		return sb.toString();
	}
 
	/**
	 * unicode转字符串
	 * 
	 * @param unicode
	 * @return
	 */
	public static String unicodeToString(String unicode) {
		StringBuffer sb = new StringBuffer();
		String[] hex = unicode.split("\\\\u");
		for (int i = 1; i < hex.length; i++) {
			int index = Integer.parseInt(hex[i], 16);
			sb.append((char) index);
		}
		return sb.toString();
	}
    public static String decode222(String str) {
        String sg = "\\u";
        int a = 0;
        List<String> list = new ArrayList<>();
        while (str.contains(sg)) {
            str = str.substring(2);
            String substring;
            if (str.contains(sg)) {
                substring = str.substring(0, str.indexOf(sg));
            } else {
                substring = str;
            }
            if (str.contains(sg)) {
                str = str.substring(str.indexOf(sg));
            }
            list.add(substring);
        }
        StringBuffer sb = new StringBuffer();
        if (!CollectionUtils.isEmpty(list)){
            for (String string : list) {
                sb.append((char) Integer.parseInt(string, 16));
            }
        }
        return sb.toString();
    }

    public static String encode1111(String str) {
        String prefix = "\\u";
        StringBuffer sb = new StringBuffer();
        char[] chars = str.toCharArray();
        if (chars == null || chars.length == 0) {
            return null;
        }
        for (char c : chars) {
            sb.append(prefix);
            sb.append(Integer.toHexString(c));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String name = "就安静安静安静爱打架";
        //System.out.println(name);
        //String xxxx="wofDksOeworDl8OswpPDv8O7worDgcOwwozDp8O7wofDgcOmwpDDuMOjwoXDqsOewonDsMO2wpzDvMOU";
        String key = "bbooyez";
        //String decode = new String(Base64.getDecoder().decode(xxxx), StandardCharsets.UTF_8);
        //System.out.println((decode));
        //XORCrypto crypto = new XORCrypto(key);
        //String cipherText = XORCrypto.encoding(name); // 将name加密成密文
        try {
        	//String gbk=URLEncoder.encode(name,"unicode");
			
			String plaintext1 = XORCrypto.encoding(key,name);
			String plaintext = XORCrypto.decoding(key,plaintext1);
			System.out.println((plaintext1));
	        System.out.println((plaintext));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 解密
        //System.out.println(cipherText);

    }
}