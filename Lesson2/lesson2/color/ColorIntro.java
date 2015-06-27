public class ColorIntro
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle(60, 90, 20, 30);
        box.draw();
        Rectangle box2 = new Rectangle(80, 90, 20, 30);
        box2.draw();
        Rectangle box3 = new Rectangle(100, 90, 20, 30);
        box3.draw();
        Rectangle box4 = new Rectangle(120, 90, 20, 30);
        box4.draw();
        box.setColor(new Color(0, 255, 255));
        box.fill();
        box2.setColor(new Color(255, 255, 0));
        box2.fill();
        box3.setColor(new Color(255, 0, 255));
        box3.fill();
        box4.setColor(new Color(255, 255, 255));
        box4.fill();
    }
}
