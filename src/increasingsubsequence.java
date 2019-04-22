import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class increasingsubsequence {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int time = scanner.nextInt();

        while (time != 0){
            int array[][] = new int[time+1][time+1];
            int in[] = new int[time];

            for (int i = 0; i < time; ++i){
                in[i] = scanner.nextInt();
            }

            int cmp[] = Arrays.copyOf(in,time);

            Arrays.sort(cmp);
            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0; i < time + 1; ++i){

                for (int j = 0; j < time + 1; ++j){
                    if (i == 0 || j == 0)
                        array[i][j] = 0;
                    else if (cmp[i-1] == in[j -1]){
                        array[i][j] = array[i-1][j-1] + 1;
                        if (list.size() == 0) {
                            list.add(in[j - 1]);

                        }
                        else if (in[j-1] > list.get(list.size()-1)) {

                            list.add(in[j - 1]);

                        }

                    }
                    else {
                        array[i][j] = Integer.max(array[i-1][j],array[i][j-1]);
                    }
                }

            }

            System.out.print(array[time][time]+" ");

            for (int i : list.subList(0,list.size()-1)){

                System.out.print(i + " ");
            }

            System.out.print(list.get(list.size()-1));


            System.out.println();

            time = scanner.nextInt();
        }
    }
}
