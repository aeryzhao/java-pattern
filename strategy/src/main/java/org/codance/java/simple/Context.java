package org.codance.java.simple;

/**
 * @author zhaoxg
 * @date 2021/5/17 14:00
 */
public class Context {
    private Stategy stategy;
    public Context(Stategy stategy) {
        this.stategy = stategy;
    }

    public void ContextInterface() {
        stategy.AlgorithmInterface();
    }
}
