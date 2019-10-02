import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class OneDoesNotSimply {

    public static StackPane memeCreator(String quote) throws FileNotFoundException {
        
        StackPane meme = new StackPane();
        VBox words = new VBox();
        
        ImageView selectedImage = new ImageView();
        Image image1 = new Image(new FileInputStream("memes/OneDoesNotSimply.jpg"));
    
        selectedImage.setImage(image1);
        selectedImage.setFitHeight(500);
        selectedImage.setFitWidth(750);
        
        Text caption = new Text(quote);
        Text header = new Text("One Does Not Simply");
        
        header.setFont(Font.font("verdana", FontWeight.BOLD, 50));
        header.setFill(Color.WHITE);
        header.setStrokeWidth(2);
        header.setStroke(Color.BLACK);
        header.setWrappingWidth(800);
        header.setTextAlignment(TextAlignment.CENTER);

        caption.setFont(Font.font("verdana", FontWeight.BOLD, 50));
        caption.setFill(Color.WHITE);
        caption.setStrokeWidth(2);
        caption.setStroke(Color.BLACK);
        caption.setWrappingWidth(800);
        caption.setTextAlignment(TextAlignment.CENTER);
        
        words.setPrefHeight(1000);
        
        words.getChildren().addAll(header,new Text(), new Text(), new Text(), new Text(), new Text(), 
            new Text(), new Text(), new Text(), new Text(), new Text(), new Text(), new Text(), 
            new Text(), new Text(), new Text(), new Text(), new Text(), new Text(), new Text(), 
            new Text(), new Text(), new Text(), new Text(), caption);
        
        meme.getChildren().addAll(selectedImage, words);
        
        return meme;
        
    }
    
}
