

public class DicTest {
    public static void main(String[] args) {
        DictionaryCommandline DCl = new DictionaryCommandline();
        DictionaryManagement dicMan = new DictionaryManagement();
        dicMan.insertFromCommandline();
        DCl.showAllWords();
    }
}
