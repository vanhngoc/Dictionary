public class DictionaryCommandLine {
    public void dictionaryBasic() {
        DictionaryManagement dicMan = new DictionaryManagement();
        Dictionary dictionary = new Dictionary();
        dictionary.setWordList(dicMan.insertFromCommandline());
        DictionaryCommandline dicCmd = new DictionaryCommandline();
        dicCmd.showAllWords(dictionary.getWordList());
    }
}
