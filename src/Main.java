import java.util.*;
import java.lang.Integer;


public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        double tankSize = 0;
        double mpGallon = 0;
        double costGas = 0;
        double costPerMiles = 0;
        double range;
        String trash = "";



        System.out.println("Enter the gallons of gas in the tank: ");
        if (kb.hasNextDouble())
        {
            tankSize = kb.nextDouble();
        }
        else
        {
            trash = kb.nextLine();
            System.out.println("You entered " + trash +". Please enter restart the program and enter a valid option.");
        }

        System.out.println("Enter the fuel efficiency in miles per gallon: ");
        if (kb.hasNextDouble())
        {
            mpGallon = kb.nextDouble();
        }
        else
        {
            trash = kb.nextLine();
            System.out.println("You entered " + trash +". Please enter restart the program and enter a valid option.");
        }


        System.out.println("Enter the price of gas per gallon: ");
        if (kb.hasNextDouble())
        {
            costGas = kb.nextDouble();
        }
        else
        {
            trash = kb.nextLine();
            System.out.println("You entered " + trash +". Please enter restart the program and enter a valid option.");
        }

        costPerMiles = 100 / mpGallon * costGas;
        range = tankSize * mpGallon;

        System.out.println("The cost per 100 miles is " + costPerMiles + " and the range is " + range);



    }
}