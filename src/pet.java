import java.util.Scanner;

public class pet {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int max = 0, num = 0;

        for (int i = 0; i < 5; ++i){
            int score = 0;
            for (int j = 0; j < 4 ;++j){
                score += scanner.nextInt();
            }
            if (score >= max){
                max = score;
                num = i + 1;
            }
        }

        System.out.println(num+" "+max);
    }
}
