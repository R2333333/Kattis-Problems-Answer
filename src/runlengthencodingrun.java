import java.util.Scanner;

public class runlengthencodingrun {
    public static void main(String args[]){
        String input[]= new Scanner(System.in).nextLine().split(" ");
        StringBuilder out;
        if (input[0].matches("E"))
            out = encode(input[1]);
        else out = decode(input[1]);

        System.out.println(out);
    }

    private static StringBuilder decode(String in){

        StringBuilder out = new StringBuilder();

        for (int i = 0; i < in.length(); ++i){
            if (in.substring(i).matches("[0123456789].*")){
                int j = Integer.valueOf(in.substring(i, i + 1)) -1;
                while (j-- > 0){
                    out.append(out.charAt(out.length() -1));
                }

            }
            else out.append(in.substring(i, i + 1));
        }

        return out;
    }

    private static StringBuilder encode(String in){
        StringBuilder out = new StringBuilder();
        int num = 0;

        for (char c : in.toCharArray()){
            if (out.length() == 0){
                out.append(c);
                num++;
            }
            else if (c == out.charAt(out.length()-1)){
                num++;
            } else {
                out.append(num).append(c);
                num = 1;
            }
        }
        out.append(num);

        return out;
    }
}
