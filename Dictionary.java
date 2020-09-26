import java.util.ArrayList;
import java.util.List;

public class Dictionary {
    ArrayList<Word> wordList = new ArrayList<Word>();

    public void setWordList(ArrayList<Word> wordList) {
        this.wordList = wordList;
    }

    public ArrayList<Word> getWordList() {
        return wordList;
    }
}