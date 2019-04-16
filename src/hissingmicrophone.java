import java.util.Scanner;

public class hissingmicrophone {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextLine().contains("ss"))
            System.out.println("hiss");
        else System.out.println("no hiss");
    }
}
