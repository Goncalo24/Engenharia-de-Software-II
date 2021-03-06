package com.es2.composite;

import java.util.ArrayList;

public class SubMenu extends Menu{
    private ArrayList<Menu> menus = new ArrayList<Menu>();

    public void addChild(Menu child) {
        menus.add(child);
    }

    public void removeChild(Menu child) {
        menus.remove(child);
    }

    @Override
    public void showOptions() {
        System.out.println(this.getLabel());
        for (Menu child : menus) {
            child.showOptions();
        }
    }
}
