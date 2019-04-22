import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class piglatin {
    public static void main(String args[]) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));

        String line = scanner.readLine();

        while (line != null){

            String sentence[] = line.split(" ");
            StringBuilder out = new StringBuilder();

            String vowal = "[aeiouy].*";

            for (String s : sentence){

                    StringBuilder back = new StringBuilder();
                    for (int i = 0; i < s.length(); ++i) {
                        if (!s.substring(i).matches(vowal)) {
                            back.append(s.charAt(i));

                        } else {

                            if (i == 0) out.append(s).append("yay");
                            else out.append(s.substring(i)).append(back).append("ay");

                            break;
                        }
                    }
                    out.append(" ");
            }

            out.append("\n");
            System.out.print(out);
            line = scanner.readLine();
        }

    }
}
