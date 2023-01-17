public class r {
    static int dpt;
    public static void main(String[] args) {
        System.out.println("depth"+dpt);
        dpt++;
        main(new String[10]);
    }
}
