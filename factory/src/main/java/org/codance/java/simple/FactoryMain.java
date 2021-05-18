package org.codance.java.simple;

import java.util.Scanner;

/**
 * @author zhaoxg
 * @date 2021/5/13 14:29
 */
public class FactoryMain {
    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            testCalc();
        }
    }
    public static void testCalc() {
        System.out.println("请输入运算方式：");
        Scanner scanner = new Scanner(System.in);
        String operate = scanner.next();
        try {
            Operation operation = OperationFactory.createOperate(operate);
            operation.setNumberA(4);
            operation.setNumberB(2);
            double calculate = operation.calculate();
            System.out.println("运算结果为：" + calculate);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
