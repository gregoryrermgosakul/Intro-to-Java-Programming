public class UglyFractionCalculator
{
    
    public double uglyFraction(double x, double y) 
    {
        // YOUR CODE HERE
        // Use the link to get to the slide with the mathematical expession for
        // ugly fraction.
        return (y / (x*(1 + x)));
    }
    
    public double uglierFraction(double x) 
    {
        // YOUR CODE HERE
        // Use the link to get to the slide with the mathematical expession for
        // uglier fraction.
        return (2 + x * (3 * x - 4)) / ((x + 2) * x);
    }
    
    public double average(double a, int b, int c, int d) 
    {
        // YOUR CODE HERE
        // Use the link to get to the slide with the mathematical expession for
        // average.
        return (double) ((a+b+c+d) / 4.0);
    }
}
