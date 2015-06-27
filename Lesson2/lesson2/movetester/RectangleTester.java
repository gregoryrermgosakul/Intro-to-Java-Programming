public class RectangleTester
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle(45, 90, 60, 90);
        box.grow(20, 20);
        System.out.println(box.getX());
        System.out.println("Expected: 25");
        System.out.println(box.getY());
        System.out.println("Expected: 70");
        System.out.println(box.getWidth());
        System.out.println("Expected: 100");
        System.out.println(box.getHeight());
        System.out.println("Expected: 130");
    }
}
