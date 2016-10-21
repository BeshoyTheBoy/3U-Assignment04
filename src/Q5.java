
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author awadb3223
 */
public class Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create input for user
        Scanner input = new Scanner(System.in);

        //Ask user for their name
        System.out.println("Please enter your name");

        //store user's name
        String name = input.nextLine();

        //Ask for user's test (out of what)
        System.out.println("What was your first test out of?");
        //store that value
        Double test1 = input.nextDouble();
        //Ask for user's test result
        System.out.println("What was your mark?");
        //store that value
        Double result1 = input.nextDouble();
        //find percentage
        double percent1 = (result1 / test1) * 100;


        //Ask for user's test (out of what)
        System.out.println("What was your second test out of?");
        //store that value
        Double test2 = input.nextDouble();
        //Ask for user's test result
        System.out.println("What was your mark?");
        //store that value
        Double result2 = input.nextDouble();
        //find percentage
        double percent2 = (result2 / test2) * 100;


        //Ask for user's test (out of what)
        System.out.println("What was your third test out of?");
        //store that value
        Double test3 = input.nextDouble();
        //Ask for user's test result
        System.out.println("What was your mark?");
        //store that value
        Double result3 = input.nextDouble();
        //find percentage
        double percent3 = (result3 / test3) * 100;


        //Ask for user's test (out of what)
        System.out.println("What was your fourth test out of?");
        //store that value
        Double test4 = input.nextDouble();
        //Ask for user's test result
        System.out.println("What was your mark?");
        //store that value
        Double result4 = input.nextDouble();
        //find percentage
        double percent4 = (result4 / test4) * 100;


        //Ask for user's test (out of what)
        System.out.println("What was your fifth test out of?");
        //store that value
        Double test5 = input.nextDouble();
        //Ask for user's test result
        System.out.println("What was your mark?");
        //store that value
        Double result5 = input.nextDouble();
        //find percentage
        double percent5 = (result5 / test5) * 100;


        //Calculate total average of percents
        double average = (percent1 + percent2 + percent3 + percent4 + percent5) / 5;

        //Show the user individual averages
        System.out.println("Test scores for " + name);

        System.out.println("Test 1: " + percent1 + "%");
        System.out.println("Test 2: " + percent2 + "%");
        System.out.println("Test 3: " + percent3 + "%");
        System.out.println("Test 4: " + percent4 + "%");
        System.out.println("Test 5: " + percent5 + "%");

        //show total average
        System.out.println("Student Average: " + average + "%");
    }
}
