package com.example.kiosk.lv6;

public class CartItem {

    private String cartItemName;
    private double cartPrice;
    private int cartQuantity;

    public CartItem(String cartItem, double cartPrice, int cartQuantity) {
        this.cartItemName = cartItem;
        this.cartPrice = cartPrice;
        this.cartQuantity = cartQuantity;
    }

    public String getCartItemName() {
        return cartItemName;
    }

    public void setCartItemName(String cartItemName) {
        this.cartItemName = cartItemName;
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
}