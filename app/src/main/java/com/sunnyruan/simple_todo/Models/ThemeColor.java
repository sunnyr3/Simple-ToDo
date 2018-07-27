package com.sunnyruan.simple_todo.Models;

import org.litepal.crud.DataSupport;

/**
 * SAVE THEME STYLES
 */
public class ThemeColor extends DataSupport {
    private int Color;

    public void setColor(int color) {
        Color = color;
    }

    public int getColor() {
        return Color;
    }
}
