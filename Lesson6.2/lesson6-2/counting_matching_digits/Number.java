// Bluej project: lesson6/counting_matches_digits
/**
 * A class that represents a number and can report
 * properties of the number.
 */
public class Number
{
    private long number;

    public Number(long number)
    {
        this.number = number;
    }

    /**
     * Returns the number of times digitToMatch appears
     * in this number.
     * @param digitToMatch the digit to search for.
     *   must be at least 0 and at most 9.
     * @return number of occurrences of digitToMatch
     */
    public int countMatchingDigits(int digitToMatch)
    {
        // TODO: count and return the number of times the given digit appears in the number

        // Hint: The last digit is (int)(numbers % 10).
        
        int counter = 0;
        long temp = number; // Think of it as taking the number to be evaluated from the main method and putting it into temporary memory
        while(temp > 0)
        {
            int digit = (int)(temp % 10); // Mod 10 to get only the digit to be evaluated
            if(digit == digitToMatch) // digitToMatch is the number 
            {
                counter++;
            }
            temp = temp / 10; // This is used to discard the number that has already been evaluated
        }
        return counter;
    }
}