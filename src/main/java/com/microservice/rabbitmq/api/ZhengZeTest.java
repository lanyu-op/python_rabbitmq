package com.microservice.rabbitmq.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZhengZeTest {

	 private static void replace(String str){
         String reg="\\s+";
         Pattern p=Pattern.compile(reg);
         Matcher m=p.matcher(str);
         while(m.find()){
         System.out.println(m.group());
         //System.out.println("sadf");
         }
        }
	 private static void replace1(String str){
     String string=" qi 每个 qxx_dsdf 次12 文明 具";
     for(String a:string.split("\\s+")){
         System.out.println(a);
     }
	 }
	 
        public static void main(String[] args) {
         String str=" qi 每个 qxx_dsdf 次12 文明 具";
         replace1(str);
        }
	
}
