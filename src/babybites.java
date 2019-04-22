import java.io.IOException;
import java.util.Scanner;

public class babybites {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();

        scanner.nextLine();

        String words[] = scanner.nextLine().split(" ");

        for (int i = 0; i < time; ++i){
            if (words[i].matches("mumble")) {
                if (i == time -1)
                    System.out.println("makes sense");
                continue;
            }

            if (Integer.valueOf(words[i]) != i +1){
                System.out.println("something is fishy");
                break;
            }
            if (i == time -1)
                System.out.println("makes sense");
        }



    }
}
