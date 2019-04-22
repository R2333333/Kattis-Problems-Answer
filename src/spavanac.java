import java.util.Scanner;

public class spavanac {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int h = in.nextInt(), m = in.nextInt();
        in.close();

        if (m < 45){
            if (h == 0)
                System.out.println(23 + " " + (m + 15));
            else System.out.println((h - 1) + " " + (m + 15));
        } else System.out.println(h + " " + (m - 45));

    }
}
