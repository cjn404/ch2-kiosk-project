package com.example.kiosk.lv4;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    String categoryName;
    List<MenuItem> menuList;


    public Menu(String categoryName, List<MenuItem> menuList) {
        this.categoryName = categoryName;
        this.menuList = menuList;
    }
}