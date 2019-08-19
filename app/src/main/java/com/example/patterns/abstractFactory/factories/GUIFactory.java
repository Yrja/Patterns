package com.example.patterns.abstractFactory.factories;

import com.example.patterns.abstractFactory.buttons.Button;
import com.example.patterns.abstractFactory.checkboxes.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
