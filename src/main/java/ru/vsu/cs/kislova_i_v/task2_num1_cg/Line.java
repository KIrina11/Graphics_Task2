package ru.vsu.cs.kislova_i_v.task2_num1_cg;

import javafx.scene.paint.Color;

import static java.lang.Math.round;

public class Line {
    private final int x1, x2, y1, y2;
    private final Color color1, color2;

    public Line(PixelInfo firstPoint, PixelInfo secondPoint) {
        this.x1 = firstPoint.getX();
        this.x2 = secondPoint.getX();
        this.y1 = firstPoint.getY();
        this.y2 = secondPoint.getY();
        this.color1 = firstPoint.getColor();
        this.color2 = secondPoint.getColor();
    }

    public void drawLine(PixelDrawer pixelDrawer) {
        int dx = x2 - x1;
        int dy = y2 - y1;
        int L = Math.max(Math.abs(dx), Math.abs(dy));

        float x = x1;
        float y = y1;

        if (L == 0) {
            pixelDrawer.putPixel(x1, y1, Color.BLACK);
        }

        float stepX = dx / (float) L;
        float stepY = dy / (float) L;

        for (int i = 0; i <= L; i++) {
            pixelDrawer.putPixel(round(x), round(y), interpolationColor(L, i));
            x += stepX;
            y += stepY;
        }
    }

    private javafx.scene.paint.Color interpolationColor(int n, int num) {
        double r = (color2.getRed() - color1.getRed()) / n * num + color1.getRed();
        double g = (color2.getGreen() - color1.getGreen()) / n * num + color1.getGreen();
        double b = (color2.getBlue() - color1.getBlue()) / n * num + color1.getBlue();

        return new javafx.scene.paint.Color(r, g, b, 1);
    }
}
