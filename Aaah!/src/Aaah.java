import java.util.Scanner;

public class Aaah {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String first = input.nextLine();
        String second = input.nextLine();
        input.close();

        System.out.println(first.length() >= second.length()? "go" : "no");

//        for (int i = 0; i < 999; ++i)
//        System.out.print("a");
    }
}
