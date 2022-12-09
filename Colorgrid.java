import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Colorgrid {
    public String[][] colors;
    private String firstPlayerColor;
    private List<String> colorList;
    

    public Colorgrid(String firstPlayerColor){
        this.firstPlayerColor = firstPlayerColor;
        this.colorList = new ArrayList<String>();
        this.colors = new String[5][5];

        colorList.add("black");
        for(int i = 0; i < 8; i++){
            colorList.add("red");
        }
        for(int i = 0; i < 8; i++){
            colorList.add("blue");
        }
        for(int i = 0; i < 7; i++){
            colorList.add("white");
        }
        if(this.firstPlayerColor.equals("red")){
            colorList.add("red");
        }
        else{
            colorList.add("blue");
        }

        Collections.shuffle(colorList);

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                colors[i][j] = colorList.get(0);
                colorList.remove(0);
            }
        }
    }
}
