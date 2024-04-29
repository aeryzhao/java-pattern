package org.codance;

/**
 * @author zhaoxg
 * @date 2024/4/24 09:23
 */
public class ClientMain {
    public static void main(String[] args) {
        FileDataSource fileDataSource = new FileDataSource("file.txt");
        EncryptionDecorator encryptionDecorator = new EncryptionDecorator(fileDataSource);
        CompressionDecorator compressionDecorator = new CompressionDecorator(encryptionDecorator);
        String txt = "text...";
        System.out.println("Client: write plain text: " + txt);
        compressionDecorator.writeData(txt);
        System.out.println("Client: read encrypted compressed text: " + compressionDecorator.readData());
    }
}
