import java.io.FileNotFoundException;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    
    private static String quote;
    private static int meme;
    private static StackPane memeFormat;
 
    public static void main(String[] args) {
        
        
        System.out.println("Select Your Meme Format: \n"
            + "1 - Spongebob \n"
            + "2 - One Does Not Simply");
        Scanner sc = new Scanner(System.in);
        meme = sc.nextInt();
        
        //spongebob meme
        if (meme == 1) {
            
            System.out.println("What is your meme quote?");
            sc.nextLine();
            quote = sc.nextLine(); 
            
            try {
                
                memeFormat= SpongebobMeme.memeCreator(quote);
                
            } catch (FileNotFoundException e) {
                
                System.out.println("meme creation failed");
            }
            
            launch(args);
            
        }
        if (meme == 2) {
            System.out.println("What is something one does not simply do");
            sc.nextLine();
            quote = sc.nextLine(); 
         
            try {
                
                memeFormat = OneDoesNotSimply.memeCreator(quote);
                
            } catch (FileNotFoundException e) {

                e.printStackTrace();
                
            }
            sc.close();
            launch(args);

        }
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Scene scene = new Scene(memeFormat, 750, 500);

        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

}







