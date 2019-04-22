import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class oddities {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        int num = Integer.parseInt(bufferedReader.readLine());

        while (num-- > 0){
            int e = Integer.parseInt(bufferedReader.readLine());
            System.out.println(e + (e % 2 == 0? " is even" : " is odd"));
        }


    }
}
