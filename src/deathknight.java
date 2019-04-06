import java.util.Scanner;

public class deathknight {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt(), win = count;
        scanner.nextLine();
        for (int i = 0; i < count; ++i) {
            if (scanner.nextLine().contains("CD"))
                win--;
        }
        scanner.close();

        System.out.print(win);
    }
}
