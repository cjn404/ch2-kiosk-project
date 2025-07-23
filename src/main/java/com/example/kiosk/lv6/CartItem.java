package com.example.kiosk.lv6;

public class CartItem {

    private String cartItem;
    private double cartPrice;
    private int cartQuantity;

    public CartItem(String cartItem, double cartPrice, int cartQuantity) {
        this.cartItem = cartItem;
        this.cartPrice = cartPrice;
        this.cartQuantity = cartQuantity;
    }

    public String getCartItem() {
        return cartItem;
    }

    public void setCartItem(String cartItem) {
        this.cartItem = cartItem;
    }

    public double getCartPrice() {
        return cartPrice;
    }

    public void setCartPrice(double cartPrice) {
        this.cartPrice = cartPrice;
    }

    public int getCartQuantity() {
        return cartQuantity;
    }

    public void setCartQuantity(int cartQuantity) {
        this.cartQuantity = cartQuantity;
    }

    // 기능 - 총합계산
    public double getTotalOrderPrice() {
        return getCartPrice() * getCartQuantity();
    }
}