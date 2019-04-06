import java.util.Scanner;

public class autori {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        for (String i : (scanner.nextLine().split("-"))){
            System.out.print(i.charAt(0));
        }
        scanner.close();
    }
}
