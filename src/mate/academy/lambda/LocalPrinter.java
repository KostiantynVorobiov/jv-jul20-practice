package mate.academy.lambda;

public class LocalPrinter implements Printable {
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
