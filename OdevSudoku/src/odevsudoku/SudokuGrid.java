package odevsudoku;
import java.awt.Point;

public class SudokuGrid {

    public static final int SIZE = 9;
    public static final int[] DIGIT_RANGE = {1,2,3,4,5,6,7,8,9};
    public int[][] bord = new int[SIZE][SIZE];

    
    public int[] findEmptyCell(Point point){
        int control[]  = {-1,-1};
        if(bord[point.x][point.y] == 0){
            control[0] = point.x;
            control[1] = point.y;
        }
        return control ;
    }    
}

