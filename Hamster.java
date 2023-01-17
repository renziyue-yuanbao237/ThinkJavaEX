import java.util.Arrays;
import java.util.Random;
public class Hamster {
    public static int banana(int[] a) {
        int kiwi = 1;
        int i = 0;
        while (i < a.length) {
            kiwi = kiwi * a[i];
            i++;
        }
        return kiwi;
    }
    public static int grapefruit(int[] a, int grape) {
        //like "in" in python
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                return i;
            }
        }
        return -1;
    }
    public static int pineapple(int[] a, int apple) {
        //count number
        int pear = 0;
        for (int pine: a) {
            if (pine == apple) {
                pear++;
            }
        }
        return pear;
    }
}
