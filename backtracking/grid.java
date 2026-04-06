//in a gird i have to reach the target that is the last row's last column but the catch is i can only move right or left
public class grid {
    public static int total_ways(int i,int j,int m,int n){
        if(i==n-1 && j==m-1){//if i and j both reach the target cell then there is one way : target to target
            return 1;//so return 1
        }else if (i>=n || j>=m) {//cross boundary condition if any of the variable cross the boundary row then return 0
            return 0;
        }
        int w1=total_ways(i+1,j,m,n);//down row+1
        int w2=total_ways(i,j+1,m,n);//right col+1
        
        return w1+w2;//total
    }
    public static void main(String args[]){
        int n=3;//no of rows
        int m=3;//no of columns
        System.out.print(total_ways(0,0,m,n));

    }
}
