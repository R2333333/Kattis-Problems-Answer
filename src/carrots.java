import java.util.Scanner;

public class carrots {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(), out = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; ++i)
            scanner.nextLine();

        scanner.close();

        System.out.println(out);

    }
}
