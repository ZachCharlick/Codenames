import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Wordbank {
    
    private String csvFile;
    private List<String> words;
    Random randomNumberGenerator = new Random();

    public Wordbank(String filename){
        this.csvFile = filename;

        this.words = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split the line on the comma separator to get the individual values
                String[] values = line.split(",");

                // Add each value to the list of strings
                for (String value : values) {
                    words.add(value);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String randomWord(){
        if(words.isEmpty()){
            return "Empty";
        }
        int randomIndex =  randomNumberGenerator.nextInt(words.size());      // Generate a random index of words
        String word = words.get(randomIndex);
        words.remove(randomIndex);
        return word;
    }
    
    // Below is a test main method used to check the word bank functionality
    /* 
    public static void main(String[] args) {
        String csvFile = "words.csv";
        Wordbank test = new Wordbank(csvFile);
        

        // Print the list of strings to the console
        for(int i = 0; i < 5; i++){
            System.out.println(test.randomWord());
        }
    }
    */
}
