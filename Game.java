import java.util.Scanner;

public class Game {
    private Board board;
    private Player[] players;
    private int currentPlayer;
    private int guessesLeft;
    private String clueWord;
    private int clueNumber;
  
    public Game(Board board, Player[] players) {
      // Initialize the game with the specified board, word list, and players
      this.board = board;
      this.players = players;
      this.currentPlayer = 0;
      this.clueNumber = 0;
      this.clueWord = "";
    }
  
    public void start() {
      // Start a new game by selecting a new set of words for the board and setting the current team

    }
  
    public void selectWord(String word) {
      // Select the specified word from the board and update the game state accordingly

    }
  
    public void makeGuess() {

    }

    public int getGuessesLeft(){
      return guessesLeft;
    }
  
    public boolean isGameOver() {
      // Return whether the game is over or not
      return this.board.isGameOver();
    }
  
    public String getWinner() {
      // Return the team that won the game (if any)
      if (this.board.isGameOver()) {
        if (this.players[this.currentPlayer].getTeam() == "blue") {
          return "blue";
        } else {
          return "red";
        }
      }
      return "";
    }

    public void giveClue(){
      Scanner input = new Scanner(System.in);

      // prompt the user to enter a value
      System.out.print("Enter your clue word: ");

      // read the value entered by the user
      clueWord = input.nextLine();  // read a line of text

      // print the value entered by the user
      System.out.println("Enter the clue number: ");

      clueNumber = input.nextInt();  // read a line of text

      input.close();
    }

    public void endTurn(){

    }

    public static void main(String[] args) {

        String csvFile = "data.csv";
        Wordbank bank = new Wordbank(csvFile);
        Board board = new Board(bank, "blue");
        Game game = new Game(board, null);
        
        while(!game.isGameOver()){
          game.giveClue();
          
          while(game.getGuessesLeft() != 0){
            game.makeGuess();
          }

          game.endTurn();
        }
    }
}
   
  