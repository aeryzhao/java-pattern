package org.codance.shape;

import java.awt.*;

/**
 * @author zhaoxg
 * @date 2023/1/17 8:59
 */
public class Dot extends BaseShape {
    private final int DOT_SIZE = 3;

    public Dot(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public int getWidth() {
        return DOT_SIZE;
    }

    @Override
    public int getHeight() {
        return DOT_SIZE;
    }

    @Override
    public void print(Graphics graphics) {
        super.print(graphics);
        graphics.fillRect(x - 1, y - 1, getWidth(), getHeight());
    }
}
