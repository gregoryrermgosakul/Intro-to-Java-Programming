
//
// Complete the methods below. These methods manipulate Arrays of Strings
// For the draft, complete the first method
//
import java.util.Arrays;
public class ArrayMethods
{
    String[] list; //instance variable
    /**
     * Constructor for objects of class ArrayMethods
     */
    public ArrayMethods(String[] list)
    {
        // initialise instance variables
        this.list = list;
    }

    /**
     * Determines if the array is sorted (do not sort)
     * When Strings are sorted, they are in alphabetical order
     * Use the compareTo method to determine which string comes first
     * You can look at the String compareTo method in the Java API
     * @return true if the array  is sorted else false.
     */
    public boolean isSorted()
    {
        boolean sorted = true;

        // TODO: Write the code to loop through the array and determine that each
        // successive element is larger than the one before it
        for (int i = 0; i < list.length - 1; i++)
        {
            if (list[i].compareTo(list[i + 1]) < 0)
            {
                sorted = true;
            }
            else
            {
                sorted = false;
                break;
            }
        }
        return sorted;
    }

    /**
     * Replaces all but the first and last with the larger of its to neighbors
     * You can use the compareTo to determine which string is larger (later in alphabetical
     * order.
     * @return a string representation of the array list. (do this with list.toString()
     */
    public void replaceWithLargerNeighbor()
    {
        for (int i = 1; i <= list.length - 2; i++)
        {
            if (list[i].compareTo(list[i + 1]) < 0)
            {
                list[i] = list[i + 1];
            }
            else
            {
                break;
            }
        }
    }

    /**
     * Gets the number of duplicates in the list.
     * (Be careful to only count each duplicate once. Start at index 0. Does it match any of the other element?
     * Get the next word. It is at index i. Does it match any of the words with index > i?)
     * @return the number of duplicate words in the list
     */
    public int countDuplicates()
    {
        int duplicates = 0;
        
        for (int i = 0; i < list.length - 1;i++)
        {
            boolean found = false;
            
            for (int j = i + 1; !found && j < list.length; j++)
            {
                if (list[i].equals(list[j]))
                {
                found = true;
                duplicates++;
                }
            }
        }
        return duplicates;
    }

    /**
     * Moves any word that starts with x, y, or z to the front of the arraylist, but
     * otherwise preserves the order
     */
    public void xyzToFront()
    {
        int matches = 0;
        int nonMatches = 0;
        String[] newList = new String[list.length];
        
        for(int i = 0; i < list.length; i++)
        {
            if("XYZxyz".contains(list[i].substring(0,1)))
            {
                matches++;
                newList[matches - 1] = list[i];
            }
            else
            {
                nonMatches++;
                newList[2 + nonMatches] = list[i];
            }
        }
        list = newList;
    }

    /**
     * gets the string representation of this array list
     * @returns the string representation of this array list in
     * standard collectiuon format
     */
    public String toString()
    {
        return Arrays.toString(list);
    }
}