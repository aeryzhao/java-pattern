package org.codance;

/**
 * @author zhaoxg
 * @date 2022/4/13 18:12
 */
public interface Device {
    boolean isEnabled();
    void enable();
    void disable();
    int getVolume();
    void setVolume(int volume);
    int getChannel();
    void setChannel(int channel);
    void printStatus();
}
