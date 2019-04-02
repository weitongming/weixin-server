package com.weitongming.weixin.util;

import java.security.MessageDigest;
import java.util.Arrays;

/**
 * @author tim.wei
 * @description
 * @date Created on 2019/4/2.
 */
public class CheckUtil {


    public static final String  tooken = "12kjsSHAad23jn23JLJSH1212J12"; //开发者自行定义Tooken


    public static boolean checkSignature(String signature,String timestamp,String nonce){

        String[] arr = {tooken,timestamp,nonce};


        Arrays.sort(arr);


        StringBuilder sb = new StringBuilder();

        for(String s : arr){

            sb.append(s);

        }

        String temp = getSha1(sb.toString());

        return temp.equals(signature);

    }



    public static String getSha1(String str){

        if(str==null||str.length()==0){

            return null;

        }

        char hexDigits[] = {'0','1','2','3','4','5','6','7','8','9',

                'a','b','c','d','e','f'};

        try {

            MessageDigest mdTemp = MessageDigest.getInstance("SHA1");

            mdTemp.update(str.getBytes("UTF-8"));



            byte[] md = mdTemp.digest();

            int j = md.length;

            char buf[] = new char[j*2];

            int k = 0;

            for (int i = 0; i < j; i++) {

                byte byte0 = md[i];

                buf[k++] = hexDigits[byte0 >>> 4 & 0xf];

                buf[k++] = hexDigits[byte0 & 0xf];

            }

            return new String(buf);

        } catch (Exception e) {

            // TODO: handle exception

            return null;

        }

    }
}
