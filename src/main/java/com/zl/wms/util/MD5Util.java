package com.zl.wms.util;

import java.security.MessageDigest;

public class MD5Util {

    public static String md5Encode(String str){

        MessageDigest md5 = null;

        try {

            md5 = MessageDigest.getInstance("MD5");
        }catch (Exception e){

            return "";
        }


        byte[] md5Bytes = md5.digest(str.getBytes());

        StringBuffer stringBuffer = new StringBuffer();

        for (byte by : md5Bytes){

            stringBuffer.append(Integer.toHexString(by));
        }

        return stringBuffer.toString();
    }

    public static void main(String[] args){

        System.out.println(md5Encode("123fewa"));
    }
}
