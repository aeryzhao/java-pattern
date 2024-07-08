package org.codance;

/**
 * @author zhaoxg
 * @date 2024/6/15 15:45
 */
public interface Element {
    void accept(Visitor v);
}
