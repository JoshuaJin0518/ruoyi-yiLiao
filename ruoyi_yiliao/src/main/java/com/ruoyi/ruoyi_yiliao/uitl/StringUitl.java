package com.ruoyi.ruoyi_yiliao.uitl;

import com.ruoyi.ruoyi_yiliao.domain.TMedicalPacsInfo;

import java.util.Arrays;

public class StringUitl {
    public static void main(String[] args) {
        String s = "com.ruoyi.ruoyi_yiliao.mapper.TMedicalLisInfoMapper.updateTMedicalLisInfo";
        int i = s.lastIndexOf(".");
        String substring = s.substring(0, i + 1);
        System.out.println(substring);
        try {
            Class<?> aClass = Class.forName("com.ruoyi.ruoyi_yiliao.mapper.TMedicalLisInfoMapper");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    //获得字符串的最后的字符串
    public static String lastSubString(String index, String value) {
        int indexOf = value.lastIndexOf(".");
        value = value.substring(indexOf + 1, value.length());
        return value;
    }

    //去除最后一串字符
    public static String cutlast(String index, String value) {
        int i = value.lastIndexOf(index);
        String substring = value.substring(0, i);
        return substring;
    }



}
