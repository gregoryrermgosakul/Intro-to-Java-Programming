// What should an Assignment do?
// How do you want to use it for this program?
// You can put any code related to the Assignment class you
// want in here.

public class Assignment
{
    private String description;
    private int priority;
    
    public Assignment(String description, int priority)
    {
        this.description = description;
        this.priority = priority;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public int getPriority()
    {
        return priority;
    }
}
