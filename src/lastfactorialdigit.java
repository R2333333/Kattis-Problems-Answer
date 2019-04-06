import java.util.HashMap;
import java.util.Scanner;

public class lastfactorialdigit {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int nums = scanner.nextInt(), f[] = new int[nums];
        scanner.nextLine();

        for (int i = 0; i < nums; ++i){
            int n = scanner.nextInt();
            scanner.nextLine();
            f[i] = (n > 4)? 0 : ((n == 3)? 6 : n);
        }

        for (int i : f)
        System.out.println(i);
    }
}
