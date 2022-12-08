public class Card {
    private String word;
    private String color;
    private Boolean flipped;
  
    public Card(String word, String color) {
      // Initialize the word and color of the card
      this.word = word;
      this.color = color;
      this.flipped = false;
    }
  
    public String getWord() {
      // Return the word on the card
      return this.word;
    }
  
    public String getColor() {
      // Return the color of the card
      return this.color;
    }

    public Boolean isRevealed() {
        // Return the color of the card
        return this.flipped;
      }
  
    public void setWord(String word) {
      // Set the word on the card
      this.word = word;
    }
  
    public void setColor(String color) {
      // Set the color of the card
      this.color = color;
    }
  }