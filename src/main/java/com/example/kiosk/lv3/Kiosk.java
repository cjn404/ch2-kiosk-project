package com.example.kiosk.lv3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    List<MenuItem> menuList = new ArrayList<>();

    public Kiosk() {

        System.out.println("Hello, Kiosk!");

        menuList.add(new com.example.kiosk.lv3.MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuList.add(new com.example.kiosk.lv3.MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuList.add(new com.example.kiosk.lv3.MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuList.add(new com.example.kiosk.lv3.MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        int choice = 0;

        while (running) {
            System.out.println("\n[ SHAKESHACK MENU ]");
            for (int i = 0; i < menuList.size(); i++) {
                System.out.printf("%d. %-15s | ₩ %.1f | %s%n", i + 1, menuList.get(i).name, menuList.get(i).price, menuList.get(i).description);
            }
            System.out.println("0. 종료      | 종료\n");

            System.out.print("위 메뉴판을 보시고 메뉴를 골라 입력해주세요: ");

            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("올바른 숫자(0~4)를 입력하세요.");
                scanner.nextLine(); // 잘못된 입력 버퍼 비우기 -> 필수
                continue;
            }

            // if (choice >= 1 && choice <= 4)
            if (choice >= 1 && choice <= menuList.size()) {
                MenuItem selectedItem = menuList.get(choice - 1);
//                System.out.println("선택한 메뉴: " + selectedItem.name + " | ₩ " + selectedItem.price + " | " + selectedItem.description);
                System.out.printf("선택한 메뉴: %-15s | ₩ %.1f | %s%n", selectedItem.name, selectedItem.price, selectedItem.description);
                System.out.println("주문이 완료되었습니다. 금액은 ₩ " + selectedItem.price + " 입니다.");
            } else if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                running = false;
                break;
            } else {
                System.out.println("올바른 숫자(0~4)를 입력하세요.");
            }
        }
    }
}