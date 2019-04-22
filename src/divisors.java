import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class divisors {


    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLong()){

            int    n = scanner.nextInt(),
                    k = scanner.nextInt();


            System.out.println(num(1));

        }
    }


//    static long binomial(long N, long K) {
//        long ret = 1;
//        for (int k = 0; k < K; k++) {
//            ret = ret*(N-k)
//                    /(k+1);
//        }
//        return ret;
//    }

    static long num(long number){
        long x = 2;
        long totalFactors = 1;
        while (x * x <= number) {
            int power = 0;
            while (number % x == 0) {
                power++;
                number = number / x;
            }
            totalFactors *= (power + 1);
            x++;
        }
        if (number != 1) {
            totalFactors *= 2;
        }

        return totalFactors;
    }


}
