import java.util.Scanner;
import java.util.Set;

public class DictionaryCommandLine {
    public static void main(String[] args) {
        DictionaryManagement dicManagement = new DictionaryManagement();
        dicManagement.insertFromFile();
//        Scanner scanner = new Scanner(System.in);
        Word word1 = new Word("build", "xay dung");
        Word word2 = new Word("laptop", "may tinhs");
        dicManagement.addWord(word1, dicManagement.treeMap);
        dicManagement.addWord(word2, dicManagement.treeMap);


        dicManagement.searchWord("apple");
        dicManagement.deleteWord("cup");
        Set<String> keySet = dicManagement.treeMap.keySet();
        for (String key : keySet) {
            System.out.println(key + "\t\t" + dicManagement.treeMap.get(key));
        }
    }
}
