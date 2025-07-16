package com.example.kiosk.lv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Kiosk!\n");
        System.out.println("[ SHAKESHACK MENU ]\n" +
                "1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거\n" +
                "2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거\n" +
                "3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거\n" +
                "4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거\n" +
                "0. 종료      | 종료\n");
        System.out.print("위 메뉴판을 보시고 메뉴를 골라 입력해주세요: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("선택한 메뉴: ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
                System.out.println("주문이 완료되었습니다. 금액은 W 6.9 입니다.");
                break;
            case 2:
                System.out.println("선택한 메뉴: SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
                System.out.println("주문이 완료되었습니다. 금액은 W 8.9 입니다.");
                break;
            case 3:
                System.out.println("선택한 메뉴: Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
                System.out.println("주문이 완료되었습니다. 금액은 W 6.9 입니다.");
                break;
            case 4:
                System.out.println("선택한 메뉴: Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
                System.out.println("주문이 완료되었습니다. 금액은 W 5.4 입니다.");
                break;
            case 0:
                System.out.println("프로그램을 종료합니다.");
                break;
        }
    }
}