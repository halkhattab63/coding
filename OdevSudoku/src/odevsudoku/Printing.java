package odevsudoku;

public class Printing {
    public static void print(int[][] bord, int N){
        for (int r = 0; r < N; r++){
            for(int d = 0; d < N; d++){
                System.out.print( bord[r][d]);
                System.out.print("  ");
            }
            System.out.println("  ");
            
            // if((r+1)%(int)Math.sqrt(N)==0)
            // {
            //     System.out.print("");
            // }
        }
    }
    
}
