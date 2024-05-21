package odevsudoku;

public class SudokuSolve {

    public static boolean isSafe(int[][] bord , int row, int col, int num) {
        for (int i = 0; i < bord.length; i++) {
            if (bord[row][i] == num) {
                return false;
            }
        }
        for (int j = 0; j < bord.length; j++) {
            if (bord[j][col] == num) {
                return false; 
            }
        }
        
        int sqrt = (int) Math.sqrt(bord.length);
        int boxRowStart = row - row % sqrt; 
        int boxColStart = col - col % sqrt; 

        for (int r = boxRowStart; r < boxRowStart + sqrt; r++){
            for(int c = boxColStart; c < boxColStart + sqrt; c++){
                if (bord[r][c] == num) {
                    return false;
                }
            }
        }
        return true ;
    }

        public static boolean fillCell(int[][] bord, int n){
            int row = -1 ; 
            int col = -1 ;  
            boolean isEmpty = true; 

            for(int i = 0 ; i < n ; i++){
                for(int j = 0 ; j < n ; j ++){
                    if(bord[i][j] == 0 ){
                        row = i ;
                        col = j;
                        isEmpty = false; 
                        break; 
                    }
                }
                //if isEmpty == false break;
                if (!isEmpty) {break;}
            }
            // if isEmpty == true returun true
            if (isEmpty) {return true;}
                
            for(int num = 1 ; num <= n ; num++){
                if (isSafe(bord, row, col, num)) {
                    bord[row][col] = num;
                    if (fillCell(bord, n)){return true;}
                    else {bord[row][col] = 0 ;}
                }
            }
            return false;
        }
}
