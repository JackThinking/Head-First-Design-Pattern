package Chap7_Adapter_Facade.Adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by Citrix on 2018/12/10.
 */
public class EnumerationIterator implements Iterator {
    Enumeration enumeration;//被适配器对象的引用
    /*
    * 不要忘记构造函数呀，然后勾住被适配器对象
    * */
    public EnumerationIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
