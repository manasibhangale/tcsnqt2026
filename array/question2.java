/*
Jack is always excited about sunday. It is favourite day, when he gets to play all day. And goes to cycling with his friends. 

So every time when the months starts he counts the number of sundays he will get to enjoy. Considering the month can start with any day, be it Sunday, Monday…. Or so on.

Count the number of Sunday jack will get within n number of days.

 Example 1:

Input 

mon-> input String denoting the start of the month.

13  -> input integer denoting the number of days from the start of the month.

Output :

2    -> number of days within 13 days.

Explanation:

The month start with mon(Monday). So the upcoming sunday will arrive in next 6 days. And then next Sunday in next 7 days and so on.

Now total number of days are 13. It means 6 days to first sunday and then remaining 7 days will end up in another sunday. Total 2 sundays may fall within 13 days. */
import java.util.*;
public class question2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first day of month:");
        String startDay=sc.next();
        System.out.print("Enter the number of days:");
        int numberOfTotalDays=sc.nextInt();
        String arr[]={"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
        int startIndex=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(startDay)){
                startIndex=i;
                break;
            }
        }
        int numberOfSundays=0;
        if(startIndex<numberOfTotalDays){
            numberOfSundays=1;
        }
        int daysToFirstSunday=6-startIndex;
        int remainingDays=numberOfTotalDays-daysToFirstSunday-1;
        numberOfSundays+=remainingDays/7;
        System.out.println("the total number of sundays are:"+numberOfSundays);
    }
}
/*
Here is your **clean copy-paste revision note**:

```
SUNDAY COUNT APPROACH

1. Convert day to index:
   mon=0, tue=1, wed=2, thu=3, fri=4, sat=5, sun=6

2. Find days to first Sunday:
   daysToSunday = 6 - startIndex

3. Check if Sunday exists within total days:
   if (daysToSunday < totalDays)

4. Remaining days after first Sunday:
   remainingDays = totalDays - daysToSunday - 1

5. Count total Sundays:
   Sundays = 1 + (remainingDays / 7)

FINAL FORMULA:

if (6 - startIndex < totalDays)
    Sundays = 1 + (totalDays - (6 - startIndex) - 1) / 7;
else
    Sundays = 0;

INTUITION:
Reach first Sunday, then count every 7 days.
```
 */