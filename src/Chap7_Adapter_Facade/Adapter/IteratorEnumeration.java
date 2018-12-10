package Chap7_Adapter_Facade.Adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by Citrix on 2018/12/10.
 */
public class IteratorEnumeration implements Enumeration {
    Iterator iterator;

    public IteratorEnumeration(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
