
/**
 * Complete the method to find the largest power of 2 less than the given number
 * Use a loop
 */
public class MathUtil
{
   public int largestPowerOf2(int n)
   {
        int largestPowerOf2; 
        int sum = 0; 
        int num = 0;
        while (sum < n)
        {
            sum = (int)Math.pow(2, num);
            num++;
        }
        return sum / 2;    
   }
    
}