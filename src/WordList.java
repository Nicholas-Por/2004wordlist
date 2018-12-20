import java.util.*;

public class WordList {

    private ArrayList<String> myList;

    public WordList(ArrayList<String> words) {
        myList = words;
    }

    public int numWordsOfLength(int len) {
        int out = 0;
        for (int i = 0; i < myList.size(); i ++) {
            if(myList.get(i).length() == len) {
                out ++;
            }
        }
        return out;
    }

    public void removeWordsOfLength(int len) {
        for (int i = myList.size() - 1; i >= 0; i --) {
            if (myList.get(i).length() == len) {
                myList.remove(i);
            }
        }
    }
}
