package com.example.patterns.fabricMethod.factory;

import com.example.patterns.fabricMethod.Button;
import com.example.patterns.fabricMethod.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
