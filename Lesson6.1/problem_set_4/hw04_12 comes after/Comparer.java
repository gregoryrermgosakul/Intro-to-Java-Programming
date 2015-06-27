
/**
 * Complete the method to return true if the parameter comes after "Udacity" in
 * lexicographic order
 */
public class Comparer
{
    /**
     * Determine if the string comes after "Udacity" in lexicographic order
     * @param string1 the first string
     * @return true if string1 comes after "Udacity' in lexicographic order.
     * Otherwise return false
     */
    public boolean comesAfter(String string1)
    {
        boolean trueFalse;
        String string2 = "Udacity";
        if(string1.compareTo(string2) > 0)
        {
            trueFalse = true;
        }
        else
        {
            trueFalse = false;
        }
        return trueFalse;

    }
}