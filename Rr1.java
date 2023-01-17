import java.io.PrintStream;

public class Rr1 {
    static double sqrt2(int a) {
        double x0=a/2;
        double x1;
        while (true){
            x1=(x0+a/x0)/2;
            if (Math.abs(x1-x0)<=0.0001) {
                break;
            }
            x0 = x1;
        }
        return x1+Math.abs(x1-x0);
    }

    public static void main(String[] args) {
        System.out.println(sqrt2(198));
    }
}
