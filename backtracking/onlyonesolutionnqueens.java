class onlyonesolutionnqueens{
    public static boolean is_valid(char[][]chessboard,int row,int col){
        //vertically top
        for(int i=row-1;i>=0;i--){
            if(chessboard[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
             if(chessboard[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 && j<chessboard.length;i--,j++){
             if(chessboard[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static boolean check(char chessboard[][],int row){//❤️convert return type to boolean
        if(row==chessboard.length){
            printboard(chessboard);
            
            return true;//❤️return true
        }
        for(int j=0;j<chessboard.length;j++){
            if(is_valid(chessboard,row,j)){
                chessboard[row][j]='Q';
                if(check(chessboard,row+1)){//❤️ check if it is true here
                    return true;//❤️
                }
                chessboard[row][j]='X';
            }
        }
        return false;//❤️
    }
    public static void printboard(char chessboard[][]){
        System.out.println("-------------------------------");
        for(int i=0;i<chessboard.length;i++){
            for(int j=0;j<chessboard.length;j++){
                System.out.print(chessboard[i][j]+" ");
            }
            System.out.println();
        }
        
    }
        public static void main(String args[]){
        int n=5;
        char chessboard[][]=new char[n][n];
        for(int i=0;i<chessboard.length;i++){
            for(int j=0;j<chessboard.length;j++){
                chessboard[i][j]='X';
            }
        }
        
        if(check(chessboard, 0)){
            System.out.println("solution is possible");
           
        }else{
            System.out.println("solution not possible");
        }
    }
}