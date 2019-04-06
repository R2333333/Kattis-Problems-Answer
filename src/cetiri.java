import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class cetiri {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int nums[]= new int[]{scanner.nextInt(),scanner.nextInt(),scanner.nextInt()};
        scanner.close();
        Arrays.sort(nums);

        if (nums[1] - nums[0] < nums[2]-nums[1]){
            System.out.print(nums[1] * 2 - nums[0]);
        } else if (nums[1] - nums[0] == nums[2]-nums[1])
            System.out.print(nums[2] * 2 - nums[1]);
        else System.out.print(nums[2]-nums[1] + nums[0]);

    }
}
