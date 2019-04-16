import java.util.Scanner;

public class palindromicpassword {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String out[] = new String[t];
        scanner.nextLine();

        for (int k = 0; k < t; ++k){
            String s = scanner.nextLine(), up, down;
            if (s.charAt(0) == s.charAt(5) && s.charAt(1) == s.charAt(4) &&
                s.charAt(2) == s.charAt(3))
                out[k] = (s);
            else {
                for (int i = Integer.valueOf(s);;++i){
                    up = String.valueOf(i);
                    if (up.length() > 6){
                        up = "999999";
                        break;
                    }
                    if (up.charAt(0) == up.charAt(5) && up.charAt(1) == up.charAt(4) &&
                            up.charAt(2) == up.charAt(3))
                        break;
                }

                for (int i = Integer.valueOf(s);;--i){
                    down = String.valueOf(i);
                    if (down.length() < 6){
                        down = "0";
                        break;
                    }

                    if (down.charAt(0) == down.charAt(5) && down.charAt(1) == down.charAt(4) &&
                            down.charAt(2) == down.charAt(3))
                        break;
                }
                out[k] = Math.abs(Integer.valueOf(up)-Integer.valueOf(s)) >
                         Math.abs(Integer.valueOf(down) - Integer.valueOf(s)) ?
                         down : (Math.abs(Integer.valueOf(up)-Integer.valueOf(s)) <
                         Math.abs(Integer.valueOf(down) - Integer.valueOf(s))) ?
                         up : down;
            }

        }

        for (String i : out){
            System.out.println(i);
        }

//        System.out.println(out.length);
    }
}
