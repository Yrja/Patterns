package com.example.patterns.fabricMethod;

import android.util.Log;

public class WindowsButton implements Button{
    @Override
    public void render() {
        Log.d("TAG", "Render window button");
        onClick();
    }

    @Override
    public void onClick() {
        Log.d("TAG", "Click window button");
    }
}
