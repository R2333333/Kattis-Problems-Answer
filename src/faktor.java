import java.util.Scanner;

public class faktor {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print(scanner.nextInt()*(scanner.nextInt()-1)+1);
        scanner.close();
    }
}
