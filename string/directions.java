//give a route containing 4 directions (E , W , S , N) Find the shortest path to reach the destination from origin(0,0)
//question: "WNEENESENNN"
package string;

public class directions {
    public static float shortestdistance(String s){
    int x=0,y=0;
    for(int i=0;i<s.length();i++){
        char dir=s.charAt(i);
        if(dir=='N'){
            y++;//goes 1 unit up in y coordinate
        }else if(dir=='S'){
            y--;//goes 1 unit down in y coordinate
        }else if(dir=='E'){
            x++;//goes 1 unit right in x coordinate
        }else{
            x--;//goes 1 unit left in x coordinate
        }
    }
    //shortest distance formula is underroot x2-x1 the whole square +y2-y1 the whole square
    //since here x1 and y1 is 0 because it starts from origin so we us the formula underroot x2 square + y2 square
    int X2=x*x;
    int Y2=y*y;
    return (float)Math.sqrt(X2+Y2);//can't convert from double to int so type casted to float
}
    public static void main(String args[]){
        String s="WNEENESENNN";
        System.out.println(shortestdistance(s));
    }
}
