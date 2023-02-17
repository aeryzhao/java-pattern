package org.codance.shape;

import java.awt.*;

/**
 * @author zhaoxg
 * @date 2023/1/17 9:04
 */
public class Ractangle extends BaseShape {
    public int width;
    public int height;

    public Ractangle(int x, int y, int width, int height, Color color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void print(Graphics graphics) {
        super.print(graphics);
        graphics.drawRect(x, y, getWidth() - 1, getHeight() - 1);
    }
}
