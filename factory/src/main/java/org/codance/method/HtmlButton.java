package org.codance.method;

/**
 * @author zhaoxg
 * @date 2024/5/6 17:27
 */
public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("Render HtmlButton");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click HtmlButton");
    }
}
