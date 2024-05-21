
package sudoku;
import java.awt.*;
import javax.swing.*;

public class Sudoku extends JFrame {
    private static final long serialVersionUID = 1L;
    GameBoardPanel board = new GameBoardPanel();
    JButton btnNewGame = new JButton("New Game");

       // Constructor
    public Sudoku() {
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        cp.add(board, BorderLayout.CENTER);

        board.newGame();
        
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Sudoku");
        setVisible(true);
    }

    public static void main(String[] args) {
        
    }


}
