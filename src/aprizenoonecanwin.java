
import java.util.*;

public class aprizenoonecanwin {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        ArrayList<Long> prizes= new ArrayList<>();
        long prizeWin = scanner.nextLong();

        for (int i = 0; i < size; ++i){
            prizes.add(scanner.nextLong());
        }

        scanner.close();

        Collections.sort(prizes);
        int num = 0;

        for (int i = 0; i < prizes.size(); ++i){
            if (prizes.get(i) > prizeWin && num > 0){
                break;
            }
            if (num == 0){
                num ++;
                continue;
            }
            if (prizes.get(i) + prizes.get(i-1) <= prizeWin)
                num++;

        }

        System.out.println(num);
     }
}
