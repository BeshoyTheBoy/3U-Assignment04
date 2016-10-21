
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author awadb3223
 */
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create input for user
        Scanner input = new Scanner(System.in);

        //Ask User for price of food
        System.out.println("How much does the food cost?");

        //Store that value
        double food = input.nextDouble();

        //Ask User for price of DJ
        System.out.println("How much does the DJ cost?");

        //Store that value
        double dj = input.nextDouble();

        //Ask User for price of Hall
        System.out.println("How much does the hall rent cost?");

        //Store that value
        double hall = input.nextDouble();

        //Ask User for price of Decorations
        System.out.println("How much do the decorations cost?");

        //Store that value
        double decore = input.nextDouble();

        //Ask User for price of Staff
        System.out.println("How much does the staff cost?");

        //Store that value
        double staff = input.nextDouble();

        //Ask User for price of Misc
        System.out.println("How much for misc. costs?");

        //Store that value
        double misc = input.nextDouble();

        //create algorithm to find total and number of tickets needed to sell
        double total = misc + staff + decore + hall + dj + food;

        double tickets = total / 35;

        //round up number of tickets
        tickets = Math.ceil(tickets);

        //Tell the user the total and tickets 
        System.out.println("Ok, so the total cost would be " + total + ", and the number of tickets needed to be sold are about " + tickets);


    }
}
