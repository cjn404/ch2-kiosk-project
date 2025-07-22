package com.example.kiosk.lv5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    private final List<Menu> menuCategoryList;

    // 메인 메뉴(카테고리) 리스트 반환하는 getter 메서드
//    public List<Menu> getMenuCategoryList() {
//        return menuCategoryList;
//    }

    // 생성자
    public Kiosk() {

        System.out.println("Hello, Kiosk!");

        menuCategoryList = new ArrayList<>();

        List<MenuItem> burgersMenu = new ArrayList<>();
        burgersMenu.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgersMenu.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgersMenu.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgersMenu.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
        menuCategoryList.add(new Menu("Burgers", burgersMenu));

        List<MenuItem> drinksMenu = new ArrayList<>();
        drinksMenu.add(new MenuItem("Coca-Cola", 1.9, "시원한 클래식 콜라"));
        drinksMenu.add(new MenuItem("Sprite", 1.9, "시원한 레몬 향의 스프라이트"));
        drinksMenu.add(new MenuItem("Iced Tea", 1.5, "시원 달콤한 홍차"));
        drinksMenu.add(new MenuItem("Lemonade", 1.9, "상큼한 레몬 맛의 레모네이드"));
        menuCategoryList.add(new Menu("Drinks", drinksMenu));

        List<MenuItem> dessertsMenu = new ArrayList<>();
        dessertsMenu.add(new MenuItem("French Fries", 1.5, "감자 튀김"));
        dessertsMenu.add(new MenuItem("Chocolate Sundae", 2.0, "초콜릿 시럽이 올라간 소프트 아이스크림"));
        dessertsMenu.add(new MenuItem("Apple Pie", 2.0, "따뜻한 사과잼이 들어간 파이"));
        dessertsMenu.add(new MenuItem("Vanilla Milkshake", 1.9, "시원한 바닐라 향의 쉐이크"));
        menuCategoryList.add(new Menu("Desserts", dessertsMenu));
    }

    // start() 메서드
    public void start() {
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            // 1. 메인 메뉴(카테고리) 출력
            System.out.println("\n[ MAIN MENU ]");

            int i = 1;
            for (Menu category : menuCategoryList) {
                System.out.printf("%d. %s%n", i++, category.getCategoryName());
            }
//            for (int i = 0; i < menuCategoryList.size(); i++) {
//                System.out.printf("%d. %s%n", i + 1, menuCategoryList.get(i).getCategoryName());
//            }
            System.out.println("0. 종료      | 종료\n");

            System.out.print("메뉴 카테고리를 선택하세요: ");

            int categoryChoice = -1;
            try {
                categoryChoice = scanner.nextInt();
            } catch (Exception e) {
                System.out.printf("올바른 숫자(0~%d)를 입력하세요.\n", menuCategoryList.size());
                scanner.nextLine(); // 입력 버퍼 비우기
                continue;
            }

            if (categoryChoice == 0) {
                System.out.println("프로그램을 종료합니다.");
                running = false;
                break;
            } else if (categoryChoice >= 1 && categoryChoice <= menuCategoryList.size()) {
                // 2. 선택한 카테고리의 메뉴 출력
                Menu selectedCategory = menuCategoryList.get(categoryChoice - 1);

                boolean inCategory = true;

                while (inCategory) {
                    System.out.println("\n[ " + selectedCategory.getCategoryName().toUpperCase() + " MENU ]");
                    List<MenuItem> items = selectedCategory.getMenuList();

                    int j = 1;
                    for (MenuItem item : items) {
                        System.out.printf("%d. %-15s | ₩ %.1f | %s%n", j++, item.getName(), item.getPrice(), item.getDescription());
                    }
//                        for (int i = 0; i < items.size(); i++) {
//                            MenuItem item = items.get(i);
//                            System.out.printf("%d. %-15s | ₩ %.1f | %s%n", i + 1, item.getName(), item.getPrice(), item.getDescription());
//                        }
                    System.out.println("0. 뒤로가기");

                    System.out.print("메뉴를 선택하세요: ");

                    int itemChoice = -1;
                    try {
                        itemChoice = scanner.nextInt();
                    } catch (Exception e) {
                        System.out.printf("올바른 숫자(0~%d)를 입력하세요.\n", items.size());
                        scanner.nextLine();
                        continue;
                    }

                    if (itemChoice == 0) {
                        inCategory = false; // 뒤로가기
                    } else if (itemChoice >= 1 && itemChoice <= items.size()) {
                        MenuItem selectedItem = items.get(itemChoice - 1);
                        System.out.printf("선택한 메뉴: %-15s | ₩ %.1f | %s%n", selectedItem.getName(), selectedItem.getPrice(), selectedItem.getDescription());
                        System.out.println("주문이 완료되었습니다. 금액은 ₩ " + selectedItem.getPrice() + " 입니다.");

                        inCategory = false; // 메뉴 선택 후 카테고리 선택 메뉴로 돌아가기
                    } else {
                        System.out.printf("올바른 숫자(0~%d)를 입력하세요.\n", items.size());
                    }
                }
            } else {
                System.out.printf("올바른 숫자(0~%d)를 입력하세요.\n", menuCategoryList.size());
            }
        }
    }
}