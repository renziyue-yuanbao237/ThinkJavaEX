import java.util.Arrays;
public class Ti4 {
    static boolean isAbecedarian(String c){
        char[] nwe_list = c.toCharArray();
        Arrays.sort(nwe_list);
        return Arrays.equals(nwe_list, c.toCharArray());
//        return nwe_list.equals(c.toCharArray());
    }

    public static void main(String[] args) {
        System.out.print(isAbecedarian("az"));
        System.out.print(isAbecedarian("za"));
    }
}
