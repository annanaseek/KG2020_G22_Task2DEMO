package ru.vsu.cs;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        drawSnowFlake(g, 400, 300, 150, 28);
    }

    public static void drawSnowFlake(Graphics g, int x, int y, int r, int n) {
        double da = 2 * Math.PI / n;
        for (int i = 0; i < n; i++) {
            double a = da * i;
            double dx = r * Math.cos(a);
            double dy = r * Math.sin(a);
            g.drawLine(x, y, x + (int) dx, y + (int) dy);
        }
    }
}