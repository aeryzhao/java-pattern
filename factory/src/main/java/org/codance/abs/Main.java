package org.codance.abs;



/**
 * @author zhaoxg
 * @date 2022/3/30 16:58
 */
public class Main {
    private static GUIFactory factory;
    private static Client client;

    public static void main(String[] args) {
        client = configureClient();
        client.paint();
    }

    private static Client configureClient() {
        String os = System.getProperty("os.name").toLowerCase();
        System.out.println(os);
        if (os.contains("windows")) {
            factory = new WinFactory();
        } else {
            factory = new MacFactory();
        }
        client = new Client(factory);
        return client;
    }
}
