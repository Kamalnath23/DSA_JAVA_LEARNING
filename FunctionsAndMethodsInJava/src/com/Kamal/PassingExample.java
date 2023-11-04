package com.Kamal;

public class PassingExample {
    public static void main(String[] args) {
        String name = "Kamal nath";
        showName(name);
    }

    private static void showName(String DisplayName) {
        System.out.println("In method showName "+DisplayName);
    }
}
