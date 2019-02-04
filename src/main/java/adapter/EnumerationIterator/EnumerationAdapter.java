package adapter.EnumerationIterator;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Адаптер воспринимается клиентом как Iterator! Но использует методы Enumeration
 * внутри методов Iterator-a!
 */
public class EnumerationAdapter implements Iterator {
    Enumeration<?> enumeration;

    public EnumerationAdapter(Enumeration<?> enumeration){
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return this.enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return this.enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
