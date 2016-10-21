
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author awadb3223
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create input for the user
        Scanner input = new Scanner(System.in);

        //Ask user for the number
        System.out.println("Please inter value you wish to convert");

        //Get the number from the user
        double inches = input.nextDouble();

        double cm = inches * 2.54;

        //Tell the user the answer
        System.out.println("That's " + cm + "cm");


    }
}
