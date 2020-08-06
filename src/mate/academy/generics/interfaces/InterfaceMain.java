package mate.academy.generics.interfaces;

import mate.academy.generics.Example;

public class InterfaceMain {
    public static void main(String[] args) {
        Example<Movable> movableExample = new Example<>();
        movableExample.setValue(new Human());
        movableExample.getValue().move();
    }
}
