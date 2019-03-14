import java.util.Scanner;

public class BabylonianNumbers {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        String in[] = new String[count];

        input.nextLine();

        for(int i = 0; i < count; ++i)
            in[i] = input.nextLine();

        for(String s: in){
            long output = 0;


            String array[] = s.split(",", -1);

            for (int i = 0; i < array.length; ++i){
                if (!array[i].equals(""))
                    output += Long.valueOf(array[i]) * Math.pow(60, array.length-i-1);
            }

            System.out.println(output);
        }
    }

}
