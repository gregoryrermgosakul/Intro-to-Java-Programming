// Complete the code below to print each letter in the string name followed by a space.

public class StringTester
{
   public static void main(String[] args)
   {
       String name = "Udacity";
       
       //TODO Complete the code below to print each letter in the string name followed by a space.
       //System.out.println(name.length());  // 0-6
       //System.out.println(name.substring(1,2)); // endIndex is up to, but not including
       
       for (int i = 0; i < name.length(); i++)
       {
           System.out.print(name.substring(i,i + 1) + " ");
           // System.out.print(name.charAt(i) + " ");
           
           // The .charAt() method is used to evaluate a String 1 character at a time.
       }
   }
}
