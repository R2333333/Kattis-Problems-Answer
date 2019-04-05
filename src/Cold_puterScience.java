import java.util.Scanner;

public class Cold_puterScience {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int ans = 0;
        int times = scanner.nextInt();
        for (int i = 0; i < times; ++i){
            if (scanner.nextInt() < 0)
                ans++;
        }
        scanner.close();
        System.out.println(ans);
    }
}
