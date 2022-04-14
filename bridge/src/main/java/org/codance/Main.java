package org.codance;

/**
 * @author zhaoxg
 * @date 2022/4/14 16:04
 */
public class Main {
    public static void main(String[] args) {
        testDevice(new Radio());
        testDevice(new Tv());
    }

    public static void testDevice(Device device) {
        System.out.println("Test basic remote:");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();
        basicRemote.channelUp();
        basicRemote.volumeUp();
        device.printStatus();

        System.out.println("Test advance remote:");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
