package com.example.kiosk.lv5;

import java.util.List;

public class Menu {
    private String categoryName;
    private List<MenuItem> menuList;


    public Menu(String categoryName, List<MenuItem> menuList) {
        this.categoryName = categoryName;
        this.menuList = menuList;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<MenuItem> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<MenuItem> menuList) {
        this.menuList = menuList;
    }
}