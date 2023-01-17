import java.util.Random;
public class Loop {
    public static String reverse(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            r += s.charAt(i);
            System.out.println(r);
        }
        return r;
    }

    public static void printArray(String[] a) {
        System.out.print("{" + a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print(", " + a[i]);
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(10000) + 1;
        while (n != 1) {
            System.out.println(n);
            if (n % 2 == 0) { // n is even
                n = n / 2;
            } else { // n is odd
                n = 3 * n + 1;
            }
        }
        for (int x = 1; x <= 9; x++) {
            for (int y = 1; y <= 9; y++) {
                System.out.printf("%4d", x * y);
            }
            System.out.println();
        }
        String fruits[] = {String.format("monk%s", "ey"), "1000", "lblblb"};
        String bar[] = fruits;
        System.out.println(fruits);
        System.out.println(bar);
    }
}