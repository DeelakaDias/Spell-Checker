import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class spellChecker {
    private static ArrayList<String> wordSet;

    public spellChecker(ArrayList<String> words) {
        wordSet = words;
    }

    public static List<String> checkWord(String entry) {
        // this will return the user enter word if that matches with text file
        if (wordSet.contains(entry)) {
            return Collections.singletonList(entry);
        }

        List<String> correction = new ArrayList<>();

        // checking if a single character is missing
        for (int counter = 0; counter < entry.length(); counter++) {
            for (char l = 'a'; l <= 'z'; l++) {
                String typedWord = entry.substring(0, counter) + l + entry.substring(counter);

                // if typedWord matches to words in wordStore if statement will work
                if (wordSet.contains(typedWord)) {
                    correction.add(typedWord);
                }
            }
        }

        // checking if a character in a word has to be replaced with another letter
        for (int counter = 0; counter < entry.length(); counter++) {
            for (char l = 'a'; l <= 'z'; l++) {
                String typedWord = entry.substring(0, counter) + l + entry.substring(counter + 1);

                if (wordSet.contains(typedWord)) {
                    correction.add(typedWord);
                }
            }
        }


        // swapping and checking whether the correct word is there in wordSore file
        for (int counter = 0; counter < entry.length() -1; counter++) {
            // adding entry to character arraylist
            char[] entryArray = entry.toCharArray();
            char charactor = entryArray[counter];
            // swapping the letters
            entryArray[counter] = entryArray[counter + 1];
            entryArray[counter + 1] = charactor;
            String typeWord = new String(entryArray);
            if(wordSet.contains(typeWord)){
                correction.add(typeWord);
            }
        }

        // checking if there is an additional character
        for (int counter = 0; counter < entry.length(); counter++) {
            StringBuilder letterChecker = new StringBuilder(entry);
            // this will delete the respective index of the user enter word
            letterChecker.deleteCharAt(counter);
            String typeWord = letterChecker.toString();
            if(wordSet.contains(typeWord)){
                correction.add(typeWord);
            }
        }

        return correction;

    }
}