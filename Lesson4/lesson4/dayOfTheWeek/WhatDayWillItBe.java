// BlueJ project: dayOfTheWeek
// Video: Day of the Week

public class WhatDayWillItBe
{
    public static void main(String[] args)
    {
        Day birthday = new Day(1983, 6, 18); 
        Day referenceDay = new Day(1900, 1, 1);
        int referenceWeekDay = 1;
        int daysBetween = birthday.daysFrom(referenceDay);
        int uncorrectedWeekDay = referenceWeekDay + daysBetween;
        int weekday = uncorrectedWeekDay % 7;
        // We may change this value when we run your program
        // It will always be a date >= January 1, 1900

        // January 1, 1900 was a Monday
        // Compute the number of days from that day until the birthday
        // Compute the weekday: 0 - Sunday, 1 - Monday, ..., 6 - Saturday

        System.out.print("Weekday: ");
        System.out.println(weekday);
    }
}
