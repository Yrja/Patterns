package com.example.patterns.fabricMethod.factory;

import com.example.patterns.fabricMethod.Button;

public abstract class Dialog {

    public void renderWindow() {

        Button okButton = createButton();
        okButton.render();
    }

    protected abstract Button createButton();
}
