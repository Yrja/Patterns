package com.example.patterns.fabricMethod;

import android.util.Log;

public class HtmlButton implements Button {
    @Override
    public void render() {
        Log.d("TAG", "Render html button");
        onClick();
    }

    @Override
    public void onClick() {
        Log.d("TAG", "Click html button");
    }
}
