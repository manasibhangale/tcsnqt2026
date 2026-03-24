package string;

public class compressedstring {
    public static String compress(String s){
        StringBuilder sb=new StringBuilder("");//initiate an empty stringbuilder
        for(int i=0;i<s.length();i++){//traverse through all the letters in the string
            int count=1;//when the first unique element is encountered then update its count to 1 so that if other same letter encounters then it can be incremented to 2
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                //i<s.length()-1 (-1 because when we compare the current element with the next element in that case if our i=last element then it will fail for i+1 and give an error)
                count++;//if current and next element is same increment the value of count
                i++;// increment i
               
            }
            sb.append(s.charAt(i));//append each unique element
            if(count>1){//only if the count is more than one then only append it to the string builder
                sb.append(count);
            }
        }
        return sb.toString();//stringbuilder cannot be returned so convert it to string as it is our return type
    }
    public static void main(String args[]){
        String s="aaabbbccd";
        System.out.println(compress(s));
}
}

