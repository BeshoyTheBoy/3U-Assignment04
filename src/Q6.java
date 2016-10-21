
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author awadb3223
 */
public class Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create Scanner input
        Scanner input = new Scanner(System.in);






        //Ask user for information
        System.out.println("Number of Daytime Minutes?");
        //Daytime Variable
        double daymin = input.nextDouble();

        System.out.println("Number of Evening Minutes?");
        //Evening Variable
        double evemin = input.nextDouble();

        System.out.println("Number of Weekend Minutes?");
        //Weekend Variable
        double endmin = input.nextDouble();

        //Create variables to store Costs 
        //Plan A
        double PlanA = 0;
        //Day
        double costA1 = 0;
        //Evening
        double costA2 = 0;
        //Weekend
        double costA3 = 0;

        //Plan B
        double PlanB = 0;
        //Day
        double costB1 = 0;
        //Evening
        double costB2 = 0;
        //Weekend
        double costB3 = 0;



        //**Split Into Plans**

        //Plan A          
        //DAY
        if (daymin > 100) {
            costA1 = (daymin - 100) * 0.25;
        }
        //EVE
        costA2 = evemin * 0.15;
        //WEEKEND
        costA3 = endmin * 0.20;

        //Add up how much plan A costs 
        PlanA = costA1 + costA2 + costA3;


        //Plan B
        //DAY
        if (daymin > 250) {
            costB1 = (daymin - 250) * 0.45;
        }
        //EVE
        costB2 = evemin * 0.35;
        //WEEKEND   
        costB3 = endmin * 0.25;

        //Add up how much Plan B costs
        PlanB = costB1 + costB2 + costB3;


        //Tell the user the results
        System.out.println("Plan A Costs " + PlanA);
        System.out.println("Plan B Costs " + PlanB);

        //tell them which is better option
        if (PlanA > PlanB) {
            System.out.println("Plan B is cheaper");
        }
        if (PlanA < PlanB) {
            System.out.println("Plan A is cheaper");
        }
        if (PlanA == PlanB) {
            System.out.println("Plan A and B are the Same Price");
        }

    }
}