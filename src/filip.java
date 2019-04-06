import java.util.Scanner;

public class filip {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next(), b = scanner.next();
        scanner.close();

        String s1 = "", s2 = "";

        for (int i = a.length()-1; i >= 0; --i){
            s1 += a.charAt(i);
        }
        for (int i = b.length()-1; i >= 0; --i){
            s2 += b.charAt(i);
        }

        System.out.print((s1.compareTo(s2)>0? Integer.valueOf(s1) : Integer.valueOf(s2)));
    }
}
