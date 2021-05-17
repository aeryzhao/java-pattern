package org.codance.java.stategy.simple;

/**
 * @author zhaoxg
 * @date 2021/5/17 14:02
 */
public class StategyPattern {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStategyA());
        context.ContextInterface();

        Context context1 = new Context(new ConcreteStategyB());
        context1.ContextInterface();

        Context context2 = new Context(new ConcreteStategyC());
        context2.ContextInterface();
    }
}
