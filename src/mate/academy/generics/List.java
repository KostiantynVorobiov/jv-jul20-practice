package mate.academy.generics;

public class List {
    private Object [] list = new Object[10];
    private int size = 0;

    public void add(Object element) {
        list[size] = element;
        size++;
    }

    public int getSize() {
        return size;
    }

    public Object get(int i) {
        return list[i];
    }
}
