import java.util.Scanner;

public class sodasurpler {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt() + scanner.nextInt(), r = scanner.nextInt(), d = 0;
        while (b >= r){
            d += b / r;
            b = (b % r) + b / r;
        }

        System.out.println(d);
    }
}
