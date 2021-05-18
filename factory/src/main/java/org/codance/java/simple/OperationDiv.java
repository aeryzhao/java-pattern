package org.codance.java.simple;

/**
 * @author zhaoxg
 * @date 2021/5/13 14:21
 */
public class OperationDiv extends Operation {
    @Override
    public double calculate() {
        if (numberB != 0) {
            return numberA / numberB;
        }
        return 0;
    }
}
