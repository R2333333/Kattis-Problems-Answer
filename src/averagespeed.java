import java.util.Scanner;

public class averagespeed {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        double total = 0, currentS = 0, currT = 0;

        while (scanner.hasNextLine()){
            String in[]= scanner.nextLine().split(" ");

            String time[] = in[0].split(":");

            double nextT = (Double.valueOf(time[0])*3600 +
                    Double.valueOf(time[1]) * 60 + Double.valueOf(time[2]));

            total += currentS * (nextT - currT);
            currT = nextT;
//            if (currentS != 0){
//
//            }
            if (in.length == 2){
                currentS = Double.valueOf(in[1])/3600;
//                currT = (Double.valueOf(time[0])*3600 +
//                        Double.valueOf(time[1]) * 60 + Double.valueOf(time[2]));
            } else System.out.printf("%s %.2f km\n", in[0], total);

        }
    }
}
