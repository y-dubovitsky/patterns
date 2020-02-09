package pool.simple;

import java.util.LinkedList;

/**
 * The class shows how to work with the pool of objects.
 *
 * https://evileg.com/ru/post/409/
 */
public class ObjectPoolUse {

    public static void main(String[] args) {
        ObjectPool objectPool = new ObjectPool();
        A a = objectPool.getObjectPool();
        //* do something with this object and release it
        objectPool.returnObjectPool(a);
    }
}

/**
 * A class that implements an object pool
 */
class ObjectPool {
    LinkedList<A> free = new LinkedList<A>();
    LinkedList<A> uses = new LinkedList<A>();

    public A getObjectPool() {
        if (free.isEmpty()) {
            A a = new A();
            free.add(a);
            return a;
        } else {
            A first = free.getFirst();
            uses.add(first);
            free.remove(first);
            return first;
        }
    }

    public void returnObjectPool(A a) {
        uses.remove(a);
        free.add(a);
    }
}

/**
 * Objects contained in the pool
 */
class A {

}
