package mate.academy.equalshashcode;

public class Rectangle extends Figure {
    int width;
    int length;
    Size size;
    private long id;

    @Override
    public int hashCode() {
        return width + length + size.hashCode();
    }

    public boolean equals(Object rectangle) {
       if (rectangle == this) {
           return true;
       }
       if (rectangle == null) {
           return false;
       }
       if (rectangle.getClass().equals(Rectangle.class)) {
           Rectangle object = (Rectangle) rectangle;
           return width == object.width
                   && (length == object.length)
                   && (size.equals(object.size));
       }
       return false;
    }
}
