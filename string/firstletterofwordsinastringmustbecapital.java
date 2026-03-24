package string;
class firstletterofwordsinastringmustbecapital{
    public static String firstlettercapitalofword(String s){
        StringBuilder sb =new StringBuilder("");//create a stringbuilder initiate it as empty
        char ch= Character.toUpperCase(s.charAt(0)); //first word's first letter is converted to uppercase
        sb.append(ch);//append it to stringbuilder
        for(int i=1;i<s.length();i++){//traverses all the letters in a string
            if(s.charAt(i)==' ' && i<s.length()){//if charAt(i) is a space and it is i < length of the string then append it to the stringbuilder
                //i<s.length is taken because if the space is the last character and there is no next word then it avoids complications
                sb.append(s.charAt(i));
                i++;//after space being appended to the stringbuilder it increments the i so that now it points to the new word's fist letter which we want in uppercase
                sb.append(Character.toUpperCase((s.charAt(i))));//it takes that new word's first letter and converts it to uppercase and appends it to the stringbuilder
            }else{
                sb.append(s.charAt(i));//if the i is not pointer at the space then simply add all the other letters as it is in the string builder
            }
        }
        return sb.toString();// stringbuilder cannot be returned so we convert it to string from .toString() function
    }
    public static void main(String args[]){
        String s="hi, i am manasi bhnagale";
        System.out.println(firstlettercapitalofword(s));
    }
}