
import java.math.BigInteger;
import java.util.Scanner;

public class anothercandies {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int cases = scanner.nextInt();
        scanner.nextLine();

        while (cases-- > 0){
            int children = scanner.nextInt(); BigInteger candies = new BigInteger("0");

            for (int i = 0; i < children; ++i){
                candies = candies.add(scanner.nextBigInteger());
            }
            if (candies.mod(BigInteger.valueOf(children)) == BigInteger.valueOf(0))
                System.out.println("YES");
            else System.out.println("NO");


        }

        scanner.close();
    }
}
