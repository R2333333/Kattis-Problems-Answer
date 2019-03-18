import java.util.*;


public class RetionalSequence {
    public static void main(String args[]){
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



        //A more efficient way
        for ( int e : data.keySet()){
            System.out.println(e + " " + findLevel(data.get(e)));//data.get(e)[0] + "  "+ data.get(e)[1]);
        }

    }


    public static int findLevel(int array[]){
        if (array[0] == 1 && array[1] == 1){
            return 1;
        }


        if (array[0] < array [1]){
            int next[] = new int[2];
            next[0] = array[0];
            next[1] = array[1] - array[0];

            return findLevel(next) * 2;
        }else {
            int next[] = new int[2];
            next[1] = array[1];
            next[0] = array[0] - array[1];

            return findLevel(next) * 2 + 1;
        }


    }
}
