import java.util.Scanner;

public class nastyhacks {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), i = 0;
        scanner.nextLine();
        String s[] = new String[n];

        for (;i < n;++i){
            int r = scanner.nextInt(), e = scanner.nextInt(), c = scanner.nextInt();
            scanner.nextLine();

            s[i] = (e - c > r)? "advertise":((e - c < r)? "do not advertise": "does not matter");
        }

        for (String sb : s){
            System.out.println(sb);
        }
    }
}
