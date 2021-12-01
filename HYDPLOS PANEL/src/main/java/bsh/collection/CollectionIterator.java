package bsh.collection;

import bsh.BshIterator;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator implements BshIterator {
    private Iterator iterator;

    public CollectionIterator(Object obj) {
        this.iterator = createIterator(obj);
    }

    /* access modifiers changed from: protected */
    public Iterator createIterator(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Object arguments passed to the CollectionIterator constructor cannot be null.");
        } else if (obj instanceof Iterator) {
            return (Iterator) obj;
        } else {
            if (obj instanceof Collection) {
                return ((Collection) obj).iterator();
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Cannot enumerate object of type ");
            stringBuffer.append(obj.getClass());
            throw new IllegalArgumentException(stringBuffer.toString());
        }
    }

    @Override // bsh.BshIterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // bsh.BshIterator
    public Object next() {
        return this.iterator.next();
    }
}
