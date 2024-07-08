package org.codance;

import java.util.Iterator;

/**
 * @author zhaoxg
 * @date 2024/6/15 15:45
 */
public abstract class Entry implements Element {
    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }
    public Iterator Iterator() throws FileTreatmentException{
        throw new FileTreatmentException();
    }
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
