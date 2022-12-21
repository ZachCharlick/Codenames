import java.util.HashMap;
import java.util.Random;
import java.awt.Color;

public class Board {
    public Card[][] board;
    private boolean isGameOver;
    private Wordbank wordbank;

    public Board(Wordbank bank, String colorThatGoesFirst) {
      // Initialize the board with a 5 x 5 array of Cards
      this.wordbank = bank;
      this.board = new Card[5][5];
    

      Colorgrid colorgrid = new Colorgrid(colorThatGoesFirst); // make this either red or blue

      for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
          this.board[i][j] = new Card(wordbank.randomWord(), colorgrid.colors[i][j]);
        }
      }
    }
  
    public String getWord(int row, int column) {
      // Return the word at the specified position on the board
      return this.board[row][column].getWord();
    }
  
    public String getColor(int row, int column) {
      // Return the color at the specified position on the board
      return this.board[row][column].getColor();
    }

    public Boolean isRevealed(int row, int column) {
        // Return the color at the specified position on the board
        return this.board[row][column].isRevealed();
    }

    public boolean isGameOver(){
        return isGameOver;
    }

    public void printBoard(){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.printf("%12s", this.board[i][j].getWord());
                System.out.print(":");
                System.out.printf("%6s", this.board[i][j].getColor());
            }
            System.out.println();
        }
    }
    private static final HashMap<String, Color> colorMap = new HashMap<>();
        static{
            colorMap.put("red", Color.RED);
            colorMap.put("blue", Color.BLUE);
            colorMap.put("white", Color.WHITE);
            colorMap.put("black", Color.BLACK);
        }
    public static Color getJavaColor(String colorName){
        return colorMap.get(colorName.toLowerCase());
    }

    public static void main(String[] args) {
        String csvFile = "data.csv";
        Wordbank bank = new Wordbank(csvFile);
        Board board = new Board(bank, "red");
        System.out.println(colorMap.toString());
        
        board.printBoard();
    }
  }