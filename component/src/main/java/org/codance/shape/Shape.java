package org.codance.shape;

import java.awt.*;

/**
 * @author zhaoxg
 * @date 2023/1/16 17:09
 */
public interface Shape {
    int getX();
    int getY();
    int getWidth();
    int getHeight();
    void move(int x, int y);
    boolean isInsideBounds(int x, int y);
    void select();
    void unSelect();
    boolean isSelected();
    void print(Graphics graphics);
}
