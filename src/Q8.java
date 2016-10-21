
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author awadb3223
 */
public class Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create scanner 
        Scanner input = new Scanner(System.in);

        //Create a variable to store the player's position
        int player = 1;

        //Create a loop to start and end the game
        while (player < 100) {
            //ask user for sum of dice
            System.out.println("Enter Sum of Dice");
            
            //Store value in a dice variable
            int dice = input.nextInt();
            
            //if the dice is 0 then terminate
            if (dice < 2 || dice > 12) {
                System.out.println("You Quit!");
                break;
            }
            //get the player to move by adding dice with player
            player = player + dice;
            
            //make if statement in case player lands on ladder or snake
            if (player == 9) {
                System.out.println("Ladder!");
                player = player + 25;
            }
            if (player == 40) {
                System.out.println("Ladder!");
                player = player + 24;
            }
            if (player == 67) {
                System.out.println("Ladder!");
                player = player + 19;
            }
            if (player == 54) {
                System.out.println("Snake!");
                player = player - 35;
            }
            if (player == 90) {
                System.out.println("Snake!");
                player = player - 42;
            }
            if (player == 99) {
                System.out.println("Snake!");
                player = player - 22;
            }
            if (player == 100) {
                System.out.println("You Win! GG! No Re! WP!");
                break;
            }
            
            //tell player where he is on the board
            System.out.println("You are now on square " + player);

        }
    }
}