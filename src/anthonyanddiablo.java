import java.util.Scanner;

public class anthonyanddiablo {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        if (scanner.nextDouble() <= Math.PI * Math.pow(scanner.nextDouble()/(2*Math.PI), 2))
            System.out.print("Diablo is happy!");
        else System.out.print("Need more materials!");

        scanner.close();
    }
}
