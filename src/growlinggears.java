import java.util.Scanner;

public class growlinggears {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        int out[] = new int[times];

        for (int i = 0; i < times; ++i){
            int cases = scanner.nextInt(); double max = 0;
            for (int j = 0; j < cases; ++j){
                double a = scanner.nextInt(),
                        b = scanner.nextInt(),
                        c = scanner.nextInt(), x = b/(2*a), y = -a*Math.pow(x,2)+b*x+c;
                if (y > max){
                    max = y;
                    out[i] = j+1;
                }

            }
        }
        for (int i : out)
            System.out.println(i);
    }
}
