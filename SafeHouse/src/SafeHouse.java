import java.util.LinkedList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Collections;

public class SafeHouse {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        input.nextLine();
        char grid[][] = new char[size][size];


        for (int i = 0; i < size; ++i){
            grid[i] = input.nextLine().toCharArray();
        }
        input.close();




        LinkedList<Integer> max = new LinkedList<>();
        HashMap<Integer, LinkedList<Integer>> sMap = new HashMap<>();
        HashMap<Integer, LinkedList<Integer>> hMap = new HashMap<>();



        for (int i = 0; i < size; ++i){
            for (int j = 0; j < size; ++j){
                if (grid[i][j] == 'H'){
                    if (hMap.containsKey(i))
                        hMap.get(i).add(j);
                    else {
                        LinkedList<Integer> hlist = new LinkedList<>();
                        hlist.add(j);
                        hMap.put(i,hlist);
                    }
//                    System.out.println("H"+i+","+j);
                }
                if (grid[i][j] == 'S'){

                    if (sMap.containsKey(i))
                        sMap.get(i).add(j);
                    else {
                        LinkedList<Integer> slist = new LinkedList<>();
                        slist.add(j);
                        sMap.put(i,slist);
                    }
//                    System.out.println(i+","+j);
                }
            }
        }

        int nearest = 2*size;


        for (int sx : sMap.keySet()){

            for (int sy : sMap.get(sx)){

                for (int hx : hMap.keySet()){

                    for (int hy : hMap.get(hx)){
                        if ( Math.abs(sx-hx) + Math.abs(sy - hy) < nearest)
                            nearest = Math.abs(sx-hx) + Math.abs(sy - hy);
                    }

                }


            }

            max.add(nearest);

            nearest = 2*size;
        }

        Collections.sort(max);

        System.out.print((max).getLast());

 

    }
}
