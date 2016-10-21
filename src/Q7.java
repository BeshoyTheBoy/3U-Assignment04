
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author awadb3223
 */
public class Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a scanner
        Scanner input = new Scanner(System.in);

        //Ask user for speed limit and recorded speed
        System.out.println("Enter the Speed Limit");
        //Create speed limit variable
        int limit = input.nextInt();

        //Ask user for recorded speed of the car
        System.out.println("Enter the Recorded Speed of the Car");
        //Create recorded speed variable
        int speed = input.nextInt();

        //Create algorithm to determine if overspeeding
        if (speed < limit) {
            //tell user he is within speed limit
            System.out.println("Congrats! You are Within the Speed Limit.");
        }
        //Create algorithim to determine the fine while speeding
        //while speeding
        if (speed > limit) {
            //if the speed is less than or equal to 20 
            if (speed - limit <= 20) {
                System.out.println("You are overspeeding and your  fine is $100");
                //if the speed is greater than 21 and less than or equal to 30
            } else if (speed - limit > 21 && speed - limit <= 30) {
                System.out.println("You are overspeeding and your fine is $270");
                //if the speed is greater than 31
            } else if (speed - limit > 31) {
                System.out.println("You are overspeeding and your fine is $500");
            }
        }
    }
}
