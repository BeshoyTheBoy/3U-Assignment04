
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author awadb3223
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create input for the user
        Scanner input = new Scanner(System.in);

        //ask for user's name
        System.out.println("What's Up? What's your name?");

        //get name from user
        String name = input.nextLine();

        //Greet user 
        System.out.println("Hey " + name + ", How are you today?");


    }
}
