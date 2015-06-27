// Bluej project: lesson6/average

import java.util.Scanner;
// Write a program that helps a user compute their average time
// for sprinting 100 meters.
public class AverageDemo
{
    public static void main(String[] args)
    {
        // TODO: Collect values from the user until they enter a 0.
        // Track the sum of all the inputs so you can calculate the
        // average at the end
        Scanner in = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        double value;
        boolean done = false; // Used to guard the condition
        while (!done)
        {
            System.out.print("Enter a value, 0 to quit: ");
            value = in.nextDouble();
            if (value != 0) // If value is not equal to the Sentinel Value of 0
            {
                count++;
                sum = sum + value;
            }
            else // If it is
            {
                done = true; // Change done to true to exit the loop
            }
        }
        double average = sum / count;
        System.out.printf("Average: %.2f\n", average);
    }
}