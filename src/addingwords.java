import java.util.HashMap;
import java.util.Scanner;

public class addingwords {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        HashMap<String,String> map = new HashMap<>();

        while (scanner.hasNextLine()){
            String in = scanner.nextLine();
            if (in.equals("clear")) {
                map = new HashMap<>();
                continue;
            }

            String array[] = in.split(" ");

            if (array[0].compareTo("def") == 0){
                if (map.containsKey(array[1]))
                    map.remove(map.get(array[1]));

                map.put(array[1],array[2]);
                map.put(array[2],array[1]);
            } else if (array[0].compareTo("calc") == 0){
                System.out.print(in.substring(5) + " ");
                int ans = 0;
                String op = "";

                for (String s : array){
                    if (s.equals(array[0]))
                        continue;
                    if (s.equals("=")){
                        if (map.containsKey(String.valueOf(ans))) {
                            System.out.print(map.get(String.valueOf(ans)) + "\n");
                            break;
                        }
                        else {
                            System.out.print("unknown\n");
                            break;
                        }
                    }

                    if (op.equals("+")){
                        if (map.containsKey(s))
                            ans += Integer.valueOf(map.get(s));
                        else {
                            System.out.print("unknown\n");
                            break;
                        }
                        op = "";
                        continue;
                    }
                    if (op.equals("-")) {
                        if (map.containsKey(s))
                            ans -= Integer.valueOf(map.get(s));
                        else {
                            System.out.print("unknown\n");
                            break;
                        }
                        op = "";
                        continue;
                    }

                    if (s.equals("+")){
                        op = "+";
                    } else if (s.equals("-")){
                        op = "-";
                    } else {
                        if (map.containsKey(s))
                            ans = Integer.valueOf(map.get(s));
                        else {
                            System.out.print("unknown\n");
                            break;
                        }
                    }
                }
            }
        }
    }
}
