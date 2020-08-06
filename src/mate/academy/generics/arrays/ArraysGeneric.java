package mate.academy.generics.arrays;

public class ArraysGeneric <K, V> {
    private K [] keys;
    private V [] values;
}

class Example<T> {
    private T[] data = (T[]) new Object[10];

    public static void main(String[] args) {

    }


    // arrays are covariant
    // generics are invariant
    // Animal != Dog
    // covariant: Animal == Dog
}
