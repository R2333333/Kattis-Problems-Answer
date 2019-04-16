import java.util.LinkedList;
import java.util.Scanner;

public class egypt {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> s = new LinkedList<>();
        for (;;){
            double a = Math.pow(scanner.nextInt(), 2),
                    b = Math.pow(scanner.nextInt(),2),
                    c = Math.pow(scanner.nextInt(),2);
            if (a == 0)
                break;
            scanner.nextLine();

            if (a == b + c || b == a + c || c == a + b)
                s.add("right");
            else s.add("wrong");
        }

        for (String sb : s)
            System.out.println(sb);
    }
}
