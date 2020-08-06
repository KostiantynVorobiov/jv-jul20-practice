package mate.academy.arraylist;

import mate.academy.arraylist.wildcard.Animal;
import mate.academy.arraylist.wildcard.Bird;
import mate.academy.arraylist.wildcard.Box;
import mate.academy.arraylist.wildcard.Cat;

public class WIldcardMain {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        Box<? super Animal> wildcardBox = new Box<>(); // will discuss on PECS lesson

        stringBox.setValue("Hello world");
        wildcardBox.setValue(new Cat());
        wildcardBox.setValue(new Bird());

        Box<Integer> integerBox = new Box<>();
        boolean equals = stringBox.equals(integerBox);
        System.out.println(equals);
    }
}
