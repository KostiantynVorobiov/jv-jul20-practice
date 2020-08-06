package mate.academy.generics;

public class GenericMain {
    public static void main(String[] args) {
        List list = new List();
        list.add("Hello world");
        list.add("Hello mates");
        list.add(new User());

        System.out.println(list.getSize());

        for (int i = 0; i < list.getSize(); i++) {
            String s = (String) list.get(i);
            System.out.println(s);
        }

        Box<String> box = new Box<>();
        box.add("Hello");



    }
}
