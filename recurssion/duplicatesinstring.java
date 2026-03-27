package recurssion;
class duplicatesinstring{
    public static void removeduplicates(String s,int idx,StringBuilder newstr,boolean map[]){
       if(idx==s.length()){
        System.out.println(newstr);
        return;
       }
       char currChar=s.charAt(idx);
       if(map[currChar-'a']==true){
            removeduplicates(s, idx+1, newstr, map);
       }else{
            map[currChar-'a']=true;
            removeduplicates(s, idx+1, newstr.append(currChar), map);
       }
    }
    public static void main(String args[]){
        String s="manasi";
        removeduplicates(s, 0, new StringBuilder(),  new boolean[26]);
    }
}