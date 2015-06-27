/*Complete the given code to compute the sum of all odd digits of a integer.
 * 
 * The integer may be positive or negative. (For example, if the input is 32677,
 * the sum would be 3 + 7 + 7 = 17.)
 * 
 * HINT: Use a method of the Math class to get the absolute value of the parameter
 * For the draft, print out the digits all on one line, separated by a space.
 * Print a zero as the last number and return 0. If the input is 32677, the output will be
 * 3 2 6 7 7 0
 * 
 */

public class MathUtil
{
   /**
    * Gets the sum of all the odd digits in the parameter
    * @param n the number to use
    * @return the sum of the odd digits.
    */

   public int sumOfOdd(int n)
   {
      //TODO calculate and return the sum of the odd digits
      int sum = 0; // Initialize the variable sum to zero
      while (Math.abs(n) > 0) // While the absolute value of n is greater than zero
      {
         // Declare variable digit, assign it absolute value of n Mod 10, to get single digit
         int digit = Math.abs(n) % 10; 
         n /= 10; // Divide n by 10 to discard the evaluated digit
         if (digit % 2 == 1) // If the digit is odd.  If the remainder is 1, then the digit is odd
         {
             sum += digit; // sum = sum + digit;
         }
      }
      return sum;
   }
}
