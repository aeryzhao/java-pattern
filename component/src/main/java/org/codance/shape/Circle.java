package org.codance.shape;

import java.awt.*;

/**
 * @author zhaoxg
 * @date 2023/1/17 9:01
 */
public class Circle extends BaseShape {
    public int radius;

    public Circle(int x, int y, int radius, Color color) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public int getWidth() {
        return radius * 2;
    }

    @Override
    public int getHeight() {
        return radius * 2;
    }

    @Override
    public void print(Graphics graphics) {
        super.print(graphics);
        graphics.drawOval(x, y, getWidth() - 1, getHeight() - 1);
    }
}
