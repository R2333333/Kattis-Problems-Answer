import java.util.LinkedList;
import java.util.Scanner;

public class AboveAverage {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();
        LinkedList<int []> classes = new LinkedList<>();
        float avg[] = new float[testcase];
        for (int i = 0; i < testcase; ++i){
            int p[]= new int[scanner.nextInt()];
            for (int j = 0; j < p.length; ++j) {
                p[j] = scanner.nextInt();
                avg[i] += p[j];
            }
            avg[i] /= (float) p.length;
            classes.add(p);
        }

        int count = 0;

        for (int i[]:classes){
            float passed = 0;
            for (float a : i){
                if (a > avg[count])
                    passed++;
            }
            System.out.println(String.format("%.3f", (passed/(float)i.length)*100)+"%");
            count++;
        }
    }

}
