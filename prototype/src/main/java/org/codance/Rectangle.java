package org.codance;

import java.util.Objects;

/**
 * @author zhaoxg
 * @date 2022/4/1 10:46
 */
public class Rectangle extends Shape {
    public int weith;
    public int height;

    public Rectangle() {}

    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.height = target.height;
            this.weith = target.weith;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return weith == rectangle.weith && height == rectangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weith, height);
    }
}
