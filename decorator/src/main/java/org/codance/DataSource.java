package org.codance;

/**
 * @author zhaoxg
 * @date 2024/4/24 09:15
 */
public interface DataSource {
    void writeData(String data);
    String readData();
}
