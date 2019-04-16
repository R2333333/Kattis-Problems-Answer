import java.util.*;

public class MuddyHike{
     private final static int MAX = 1000001;

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int dim[] = new int[2];
        int largest, currentRow, currentCol, nextRow, nextCol;
        currentCol = 0;
        currentRow = 0;


//        largest = 0;

        for (int i = 0; i < 2; ++i)
            dim[i] = scanner.nextInt();

        int path[][] = new int[dim[0]][dim[1]];
        scanner.nextLine();

        for (int i = 0; i < dim[0]; ++i){
            for(int j = 0; j < dim[1]; ++j){
                path[i][j] = scanner.nextInt();
            }
        }

        scanner.close();
//        smallest = path[0][0];
        largest = path[0][0];
//        System.out.println("?????");

        /*for(int j = 0; j < dim[0]; ++j){
            for (int i : path[j]) {
                System.out.print(i);
            }
            System.out.println();
        }*/

        for (int row = 0; row < dim[0]; ++row) {
            if (path[row][0] < largest) {
                largest = path[row][0];
                currentRow = row;
                currentCol = 0;
                path[row][0] = MAX;
            }
        }

//        System.out.println("!!!!"+ currentRow +"," + currentCol);

        /*for(int j = 0; j < dim[0]; ++j){
            for (int i : path[j]) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }*/

        while (true) {


            TreeMap<Integer, int[]> smallest = new TreeMap<>();

            if (currentRow + 1 < dim[0])
                smallest.put(path[currentRow + 1][currentCol],new int[]{currentRow + 1, currentCol});

            if (currentCol + 1 < dim[0])
                smallest.put(path[currentRow][currentCol + 1],new int[]{currentRow, currentCol + 1});

            if (currentRow - 1 >= 0) {
                if (!smallest.containsKey(path[currentRow - 1][currentCol]))
                    smallest.put(path[currentRow - 1][currentCol], new int[]{currentRow - 1, currentCol});
            }

            if (currentCol - 1 >= 0) {
                if (!smallest.containsKey(path[currentRow][currentCol-1]))
                    smallest.put(path[currentRow][currentCol - 1], new int[]{currentRow, currentCol - 1});

            }

            nextCol = smallest.firstEntry().getValue()[1];
            nextRow = smallest.firstEntry().getValue()[0];

            if (largest < path[nextRow][nextCol]){
                largest = path[nextRow][nextCol];
            }

            path[currentRow][currentCol] = MAX;
            currentRow = nextRow;
            currentCol = nextCol;

            if (currentCol == dim[1]-1) break;


        }

        System.out.println(largest);





    }

}