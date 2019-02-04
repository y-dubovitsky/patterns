package adapter.EnumerationIterator;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Адаптер позволяет работать с Iterator как с Enumeration.
 */
public class IteratorAdapter implements Enumeration {
    Iterator<?> iterator;

    public IteratorAdapter(Iterator<?> iterator) {
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
