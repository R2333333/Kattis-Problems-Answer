import java.util.Scanner;

public class beatspread {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        scanner.nextLine();
        String out[] = new String[cases];
        for (int i = 0; i < cases; ++i){
            int a = scanner.nextInt(), b = scanner.nextInt();
            scanner.nextLine();

            if((a-b)>0 && (a-b)%2 == 0){
                out[i] = "" + (a+b)/2 + " "+(a-b)/2;
            }else if (a == 0)
                out[i] = "0 0";

            else out[i] = "impossible";
        }

        for (String i : out)
            System.out.println(i);
    }
}
