import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
      Main game = new Main();
      game.sum();
    }
    public int input(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = inp.nextInt();
        return number;
    }
    public void sum(){
        int max = input();
        int overall = 0;
        for (int start = 0; start <= max; start++) {
            overall += start;
        }
        System.out.println(overall);
    }

}
