package com.xuyi.test;

public class Test {
    public static void main(String[] args) throws Exception {
        String s = null;
        try {
            s.length();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.print(s);
    }
}
