import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class simonsays {
    public static void main(String args[]) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        int t = Integer.parseInt(scanner.readLine());

        while (t-- > 0){
            String o = scanner.readLine();
            if (o.startsWith("Simon says "))
                System.out.println(o.substring(11));
        }
    }
}
