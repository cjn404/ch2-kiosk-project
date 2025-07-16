package com.example.kiosk.lv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Kiosk!");

        Scanner scanner = new Scanner(System.in); // 반복문 밖에서 한번만

        boolean running = true;

        int choice = 0; // try-catch, if 문 밖에서 선언

        while (running) {
            System.out.println("\n[ SHAKESHACK MENU ]\n" +
                    "1. ShackBurger   | ₩ 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거\n" +
                    "2. SmokeShack    | ₩ 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거\n" +
                    "3. Cheeseburger  | ₩ 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거\n" +
                    "4. Hamburger     | ₩ 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거\n" +
                    "0. 종료      | 종료\n");
            System.out.print("위 메뉴판을 보시고 메뉴를 골라 입력해주세요: ");

            // 숫자 아닌 값(예외) 처리
            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("올바른 숫자(0~4)를 입력하세요.");
                scanner.nextLine(); // 잘못된 입력 버퍼 비우기 -> 필수
                continue;
            }

            if (choice >= 0 && choice <= 4) {
                switch (choice) {
                    case 1:
                        System.out.println("선택한 메뉴: ShackBurger   | ₩ 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
                        System.out.println("주문이 완료되었습니다. 금액은 ₩ 6.9 입니다.");
                        break;
                    case 2:
                        System.out.println("선택한 메뉴: SmokeShack    | ₩ 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
                        System.out.println("주문이 완료되었습니다. 금액은 ₩ 8.9 입니다.");
                        break;
                    case 3:
                        System.out.println("선택한 메뉴: Cheeseburger  | ₩ 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
                        System.out.println("주문이 완료되었습니다. 금액은 ₩ 6.9 입니다.");
                        break;
                    case 4:
                        System.out.println("선택한 메뉴: Hamburger     | ₩ 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
                        System.out.println("주문이 완료되었습니다. 금액은 ₩ 5.4 입니다.");
                        break;
                    case 0:
                        System.out.println("프로그램을 종료합니다.");
                        running = false;
                        break;
//                        default: // 콘솔창에 안 찍힘
//                            System.out.println("올바른 숫자(0~4)를 입력하세요.");
                }
            } else {
                System.out.println("올바른 숫자(0~4)를 입력하세요.");
            }
        }
    }
}