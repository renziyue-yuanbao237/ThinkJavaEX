public class Date {
    static void printAmerican(String day,int date,String month,int year) {
        System.out.println(day+","+month+" "+date+","+year);
    }
    static void printEuropean(String day,int date,String month,int year){
        System.out.println(day+" "+date+" "+month+" "+year);
    }
    public static void main(String[] args) {
        printAmerican("Tue",20,"Dec",2022);
        printEuropean("Tue",20,"Dec",2022);
    }
}