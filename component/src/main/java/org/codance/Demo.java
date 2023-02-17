package org.codance;

import org.codance.editor.ImageEditor;
import org.codance.shape.Circle;
import org.codance.shape.CompoundShape;
import org.codance.shape.Dot;
import org.codance.shape.Ractangle;

import java.awt.*;

/**
 * @author zhaoxg
 * @date 2023/2/17 20:23
 */
public class Demo {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Ractangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
