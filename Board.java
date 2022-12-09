public class Board {
    private Card[][] board;
    private boolean isGameOver;
  
    public Board(int rows, int columns) {
      // Initialize the board with a rows x columns array of Cards
      this.board = new Card[rows][columns];
      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
          this.board[i][j] = new Card("Word", "Color");
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
  }