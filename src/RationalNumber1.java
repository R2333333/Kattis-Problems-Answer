import java.util.Scanner;
import java.util.TreeMap;

public class RationalNumber1 {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);

        int lines = input.nextInt();

        input.nextLine();
        TreeMap<Integer,int[]> data = new TreeMap<>();

        for (int i = 0; i < lines; ++i){
            int setNum = input.nextInt();
            int searchNum[] = new int[2];
            String tobeConvert[] = input.next().split("/");
            for (int s = 0; s < 2; ++s ){
                searchNum[s] = Integer.valueOf(tobeConvert[s]);
            }
            data.put(setNum, searchNum);
        }

        for (int i : data.keySet())
            System.out.println(i + " " + findNext(data.get(i)));
    }

    public static String findNext(int array[]){
        if (array[0] == 1 && array[1] == 1){
            return "1/2";
        }

        if (array[0] < array [1]){

            return array[1] + "/" + (array[1] - array[0]);
        }

        if (array[1] == 1)
            return array[1] + "/" + (array[0] +1);

        int q;
        int cout;

        cout = array[0] / array[1];

        q = array[1] - array[0] % array[1];

        q += cout * array[1];

        return array[1] + "/" + q;
    }
}
