import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        Scanner sc = new Scanner(System.in);

        int gold = rand.nextInt(20,100);
        int bet;
        while(gold > 0){
            System.out.println("Your gold is " + gold);
            do{
                System.out.println("How much would you like to bet? ");
                bet = sc.nextInt();
            }while(bet<=0 && bet>= gold);
            gold -= bet;
            int roll = rand.nextInt(101);
            System.out.println("You rolled a: " + roll);
            if(roll <= 54) {
                System.out.println("You lost");
            }else if(roll >= 55 && roll < 100){
                gold += (bet*2);
                System.out.println("You won! you earn double your bet");
            } else if (roll == 100) {
                gold += (bet*3);
                System.out.println("Big win! you earn triple you bet");
            }
        }

    }
}