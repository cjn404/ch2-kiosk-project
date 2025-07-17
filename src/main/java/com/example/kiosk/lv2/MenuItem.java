package com.example.kiosk.lv2;

public class MenuItem {

    // 속성
    String name;
    double price;
    String description;

    // 생성
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // 기능
//    public void printMenu() {
//        System.out.println(name + " | ₩ " + price + " | " + description);
//        System.out.printf("%-15s | ₩ %.1f | %s%n", name, price, description);
//    }
}
