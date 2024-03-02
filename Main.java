import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner usersWord = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("wordStore.txt"));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            // removing the blank spaces after the word
            String checkableWord = line.trim();
            words.add(checkableWord);
        }

        // this will pass the words to implementation constructor
        new spellChecker(words);
        System.out.print("Enter the word: ");
        String userWord = usersWord.next();

        // usersWord will be pass to checkWord method
        List<String> checker = spellChecker.checkWord(userWord);
        if (userWord.equals(checker.get(0))) {
            System.out.println("The spelling is correct.");
        } else {
            System.out.println("The word you tried to type was " + checker);
        }
    }
}