package dev.test;

import com.abc.Item;

public class Main {
    public static void main(String[] args) {
        Item firstItem = new Item("Burger");
        com.abc.Item secondItem = new com.abc.Item("Burger");
        System.out.println(secondItem);
    }
}
