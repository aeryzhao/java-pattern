package org.codance.simple;

/**
 * @author zhaoxg
 * @date 2021/5/13 11:27
 */
public class OperationSub extends Operation {
    @Override
    public double calculate() {
        return numberA - numberB;
    }
}
