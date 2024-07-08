package org.codance;

/**
 * @author zhaoxg
 * @date 2024/6/15 15:44
 */
public interface Visitor {
    void visit(File file);
    void visit(Directory directory);
}
