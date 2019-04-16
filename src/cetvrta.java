
import java.util.HashSet;
import java.util.Scanner;

public class cetvrta {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> x = new HashSet<>(), y = new HashSet<>();
        for (int i = 0; i < 3; ++i){
            int xx = scanner.nextInt(), yy = scanner.nextInt();
            scanner.nextLine();
            if (x.contains(xx))
                x.remove(xx);
            else x.add(xx);

            if (y.contains(yy))
                y.remove(yy);
            else y.add(yy);
        }

        scanner.close();
        System.out.print(x.iterator().next() + " " + y.iterator().next());
    }
}
