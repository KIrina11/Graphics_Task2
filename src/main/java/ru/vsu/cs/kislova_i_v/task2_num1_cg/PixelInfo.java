package ru.vsu.cs.kislova_i_v.task2_num1_cg;

import javafx.scene.paint.Color;

public class PixelInfo {
    private final int x;
    private final int y;
    private final Color color;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getColor() {
        return color;
    }

    public PixelInfo(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
}