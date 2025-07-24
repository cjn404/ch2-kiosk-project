# Ch2 java 키오스크 프로젝트

## 목표
java 객체 간의 역할과 책임을 명확히 나누어 객체 지향적 구조의 키오스크 구현

<br>

## 개발 대상
Lv1 부터 LV6 까지 단계별 키오스크 구현

<br>

## 개발 프로세스
- **Lv1** : 클래스 없이 자바의 기본 문법만을 사용하여 키오스크 구현
- **Lv2** : 객체 지향 설계를 적용해 햄버거 메뉴를 클래스로 관리
- **Lv3** : 객체 지향 설계를 적용해 순서 제어를 클래스로 관리
- **Lv4** : 객체 지향 설계를 적용해 음식 메뉴와 주문 내역을 클래스 기반으로 관리
- **Lv5** : LV4 기반으로 캡슐화 적용
- **Lv6** : 장바구니 및 구매하기 기능 추가

<br>

## 디렉토리 구조
```
──src
    └── main
        └── java
            └── com
                └── example
                    └── kiosk
                        ├── lv1
                        │   └── Main.java
                        ├── lv2
                        │   ├── Main.java
                        │   └── MenuItem.java
                        ├── lv3
                        │   ├── Kiosk.java
                        │   ├── Main.java
                        │   └── MenuItem.java
                        ├── lv4
                        │   ├── Kiosk.java
                        │   ├── Main.java
                        │   ├── Menu.java
                        │   └── MenuItem.java
                        ├── lv5
                        │   ├── Kiosk.java
                        │   ├── Main.java
                        │   ├── Menu.java
                        │   └── MenuItem.java
                        └── lv6
                            ├── Cart.java
                            ├── CartItem.java
                            ├── Kiosk.java
                            ├── Main.java
                            ├── Menu.java
                            └── MenuItem.java
```

## 주요 기능
- **Lv1**
  - Main 클래스 
    - 0 입력 전까지 햄버거 메뉴판 구현
    - 예외 처리 : 올바른 숫자 아닌 값 예외 처리
  - 주요 키워드 : Scanner, while, try-catch, if, switch
 
- **Lv2**  
  - Main 클래스 : Lv1 기반. MenuItem 클래스를 활용하여 햄버거 메뉴 출력
  - MenuItem 클래스 : 이름, 가격, 설명 필드로 햄버거 항목 관리 
  - 주요 키워드 : List, Scanner, boolean, while, try-catch, if
 
- **Lv3**  
  - Main 클래스 : 전체 키오스크 프로그램 실행 진입점
  - Kiosk 클래스
    - Lv2의 main 함수에서 관리하던 전체 프로그램 흐름(메뉴 출력, 선택 처리, 사용자 입출력 관리) 제어
    - 0 입력 시 '뒤로가기' 또는 '종료' 
  - MenuItem 클래스 : 이름, 가격, 설명 필드를 가지고 햄버거 항목 관리 
  - 주요 키워드 : Kiosk(), start(), List, new, Scanner, boolean, while, for, printf, format string, try-catch, if

- **Lv4**  
  - Main 클래스 : Lv3 기반
  - Kiosk 클래스 : Lv3 기반. 햄버거, 음료, 디저트 카테고리 이름 필드와 그에 속한 세부 메뉴들 반환 구현 추가
  - Menu 클래스 : MenuItem 클래스 관리
  - 주요 키워드 : Kiosk(), start(), List, new, Scanner, boolean, while, for, printf, format string, try-catch, if
 
- **Lv5**  
  - Lv4 기반으로 MenuItem, Menu, Kiosk 클래스 필드 캡슐화 및 getter/setter 추가
  - 주요 키워드 : private, final, getter, setter
 
- **Lv6**  
  - Main 클래스 : Lv5 기반
  - Kiosk 클래스 : Lv5 기반. 전체 프로그램 흐름(메뉴 출력, 선택 처리, 사용자 입출력 및 장바구니 관리) 제어
  - Cart 클래스 : 장바구니 생성 및 동일 항목 수량 증가, 총액 계산, 주문 완료 후 초기화 기능
  - CartItem 클래스 : 장바구니에 담긴 개별 항목 정보(메뉴명, 수량, 가격) 관리
  - 주요 키워드 : private, final, getter, setter, Kiosk(), start(), List, new, Scanner, boolean, while, for, printf, format string, try-catch, if

<br>

## 개발 환경
java gradle corretto 17

<br>

## 개선 사항
- Kiosk 클래스
  - 해당 클래스의 역할 및 책임 분리하는 또 다른 클래스 또는 메서드 생성
  - 코드 리팩토링 : 중첩된 while 문 및 if 문 개선, 메서드 생성 등 


