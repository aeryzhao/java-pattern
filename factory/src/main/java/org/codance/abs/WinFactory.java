package org.codance.abs;

/**
 * @author zhaoxg
 * @date 2022/3/30 16:55
 */
public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
