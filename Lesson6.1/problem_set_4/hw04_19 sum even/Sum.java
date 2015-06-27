
/**
 * Complete the method to find sum of all the positive even numbers less than or equal to the given number
 * use a loop
 */
public class Sum
{
   /**
    * Gets the sum of all the even numbers less than or equal to the given number
    * @param n the given number, the ceiling
    * @return the sum of all the even numbers less that the ceiling
    */
   
    public int sum(int n)
   {
        int sum = 0;
        int ceiling = 20;
        for(int i = 0; i <= n; i = i + 2)
        {
            sum = sum + i;
            
        }
        return sum;
   }
}