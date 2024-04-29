package org.codance;

/**
 * @author zhaoxg
 * @date 2024/4/24 09:23
 */
public class CompressionDecorator extends DataSourceDecorator {
    CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        super.writeData(compress(data));
    }

    @Override
    public String readData() {
        return decompress(super.readData());
    }

    private String compress(String data) {
        return data + " compressed";
    }

    private String decompress(String data) {
        return data + " decompressed";
    }
}
