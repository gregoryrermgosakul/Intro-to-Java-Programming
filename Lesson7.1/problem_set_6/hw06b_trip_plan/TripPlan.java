//
//Complete the class TripPlan which describes the cities that are visited by a tour conducted by Java Now Tours.
//Keep an arraylist of cities (just the string name). Have methods to add a city, remove a city,
//to return the names of the cities in a String, and to reverse the order of the elements in the array list.
//
//Notice that the reverse method is void.

//
//For the draft, provide the instance variable and finish the constructor.
//For the toString method simply return the string "TripPlan["
//

import java.util.ArrayList;

/**
 * A TripPlan represents a trip and holds a collection of city names.
 */
public class TripPlan
{
    // TODO: add instance variable here
    ArrayList<String> city = new ArrayList<String>();
    /**
     * Constructs an empty trip.
     */
    public TripPlan()
    {
        // TODO: Initialize the instance variable
        
    }

    /**
     * Add a city to the list.
     * @param cityName the city to add
     */
    public void addCity(String cityName)
    {
        // TODO: Write code to add a city to the array list instance variable
        city.add(cityName); 
    }

    /**
     * Returns a string describing the object.
     * @return a string in the format "TripPlan[cityName1,cityName2,...]"
     */
    public String toString()
    {
        String seperatedCities = "";
        String separator = ",";
        for (int i = 0; i < city.size(); i++)
        {
            if (i > 0)
            {
                seperatedCities = seperatedCities + separator + city.get(i);
            }
            else 
            {
            seperatedCities = seperatedCities + city.get(i);
            }
        }
        return "TripPlan" + "[" + seperatedCities + "]";
    }

    /**
     * Removes a city form the this trip
     * @param cityName city to remove
     */
    public void removeCity(String cityName)
    {
        // TODO: Write code to remove a city to the array list instance variable
        city.remove(cityName);
    }

    /**
     * Reverses the elements in the itinerary.
     */
    public void reverse()
    {
        ArrayList<String> reversedCities = new ArrayList<String>();
        for(int i = city.size() - 1; i >= 0; i--)
        {
            String cities = city.get(i);
            reversedCities.add(cities);
        }
        city = reversedCities; 
    }
}