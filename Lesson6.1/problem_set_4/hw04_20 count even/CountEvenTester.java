//hw04_20
/**
 * Complete the class. Using a Scanner, ask the user to enter a series of integers
 * and count the number of even numbers
 * Use a loop. Do not let bad input (a non-integer) terminate your program with an error.
 * When the user enters any non-integer, print the number of even integers entered and quit.
 * Hint: remember hasNextInt()
 * Hint: use the % operator to determine if a number is even
 */
import java.util.Scanner;
public class CountEvenTester
{
   public static void main(String[] args)
   {
       int even = 0;
       int odd = 0;
       Scanner in = new Scanner(System.in);
       System.out.print("Enter an integer: ");
       
       while(in.hasNextInt())
       {
           int numbers = in.nextInt();
           if(numbers % 2 == 0)
           {
               even++;
               System.out.print("Enter an integer: ");
           }
           else
           {
               odd++;
               System.out.print("Enter an integer: ");
           }
       }
       System.out.println(even);

   }
}