import java.util.Random;

public class Example {

    public static void main (String[] args) {
        //     System.out.println("<BLONDIEBYTES>");
        Random rand = new Random();
        int mod = 50;
        int[] numbers = {rand.nextInt() % mod,
                rand.nextInt() % mod,
                rand.nextInt() % mod,
                rand.nextInt() % mod
        };

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
    }

}
