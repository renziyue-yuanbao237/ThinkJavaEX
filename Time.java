import java.util.Scanner;
public class Time {
    public static void main(String args[]){
        Scanner obj1=new Scanner(System.in);
        System.out.print("");
        int foo=obj1.nextInt();
        int minute=foo/60;
        int hour=minute/60;
        int outputSecond=foo-(hour*3600+minute*60);
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(outputSecond);
    }
}