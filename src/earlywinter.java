import java.util.Scanner;

public class earlywinter {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int nums = scanner.nextInt(), comp = scanner.nextInt(), count = 0;

        String s = "";

        for (int i = 0; i < nums; ++i){
            if (scanner.nextInt() <= comp) {
                s = ("It hadn't snowed this early in " + count + " years!");
                break;
            }
            else ++count;
        }

        System.out.println((count == nums)? "It had never snowed this early!" : s);

    }


}
