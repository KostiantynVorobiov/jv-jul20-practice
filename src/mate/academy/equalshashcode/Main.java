package mate.academy.equalshashcode;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.length = 10;
        rectangle.width = 10;

        System.out.println(rectangle.hashCode());

        Rectangle rectangle2 = new Rectangle();
        rectangle2.length = 15;
        rectangle2.width = 5;

        System.out.println(rectangle2.hashCode());

        rectangle.equals(rectangle2);


        System.out.println(rectangle instanceof Figure);
        System.out.println(rectangle.getClass().equals(Figure.class));

    }
}
