
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexMethod {

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
    public static int countWordsRegex(String text) {
        ArrayList<String> words = new ArrayList<>();
        Matcher matcher = Pattern.compile("\\b\\w+\\b").matcher(text);
        while (matcher.find()) {
            words.add(matcher.group());
        }
        int total_words = words.size();
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

        int total_words =  countWordsRegex(text);
        System.out.println(total_words);
    }
}