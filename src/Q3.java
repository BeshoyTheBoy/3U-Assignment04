
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author awadb3223
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create input for user
        Scanner input = new Scanner(System.in);

        //Ask user for the 4 numbers
        System.out.println("Hey, please enter four numbers on separate lines");

        //get the numbers from user
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        double number4 = input.nextDouble();

        //tell him the numbers in one line
        System.out.println("Cool, your numbers are " + number1 + ", " + number2 + ", " + number3 + ", and " + number4);
    }
}
