//Implement a class Balloon that models a spherical balloon that is being filled with air.  
//The constructor constructs an empty balloon (That is, the volume is 0).

//Supply these methods: 
//	void addAir(double amount) adds the given amount of air
//	double getVolume() gets the current volume
//	double getSurfaceArea() gets the current surface area
//	double getRadius() gets the current radius

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 3 - Question 3" for some tips on 
// how to begin. 

//See this link for formulas for volume and surface area: 
//    http://math.about.com/od/formulas/ss/surfaceareavol.htm 

//Hints
//	You can find the nth root of a number by using the pow method from the Math class 
//  where the exponent is 1/n.
//	You will need to solve the volume formula for radius.


/**
 * models a spherical balloon that is being filled with air
 */
public class Balloon
{
    private double volume;
    private double radius;
    private double surfaceArea;
    private double air;

    /**
     * Constructor for objects of class Balloon
     */
    public Balloon()
    {
        
    }
    
    void addAir(double amount)
    {
        this.air = this.air + amount;
    }
    
    double getRadius() //gets the current radius
    {
        radius = Math.pow((this.air/Math.PI)*(3.0/4.0),1.0/3);
        return radius;
    }
    
    double getSurfaceArea()
    {
        surfaceArea = 4.0 * Math.PI * Math.pow(radius,2);
        return surfaceArea;
    }

    /**
     * Gets the volume of the Balloon
     * 
     * @return    the volume of this balloon
     */
    public double getVolume()
    {
        volume = (4.0/3.0) * Math.PI * Math.pow(radius,3);
        return volume;
    }
}
