import java.util.Scanner;

public class simon {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        while (t-- > 0){
            String o = scanner.nextLine();
            if (o.startsWith("simon says "))
                System.out.println(o.substring(11));
            else System.out.println();
        }
    }
}
