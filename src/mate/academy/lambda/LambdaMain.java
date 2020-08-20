package mate.academy.lambda;

public class LambdaMain {
    public static void main(String[] args) {
       Printable printable = new LocalPrinter();
       printable.print("Hello world");

       Printable printer = new Printable() {
           @Override
           public void print(String message) {
               System.out.println(message.toUpperCase());
           }
       };

       Printable lambdaImpl = message -> System.out.println(message);

       Printable lambdaMethodReference = System.out::println;

       lambdaMethodReference.print("Hello Mates!");

       Printable lambdaImplUpperCase = message -> {
           String upperCaseValue = message.toUpperCase();
           System.out.println(upperCaseValue);
       };


       Readable readable = new Readable() {
           @Override
           public void read() {

           }

           @Override
           public void read(String path) {

           }
       };
       // Readable readableLambda = we can't create
    }

}
