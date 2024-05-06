package org.codance.method;

/**
 * @author zhaoxg
 * @date 2024/5/6 17:29
 */
public class Main {
    private static Dialog dialog;
    public static void main(String[] args) {
        configure();
        dialog.renderWindow();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Mac OS X")) {
           dialog =  new MacDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }
}
