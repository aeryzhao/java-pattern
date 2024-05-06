package org.codance.abs;



/**
 * @author zhaoxg
 * @date 2022/3/30 16:58
 */
public class Main {
    private static GUIFactory factory;
    private static Client client;

    public static void main(String[] args) {
        configureClient();
        client.paint();
    }

    private static void configureClient() {
        if (System.getProperty("os.name").equals("Mac OS X")) {
            factory = new MacFactory();
        } else {
            factory = new WinFactory();
        }
        client = new Client(factory);
    }
}
