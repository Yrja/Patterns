package com.example.patterns.fabricMethod.factory;

import com.example.patterns.fabricMethod.Button;
import com.example.patterns.fabricMethod.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
