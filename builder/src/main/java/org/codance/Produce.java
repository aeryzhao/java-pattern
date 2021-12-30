package org.codance;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaoxg
 * @date 2021/12/30 16:55
 */
class Produce {
    List<String> parts = new ArrayList<> ();

    public void addPart(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("---------产品创建----------");
        for (String p : parts) {
            System.out.println(p);
        }
    }
}
