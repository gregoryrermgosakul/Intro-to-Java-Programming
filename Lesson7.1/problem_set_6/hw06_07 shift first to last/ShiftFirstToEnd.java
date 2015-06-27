//
// Complete the given class to shift the first picture (the one at index 0)
// to the end of the array list and  display the pictures object in the modified list
// horizontally as was done in the lesson.
// You can find the pictures required in in the bluej project
//

import java.util.ArrayList;

public class ShiftFirstToEnd
{
   public static void main(String[] args)
   {
      ArrayList<Picture> gallery = new ArrayList<Picture>();
      gallery.add(new Picture("degas1.jpg"));
      gallery.add(new Picture("gaugin1.jpg"));
      gallery.add(new Picture("monet1.jpg"));
      gallery.add(new Picture("monet2.jpg"));
      gallery.add(new Picture("renoir1.jpg"));

      // TODO Write code to shift the first picture (the one at index 0)
      // to the end of the array list and  display the pictures object in the modified list
      // horizontally
      int rightmostX = 0;
       Picture first = gallery.remove(0);
       gallery.add(gallery.size(), first);
       for (Picture pic : gallery)
       {
            // TODO: Move the first picture to offset 10,
            // the second picture ten pixels to the right of the first one,
            // and so on
            pic.translate(rightmostX + 10, 0);
            rightmostX = pic.getMaxX();
            pic.draw();
       }
   }
}
