//This problem will use the same data as the previous one. This time you are
//to complete the TemperatureDifferenceCalculator. It has two methods:
//
//public double maxDifference() - Calculates the maximum difference between
//any two consecutive day. If Jan 7 temperature is 5 degrees and
//Jan 8 is -10 degrees, the difference in the two temperatures is 15.
//The temperature changed 15 degrees between on day and the next. The difference
// is always the absolute value..
//
//public double minDifference() - Calculates the maximum difference between
//any two consecutive day
//
//For the draft, provide the method stubs (in this case the headers and
//a return value of 0)

public class TemperatureDifferenceCalculator
{
    private double[] data;

    /**
     * Constructs a TemperatureDifferenceCalculator with the given array
     * @param the array to process
     */
    public TemperatureDifferenceCalculator(double[] list)
    {
        data = list;
    }

    /**
     * Gets the maximum difference between any two consecutive values
     * @return the maximum difference
     */

      // TODO: add the stub for the maxDifference method. That is the header, the braces, and the return statement
    public double maxDifference()
    {
          double maxDiff = 0;
          for(int i = 0; i< data.length - 1; i++)
          {
              double valueOne = data[i];
              double valueNext = data[i + 1];
              double difference = Math.abs(valueNext - valueOne);
              if(difference > maxDiff)
              { 
                  maxDiff = difference;
              }
          }
          return maxDiff;
    }
      
    /**
     * Gets the minimum difference between any two consecutive values
     * @return the minimum difference
     */

    // TODO: add the stub for the minDifference method. That is the header, the braces, and the return statement
    public double minDifference()
    {
        double minDiff = Math.abs(data[1] - data[0]);
        for(int j = 0; j < data.length - 1; j++)
        {
            double today = data[j];
            double tomorrow = data[j+1];
            double more = Math.abs(tomorrow - today);
            if(more < minDiff)
            { 
                minDiff = more;
            }
        }
        return minDiff;
    }
}
