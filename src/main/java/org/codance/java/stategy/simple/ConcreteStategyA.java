package org.codance.java.stategy.simple;

/**
 * @author zhaoxg
 * @date 2021/5/17 13:06
 */
class ConcreteStategyA implements Stategy {
    @Override
    public void AlgorithmInterface() {
        System.out.println("算法A");
    }
}

class ConcreteStategyB implements Stategy {

    @Override
    public void AlgorithmInterface() {
        System.out.println("算法B");
    }
}

class ConcreteStategyC implements Stategy {

    @Override
    public void AlgorithmInterface() {
        System.out.println("算法C");
    }
}