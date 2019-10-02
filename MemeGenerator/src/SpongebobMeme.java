import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class SpongebobMeme {

    
    public static StackPane memeCreator(String quote) throws FileNotFoundException {
        StackPane meme = new StackPane();
        
        ImageView selectedImage = new ImageView();   
        Image image1 = new Image(new FileInputStream("memes/spongebob.jpg"));
    
        selectedImage.setImage(image1);
        selectedImage.setFitHeight(500); 
        selectedImage.setFitWidth(750);
        
        Text caption = new Text(caseGenerator(quote));
        
        caption.setFont(Font.font("verdana", FontWeight.BOLD, 50)); 
        caption.setFill(Color.WHITE);
        caption.setStrokeWidth(2); 
        caption.setStroke(Color.BLACK);  
        caption.setWrappingWidth(800);
        caption.setTextAlignment(TextAlignment.CENTER);

        
        meme.getChildren().addAll(selectedImage, caption);
        StackPane.setAlignment(caption, Pos.TOP_CENTER);
        
        return meme;        
    }
    
    private static String caseGenerator(String quote) {

        String finalQuote = "";
        String tempChar;
        Random random = new Random();
        
        for (int i = 0; i < quote.length(); i++) {
            
            tempChar = Character.toString(quote.charAt(i));
            int randNum = random.nextInt(2);
            
            if (randNum == 1) {
                
                tempChar = tempChar.toUpperCase();
            }
            else {
                tempChar = tempChar.toLowerCase();

            }
            
            finalQuote = finalQuote + tempChar;
        }
        
        return finalQuote;
    }

}
