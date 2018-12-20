import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        words.add("hello");
        words.add("nut");
        words.add("cool");
        words.add("nice");

        for (int i = 0; i < words.size(); i ++) {
            System.out.print(words.get(i) + ", ");
        }
        System.out.println();
        WordList wordList = new WordList(words);

        System.out.println("There are " + wordList.numWordsOfLength(4) + " words with a length of 4.");

        System.out.println("Removing words with length 4...");

        wordList.removeWordsOfLength(4);

        System.out.println("The new list is: ");
        for (int i = 0; i < words.size(); i ++) {
            System.out.print(words.get(i) + ", ");
        }
    }

}
