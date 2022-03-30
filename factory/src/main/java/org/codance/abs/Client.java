package org.codance.abs;

/**
 * @author zhaoxg
 * @date 2022/3/30 16:56
 */
public class Client {
    private Button button;
    private Checkbox checkbox;

    public Client(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
