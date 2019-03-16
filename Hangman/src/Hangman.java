import java.util.Scanner;

public class Hangman {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String question = input.nextLine();
        String ans = input.nextLine();
        input.close();

        int num = 10;

        for (int i = 0; i < ans.length()-1; ++i){
            if (question.contains(ans.substring(i,i+1))){
                question = question.replace(ans.substring(i,i+1),"");
            }else {
                num--;
            }

            if (question.length() == 0){
                System.out.println("WIN");
                break;
            }

            if (num == 0){
                System.out.println("LOSE");
                break;
            }
        }

//        question = question.replaceAll("N","");


    }
}
