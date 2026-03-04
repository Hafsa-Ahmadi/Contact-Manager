import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class splitMethods {

    public static String readFile(String filepath) {
        try {
            String content = Files.readString(Paths.get(filepath));
            return content;  
        } catch (IOException e) {
            System.out.println("Error reading file.");
            return "";
        }
    }

    //----------------------------------------------------
    public static int countWordsSplit(String text) {
        String[] wordsArray = text.split(" ");
        int total_words = wordsArray.length;
        return total_words;
    }
    //----------------------------------------------------
    
    public static void main(String[] args) {
        System.out.println("Welcome to the Word Counter!\n");

        String filepath = "input.txt";
        String text = readFile(filepath);

        if (text.equals("")) {
            return;
        }

        int totalWords =  countWordsSplit(text);

        System.out.println(totalWords);
    }
}