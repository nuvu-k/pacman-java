import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        int rowCount = 21;
        int columnCount = 19;
        int tileSize = 32;
        int boardWidth = columnCount * tileSize;
        int boardHeight = rowCount * tileSize;

        JFrame frame = new JFrame("Pac Man");
        //frame.setVisible(true); //frame visibility
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);  //this makes sure the panel is at the centre of the screen
        frame.setResizable(false);  //prevents resizing of window by user
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //closes when you click on red cross

        PacMan pacmanGame = new PacMan();
        frame.add(pacmanGame);  //this adds the jpanel to the frame
        frame.pack();   //this makes sure we get full size of the frame within our window
        pacmanGame.requestFocus();
        frame.setVisible(true);     //we are setting the window visible now after adding the jpanel


    }
}
 