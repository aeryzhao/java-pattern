package org.codance.abs;

/**
 * @author zhaoxg
 * @date 2022/3/30 16:54
 */
public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
