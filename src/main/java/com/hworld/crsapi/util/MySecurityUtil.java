package com.hworld.crsapi.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MySecurityUtil {
    /**
     * MD5加密算法
     *
     * @param content
     * @return
     */
    public static String encryptMD5(String content) {
        return encryptAlgorithm(content, "MD5");
    }

    /**
     * SHA-1加密算法
     *
     * @param content
     * @return
     */
    public static String encryptSHA1(String content) {
        return encryptAlgorithm(content, "SHA-1");
    }

    /**
     * SHA-256加密算法
     *
     * @param content
     * @return
     */
    public static String encryptSHA256(String content) {
        return encryptAlgorithm(content, "SHA-256");
    }

    /**
     * @param content
     * @param algorithm
     * @return
     */
    private static String encryptAlgorithm(String content, String algorithm) {
        String result = null;
        try {
            byte[] bt = content.getBytes();
            // byte[] bt = content.getBytes("utf-8");
            MessageDigest md = MessageDigest.getInstance(algorithm);
            md.update(bt);
            byte[] bts = md.digest();
            String des = "";
            String tmp = null;
            for (int i = 0; i < bts.length; i++) {
                tmp = (Integer.toHexString(bts[i] & 0xFF));
                if (tmp.length() == 1) {
                    des += "0";
                }
                des += tmp;
            }
            result = des;

        } catch (NoSuchAlgorithmException e) {
            return e.getMessage();
        }
        return result;
    }
}
