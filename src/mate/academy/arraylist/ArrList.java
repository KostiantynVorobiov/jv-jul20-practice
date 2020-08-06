package mate.academy.arraylist;

// Simple ArrayList implementation
public class ArrList<T> {
    private Object[] data;
    private int size;

    public void addAll(ArrList<T> list) {
        for (int i = 0; i < list.size; i++) {
            add(list.get(i));
        }
    }

    public void add(T value) {
        // TODO: implement
    }

    public T get(int index) {
        return null; // TODO: implement
    }
}
