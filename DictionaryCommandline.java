public class DictionaryCommandline {
    Dictionary dictionary = new Dictionary();

    public void display(int i) {
        System.out.print(i);
        System.out.print("\t" + dictionary.wordList.get(i).getWord_explain());
        System.out.print("\t" + dictionary.wordList.get(i).getWord_explain());
    }

    public void showAllWords() {
        System.out.println("N0\t" + "|English\t" + "| " +
                "Vietnamese");
        for (int i = 0; i < dictionary.wordList.size(); i++) {
            display(i);
            System.out.println();
        }
    }
}

