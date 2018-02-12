public class Example {

    public static void hello(String name, String anotherName) {
        System.out.println("Hi " + anotherName + " and " + name);
    }


    public static void main(String[] args) {
        hello("Kathryn", "Andrew");
        hello("Andrew", "Kathryn");
    }
}
