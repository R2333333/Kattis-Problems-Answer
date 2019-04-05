import java.util.Scanner;

public class Tarifa {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        //scanner.nextLine();
        int month = scanner.nextInt();
        //scanner.nextLine();
        int useage = 0;

        for (int i = 0; i < month; ++i){
            useage += scanner.nextInt();

        }

        scanner.close();

        System.out.println(amount * month - useage + amount);

    }
}
