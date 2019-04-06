import java.util.Scanner;

public class bijele {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int out[] = new int[]{1,1,2,2,2,8};

        for (int i = 0; i < out.length; ++i){
            out[i] -= scanner.nextInt();
//            System.out.print(out[i]);
        }

        scanner.close();

        for (int i : out) {
            System.out.print(i+" ");
        }
    }
}
