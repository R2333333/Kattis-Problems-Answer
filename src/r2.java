import java.util.Scanner;

public class r2 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();
        scanner.close();
        System.out.println(b*2-a);
    }
}
