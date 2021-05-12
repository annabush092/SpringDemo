package com.annabush.demo;


import java.io.*;
import java.util.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class VendingMachineTest {

    VendingMachine vm;
    @BeforeEach
    public void setUp() {
        vm = new VendingMachine();
    }

    @Test
    public void vmShouldTurnOnOffWhenSwitchedOnOff() {
        assertFalse(vm.isOn());

        vm.powerButton();

        assertTrue(vm.isOn());

        vm.powerButton();

        assertFalse(vm.isOn());
    }

    @Test
    public void vmCanAddItems() {
        assertTrue(vm.numItems() == 3);

        ArrayList<String> secondAddition = new ArrayList<String>();
        secondAddition.add("chocolate");

        vm.addItems(secondAddition);

        assertTrue(vm.numItems() == 4);
    }

    @Test
    public void vmCanRemoveItems() throws IOException {
        assertTrue(vm.numItems() == 3);

        vm.removeItemAt(1);

        assertTrue(vm.numItems() == 2);
        assertFalse(vm.itemsInclude("granola bar"));
    }

    @Test
    public void vmCanListItems() {
        assertTrue(vm.numItems() == 3);

        ArrayList<String> items = vm.getItems();
        assertTrue(items.size() == 3);
    }

}