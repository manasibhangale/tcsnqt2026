/*
1. Collections.sort() in Java

In Java, Collections provides static utility methods for collection operations like sorting.
How it works
Uses natural ordering
Requires elements to implement Comparable
2. Comparators in Java

A Comparator is used to define custom sorting logic.

✅ Why Comparator?
When default sorting is not enough
When class doesn’t implement Comparable
Multiple sorting strategies needed
👌Comparator vs Comparable
| Feature       | Comparable  | Comparator |
| ------------- | ----------- | ---------- |
| Package       | java.lang   | java.util  |
| Method        | compareTo() | compare()  |
| Sorting       | Default     | Custom     |
| Modify class? | Yes         | No         |
👌Difference: Collection vs Collections
| Feature  | Collection                  | Collections              |
| -------- | --------------------------- | ------------------------ |
| Type     | Interface                   | Utility Class            |
| Package  | java.util                   | java.util                |
| Purpose  | Represents group of objects | Provides helper methods  |
| Examples | List, Set, Queue            | sort(), reverse(), min() |

*/
package arraylist;
import java.util.ArrayList;
import java.util.Collections;
public class sortingarraylist {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(9);
        list.add(90);
        list.add(5);
        System.out.println(list);//normal
        Collections.sort(list);
        System.out.println(list);//ascending
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);//descending
    }
}
