package com.tugdualgrall.demo;

public class SimpleApp {

    private String aStupidString = "Hello World";

    public static void main(String[] args) {
        System.out.println( "Address "+ a() );

    }

    @SuppressWarnings("PMD")
    private static String a() {
        String address = "127.0.0.1";
        return address;
    }



}
