package com.example.kiosk.lv6;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private final List<CartItem> cartItemList = new ArrayList<>();

    public List<CartItem> getCartItemList() {
        return cartItemList;
    }

    // 수량 누적
    public void addItems(CartItem cartItem) {
        for (CartItem item : cartItemList) {
            if (item.getCartItemName().equals(cartItem.getCartItemName())) {
                item.setCartQuantity(item.getCartQuantity() + cartItem.getCartQuantity());
                return;
            }
        }
        // 항목 없으면 새로 추가
        cartItemList.add(cartItem);
    }

    // 총합
    public double getCartPrice() {
        double totalPrice = 0;
        for (CartItem cartItem : cartItemList) {
            totalPrice += cartItem.getCartPrice() * cartItem.getCartQuantity();;
        }
        return totalPrice;
    }

    public void clearCart() {
        cartItemList.clear(); // 리스트 비우기
    }
}