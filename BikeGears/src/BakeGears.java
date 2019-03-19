import java.math.BigInteger;
import java.util.*;

public class BakeGears {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int sprockets[] = new int[2];

        sprockets[0] = input.nextInt();
        sprockets[1] = input.nextInt();

        long front[] = new long[sprockets[0]];
        long back[] = new long[sprockets[1]];

        input.nextLine();

        for (int i = 0; i < sprockets[0]; ++i)
            front[i] = input.nextLong();

        input.nextLine();

        for (int i = 0; i < sprockets[1]; ++i)
            back[i] = input.nextLong();

        input.close();

        long toBeSort[][] = new long[sprockets[0] * sprockets[1]][2];
        int row = 0;

        for (long f: front) {
            for (long b : back){

               toBeSort[row][0] = f;
               toBeSort[row][1] = b;
               row ++;
            }
        }

        Arrays.sort(toBeSort, (long a[], long b[]) -> ((a[0]*b[1] == a[1]*b[0])?
                Long.compare(a[0],b[0]):
                Long.compare(a[0] * b[1],a[1] * b[0])));

        for (long elem[]: toBeSort){
            System.out.println("(" + elem[0] + "," + elem[1]+")");
        }

    }

}
