// lesson6/triangle_pattern
//
// Write nested loops that make the following pattern of brackets
// (Use the numberOfRows variable so it can easily be modified
// to print any number of rows): 
// []
// [][]
// [][][]
// [][][][]
// [][][][][]

// If numberOfRows were 6, the pattern would be: 
// []
// [][]
// [][][]
// [][][][]
// [][][][][]
// [][][][][][]
public class TrianglePattern
{
    public static void main(String[] args)
    {
        // Please do not modify this line. 
        int numberOfRows = 5;
        
        for (int row = 1; row <= numberOfRows; row++)
        {
            for (int column = 1; column <= row; column++)
            {
                System.out.print("[]");
            }
            System.out.println();
        }
        // YOUR CODE HERE
        // Use nested for loops to print the triangle pattern. 
        // Please use the variable numberOfRows to control how many
        // rows you print.
        // Note: the desired number of columns depends on which row
        // you are printing. 
        
    }
}