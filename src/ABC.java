import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ABC {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int nums[] = new int[3];
        String abc[] = new String[3];

        for (int i = 0; i < 3; ++i)
            nums[i] = input.nextInt();

        input.nextLine();


        abc = input.next().split("", -1);

        input.close();

        Arrays.sort(nums);

        HashMap<String, Integer> map = new HashMap<>();

            map.put("A", nums[0]);
            map.put("B", nums[1]);
            map.put("C", nums[2]);


        for (int i = 0; i < 2; ++i)
            System.out.print(map.get(abc[i]) + " ");

        System.out.print(map.get(abc[2]));

    }
}
