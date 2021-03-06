package com.annabush.demo;

import java.util.*;

public class VendingMachine {
    boolean on;
    ArrayList<String> items;

    public VendingMachine() {
        items = new ArrayList<String>();
        add3Items();
    }

    public void powerButton() {
        on = !on;
    }

    public boolean isOn() {
        return on;
    }

    public int numItems() {
        return items.size();
    }

    public void addItems(ArrayList<String> itemsToAdd) {
        items.addAll(itemsToAdd);
    }

    public void removeItemAt(int i) {
        items.remove(i);
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public boolean itemsInclude(String item) {
        return items.contains(item);
    }

    private void add3Items() {
        ArrayList<String> newItems = new ArrayList<String>();
        newItems.add("candy");
        newItems.add("granola bar");
        newItems.add("peanuts");

        this.addItems(newItems);
    }

}