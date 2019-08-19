package com.example.patterns.abstractFactory.factories;

import com.example.patterns.abstractFactory.buttons.Button;
import com.example.patterns.abstractFactory.buttons.MacOsButton;
import com.example.patterns.abstractFactory.checkboxes.CheckBox;
import com.example.patterns.abstractFactory.checkboxes.MacOsCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOsCheckbox();
    }
}
