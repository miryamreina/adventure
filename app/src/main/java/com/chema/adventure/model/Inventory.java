package com.chema.adventure.model;

import java.util.LinkedList;

public class Inventory {
    private LinkedList<Item> inventory = new LinkedList<>();

    public Inventory(){

    }
    public void print(){
        for (Item item: inventory) {
            System.out.println(item.getName() + ": " + item.getDescription());


        }
    }
    public void add(Item item) {
        this.inventory.add(item);
    }
    public LinkedList<Item> getItems() {
        return inventory;
    }

    public boolean isEmpty(){
        return inventory.size() == 0;
    }
}




