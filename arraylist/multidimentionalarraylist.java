package arraylist;
import java.util.*;
public class multidimentionalarraylist {
    public static void main(String args[]){
        //example1
        ArrayList<ArrayList<Integer>>mainlist1=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();        
        ArrayList<Integer> list2=new ArrayList<>();        
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list2.add(5);        
        list2.add(6);        
        list2.add(7);        
        list2.add(8);
        //adding sublist to mainlist
        mainlist1.add(list1);
        mainlist1.add(list2);  
        //traversing sublist  
        for(int i=0;i<mainlist1.size();i++){
            ArrayList<Integer> currlist=mainlist1.get(i);
            for(int j=0;j<currlist.size();j++){
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
        }  
        //printing the mainlist
        System.out.println("mainlist1: "+mainlist1);  
        ArrayList<ArrayList<Integer>>mainlist2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();        
        ArrayList<Integer> list4=new ArrayList<>();  
        ArrayList<Integer> list5=new ArrayList<>();  
        for(int i=1;i<=5;i++){
                list3.add(i*1);
                list4.add(i*2);
                list5.add(i*3);           
        }
        mainlist2.add(list3);
        mainlist2.add(list4);
        mainlist2.add(list5);
        System.out.println("mainlist2: "+mainlist2);

    }
}
