package org.codance.java.simple;

/**
 * @author zhaoxg
 * @date 2021/5/13 14:23
 */
public class OperationFactory {
    public static Operation createOperate(String operate) throws Exception {
        Operation operation;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
            default:
                throw new Exception("输入有误");
        }
        return operation;
    }
}
