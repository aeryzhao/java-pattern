package org.codance.method;

/**
 * @author zhaoxg
 * @date 2024/5/6 17:26
 */
public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Render MacButton");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click MacButton");
    }
}
