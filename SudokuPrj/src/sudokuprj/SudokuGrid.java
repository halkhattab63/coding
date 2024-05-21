package sudokuprj;
import java.awt.Point;
public class SudokuGrid {

    public static final int SIZE = 9;
    public static final int[] DIGIT_RANGE = {1,2,3,4,5,6,7,8,9};
    public int[][] BOX = new int[SIZE][SIZE];
    public SudokuGrid copy() {
        SudokuGrid copyGrid = new SudokuGrid(BOX); // Yeni bir SudokuGrid nesnesi oluşturun
        // Izgaranın her hücresini kopyalayın
        // for (int row = 0; row < SIZE; row++) {
        //     for (int col = 0; col < SIZE; col++) {
        //         copyGrid.BOX[row][col] = this.BOX[row][col];
        //     }
        // }
        return copyGrid;
    }

    public int[] findEmptyCell(Point point){
        int control[]  = {-1,-1};
        if(BOX[point.x][point.y] == 0){
            control[0] = point.x;
            control[1] = point.y;
        }
        return control ;
    }

    public SudokuGrid(int[][] BOX){
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                this.BOX[row][col] = BOX[row][col];
            }
        }
    }

    public void printSudoku(){
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                System.out.print(BOX[row][col]);
            }
            System.out.println();
        }
    }
    
    public boolean givesConflict(int r, int c, int d){
        int rowConflict[]; 
        int colConflict[];
        int boxConflict[][];
        
        return true;
    }
        public void fillCell(int r, int c){

        }

}



// //     public void printig(){
//         for (int row = 0; row < SIZE; row++) {
//             for (int col = 0; col < SIZE; col++) {
//                 System.out.print(" " +bord[row][col]);
//             }
//             System.out.println(" ");
//         }
//     }