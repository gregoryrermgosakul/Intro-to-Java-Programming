/* hw05_11
 * 
 * Complete this method to read integer scores from the user and find the average
 * Stop asking for input when the user enters a negative number.
 * Keep a running total and keep track of the number of entries
 * then find and return the average
 * Be sure not to divide by 0. Return 0 if no scores are entered
*/

import java.util.Scanner;

public class MathUtil
{
    public double averageScore()
    {
        //TODO Find and return the average of the numbers entered.
        Scanner in = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        double average = sum / count;
        System.out.print("Enter a score. -1 to quit: "); //use this for the prompt
        if (in.hasNextDouble()) // if input is a double
        {
            while (in.hasNextDouble()) // while input is a double
            {
                double value = in.nextDouble();
                if (value >= 0) 
                {
                    sum = sum + value;
                    count++;
                    System.out.print("Enter a score. -1 to quit: ");
                }
                else 
                {
                    return 0;
                }
            }
            System.out.printf("Average: %.2f\n", average);
        }
        else
        {
            System.out.println("Error: No input");
        }
        return average;
    }
}