import java.util.HashMap;
import java.util.Scanner;

public class recount {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String out = "Runoff!", in = scanner.nextLine();
        int max = 0;
        HashMap<String, Integer> map = new HashMap<>();

        while (in.compareTo("***") != 0){
            if (! map.containsKey(in)){
                map.put(in, 1);
            } else {

                int v = map.get(in) + 1;
                map.put(in, v);
                if (v > max){
                    out = in;
                    max = v;
                } else if (v == max){
                    out = "Runoff!";
                }
            }

            in = scanner.nextLine();
        }

        System.out.println(out);

    }
}
