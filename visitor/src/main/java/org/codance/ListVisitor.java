package org.codance;

import java.util.Iterator;

/**
 * @author zhaoxg
 * @date 2024/6/15 15:58
 */
public class ListVisitor implements Visitor {
    private String currentDir = "";

    @Override
    public void visit(File file) {
        System.out.println(currentDir + "/" + file.getName());
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir + "/" + directory);
        String savedDir = currentDir;
        currentDir = currentDir + "/" + directory.getName();
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.accept(this);
        }
        currentDir = savedDir;
    }
}
