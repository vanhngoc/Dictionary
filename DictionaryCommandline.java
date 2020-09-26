import java.util.ArrayList;

public class DictionaryCommandline {

    public void showAllWords(ArrayList<Word> wordList) {
        System.out.print("N0\t" + "|English\t" + "| " + "Vietnamese" + "\n");
        for (int i = 0; i < wordList.size(); i++) {
            System.out.print(i + 1);
            System.out.print("\t|" + wordList.get(i).getWord_target() + "\t");
            System.out.print("\t" + wordList.get(i).getWord_explain() + "\n");

        }
    }
}

