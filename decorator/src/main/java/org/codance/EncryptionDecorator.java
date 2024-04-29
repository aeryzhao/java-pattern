package org.codance;

/**
 * @author zhaoxg
 * @date 2024/4/24 09:23
 */
public class EncryptionDecorator extends DataSourceDecorator {
    EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encrypt(data));
    }

    @Override
    public String readData() {
        return decrypt(super.readData());
    }

    private String encrypt(String data) {
        return data + " encrypted";
    }

    private String decrypt(String data) {
        return data + " decrypted";
    }
}
