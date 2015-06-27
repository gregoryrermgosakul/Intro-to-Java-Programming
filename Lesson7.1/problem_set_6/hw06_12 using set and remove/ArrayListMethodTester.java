//
// Complete this class. An array list of Strings called cities has been defined
// for you and partially populated. Add cod to do the following:
// 1. Add the string "New York so that it is first in the arraylist
// 2. replace the string "Dallas" (should be at index 2. Don't search) with "Houston"
// 3. remove last element in the list
// 4. print the arraylist
//
//

import java.util.ArrayList;
public class ArrayListMethodTester
{
   public static void main(String[] args)
   {
       ArrayList<String> cities = new ArrayList<String>();
       cities.add("Chicago");
       cities.add("Dallas");
       cities.add("San Jose");
       cities.add("Seattle");

       // TODO: Add code for steps 1-4 above
       cities.add(0, "New York"); // Adds New York so that it's first in the ArrayList
       cities.remove(2); // Removes Dallas from the ArrayList
       cities.add(2, "Houston"); // Adds Houston to position 2 in the ArrayList
       cities.remove(cities.size() - 1);
       // TODO: Print the arraylist
       System.out.println(cities);
       System.out.println("Expected: [New York, Chicago, Houston, San Jose]");
   }
}
