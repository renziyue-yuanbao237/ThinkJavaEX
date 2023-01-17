import java.util.Arrays;

public class gfvbh {
    static double indexOfMax(double[] lst){
        double[] x=lst;
        Arrays.sort(x);
        return x[lst.length];
    }

    static int[] letterHist(String x){
        int[] histogram=new int[26];
        x=x.toLowerCase();
        for (int i=0; i<x.length();i++){
            int index=x.charAt(i)-'a';
            if (index < 26 && index > -1){
                histogram[index]++;
            }
        }
        return histogram;
    }
    static boolean isAngry(String f,String s){
        return Arrays.equals(letterHist(f),letterHist(s));
    }

    public static void main(String[] args) {
        System.out.println(isAngry("WwowW","Wowwow"));
    }
}
