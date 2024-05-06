package org.codance.method;

/**
 * @author zhaoxg
 * @date 2024/5/6 17:29
 */
public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
