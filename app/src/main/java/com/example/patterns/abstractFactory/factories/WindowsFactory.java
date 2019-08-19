package com.example.patterns.abstractFactory.factories;

import com.example.patterns.abstractFactory.buttons.Button;
import com.example.patterns.abstractFactory.buttons.WindowsButton;
import com.example.patterns.abstractFactory.checkboxes.CheckBox;
import com.example.patterns.abstractFactory.checkboxes.WindowsCheckBox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
