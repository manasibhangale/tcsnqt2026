package string;
public class leetcode2 {
    public int romanToInt(String s) {
     int sum=0;//initiate the sum to zero
          
        for(int i=0;i<s.length();i++){//traverse the complete string
            int curr=value(s.charAt(i));//set the current value as the s.charAt(i)// the value change the char from character to number for which we have created a value function below
            if(i<s.length()-1 && curr<value(s.charAt(i+1))){//if the current vale is less than the next value then we have to perform subraction example(IX or XL here the current is x and it is less thanL so that means we have to minus the x from l)
                //we have used i<s.length()-1 because we are comapring current with the next if current is last then next doesnt exist so it will throw an error so -1
                sum-=curr;//subtraction if curr<next
            }else{
                sum+=curr;//addition if current > next
            }
        }
    return sum; 
    }
    public int value(char ch) {
        if (ch == 'I') return 1;
        if (ch == 'V') return 5;
        if (ch == 'X') return 10;
        if (ch == 'L') return 50;
        if (ch == 'C') return 100;
        if (ch == 'D') return 500;
        if (ch == 'M') return 1000;
        return 0;
    }
}
