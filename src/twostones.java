import java.util.Scanner;

public class twostones {
    public static void main(String args[]){
        System.out.print((new Scanner(System.in).nextInt() % 2 != 0)? "Alice" : "Bob");
    }
}
