package com.technology.rediscenter.util;

public class StringUtils {
    public static boolean isNotBlank(String str) {
        if (str == null || "".equals(str)) {
            return false;
        } else {
            return true;
        }
    }
}
