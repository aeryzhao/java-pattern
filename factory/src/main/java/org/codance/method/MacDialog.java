package org.codance.method;

/**
 * @author zhaoxg
 * @date 2024/5/6 17:28
 */
public class MacDialog extends Dialog {
    @Override
    public Button createButton() {
        return new MacButton();
    }
}
