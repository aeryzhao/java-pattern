package org.codance;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaoxg
 * @date 2022/4/1 11:07
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        ArrayList<Shape> shapeCopy = new ArrayList<>();
        Circle circle = new Circle();
        circle.x = 1;
        circle.y = 1;
        circle.color = "red";
        circle.radius = 1;
        Circle clone = (Circle) circle.clone();
        shapes.add(clone);
        Rectangle rectangle = new Rectangle();
        rectangle.x = 2;
        rectangle.y = 2;
        rectangle.color = "pink";
        rectangle.weith = 2;
        rectangle.height = 2;
        shapes.add(rectangle);
        cloneAndCompare(shapes, shapeCopy);
    }

    public static void cloneAndCompare(List<Shape> shapes, List<Shape> shapeCopy) {
        for (Shape s : shapes) {
            shapeCopy.add(s.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapeCopy.get(i)) {
                System.out.println("clone的对象不是同一个对象");
                if (shapes.get(i).equals(shapeCopy.get(i))) {
                    System.out.println("clone的对象内容是一样的");
                }
            } else {
                System.out.println("clone的对象是同一个对象");
            }
        }
    }
}
