import java.util.LinkedList;
import java.util.Scanner;

public class bishops {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> nums = new LinkedList<>();
        while (scanner.hasNext()){
            int in = scanner.nextInt();
            if (in == 1)
                nums.add(1);
            else
            nums.add(in*2 -2);
        }
        for (int i : nums)
            System.out.println(i);
    }

}
