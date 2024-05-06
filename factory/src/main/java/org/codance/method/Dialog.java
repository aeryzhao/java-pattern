package org.codance.method;

/**
 * @author zhaoxg
 * @date 2024/5/6 17:27
 */
public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
