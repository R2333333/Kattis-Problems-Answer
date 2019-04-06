import java.util.Scanner;

public class quadrant {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), q;
        scanner.close();

        if (a < 0 && b < 0)
            q = 3;
        else if (a < 0 && b > 0)
            q = 2;
        else if (a > 0 && b > 0)
            q = 1;
        else q = 4;

        System.out.print(q);
    }
}
