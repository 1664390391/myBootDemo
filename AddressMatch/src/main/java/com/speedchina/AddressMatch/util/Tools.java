package com.speedchina.AddressMatch.util;

public class Tools {

    /**
     * 判断字符串是否为空
     *
     * @param str
     * @return boolean 是否为空
     * @author lt
     */
    public static boolean isStrEmpty(String str)
    {
        if (str == null || "".equals(str.trim()) || str.trim().equalsIgnoreCase("null"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
