//
// Complete the code to write nested loops that make the following pattern of brackets:
//[][][][]
//[][][][]
//[][][][]
//

public class Drawings
{
   /**
    * Prints a rows by columns array of blocks ([])
    * @param rows the number of rows of []
    * @param columns the number of columns of []
    */
    public void blockPrinter(int rows, int columns)
    {
        //TODO print the specied number of rows and columns of []
        // 4 columns, 3 rows
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 4; j++)
            {
               //System.out.println(name.substring(0,i));
               System.out.print("[]");
            }
            System.out.println();
        }
    }
}
