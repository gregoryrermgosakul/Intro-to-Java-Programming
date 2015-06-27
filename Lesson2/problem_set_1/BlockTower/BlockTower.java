//Complete the code in the class BlockTower to draw a tower of blocks
//that looks like the one at the link below.  Each block has a width of 40
//and a height of 30. There are three rows.
//The upper left-hand corner of the bottom row is at (20, 70)

//Create a custom color for the topmost color where red = 125, green=125, blue = 255.
//For all the other colors, use predefined colors.
//The colors from top to bottom are: custom color, RED, PINK, BLUE, MAGENTA, CYAN,

//For the draft, draw the first rectangle in the bottom row.

//For the final, draw the whole tower.

public class BlockTower
{
   public static void main(String[] args)
   {
       //bottom row
       Rectangle box = new Rectangle(20, 70, 40, 30);
       box.setColor(Color.BLUE);
       box.fill();
       Rectangle box2 = new Rectangle(60, 70, 40, 30);
       box2.setColor(Color.MAGENTA);
       box2.fill();
       Rectangle box3 = new Rectangle(100, 70, 40, 30);
       box3.setColor(Color.CYAN);
       box3.fill();
       Rectangle box4 = new Rectangle(40, 40, 40, 30);
       box4.setColor(Color.RED);
       box4.fill();
       Rectangle box5 = new Rectangle(80, 40, 40, 30);
       box5.setColor(Color.PINK);
       box5.fill();
       Rectangle box6 = new Rectangle(60, 10, 40, 30);
       box6.setColor(new Color(125,125,255));
       box6.fill();
   }
}
