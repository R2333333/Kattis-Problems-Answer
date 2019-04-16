import java.util.*;

public class busyschedule {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> out = new ArrayList<>();

        for (;;){
            int num = scanner.nextInt();

            if (num == 0)
                break;
            scanner.nextLine();

            TreeMap<Integer,String> morning = new TreeMap<>(), after = new TreeMap<>();

            for (int i = 0; i < num; ++i){
                String t = scanner.nextLine(), time[]= t.split(" ");


                int h = Integer.valueOf(time[0].split(":")[0]),
                        m = Integer.valueOf(time[0].split(":")[1]),
                        tt = (h == 12)? m : h*60+m;



                if (time[1].compareTo("a.m.") == 0){
                    if (morning.containsKey(tt))
                        morning.put(tt, morning.get(tt)+"\n"+t);
                    else
                        morning.put(tt, t);
                } else {

                    if (after.containsKey(tt)) {
                        after.put(tt, after.get(tt) + "\n" + t);
                    } else
                        after.put(tt, t);

                }
            }

            for (int i : morning.keySet()){
                out.add(morning.get(i));
            }

            for (int a : after.keySet()){
                out.add(after.get(a));
            }

            out.add("\n");

        }

        for (String o : out)
            System.out.println(o);

    }
}
