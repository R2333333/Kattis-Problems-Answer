import java.util.Scanner;

public class wertyu {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String letters = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";

        while (scanner.hasNextLine()){
            String s = scanner.nextLine(), out = "";
            for (char c : s.toCharArray()){
                if (c == ' ')
                    out += ' ';
                else out += letters.charAt(letters.indexOf(c)-1);
            }

            System.out.println(out);
        }

    }
}
