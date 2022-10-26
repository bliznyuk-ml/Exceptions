package org.example;

public class List<T> {

    private T[] obj;
    private int size = -1;
    private int cur = -1;

    public List(int size) {
        cur = 0;
        this.size = size;
        obj = (T[]) (new Object[size]);
    }

    public void add(T item) throws FullListException {
        if (cur == obj.length) throw new FullListException("Array is full");
        obj[cur++] = item;
    }

    public void removeLast() throws EmptyListException {
        if (cur == 0) throw new EmptyListException("Array is empty");
        obj[--cur] = null;
    }
}
