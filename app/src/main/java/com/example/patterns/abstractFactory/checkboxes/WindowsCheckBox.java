package com.example.patterns.abstractFactory.checkboxes;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
