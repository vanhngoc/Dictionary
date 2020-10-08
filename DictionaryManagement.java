

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class DictionaryManagement {

    final static int exsit = 0,
            notFull = -1,
            ok = 1,
            noExsit = 2;
    public static TreeMap treeMap = new TreeMap<String, Word>();
    private Word word;



    public void insertFromFile() {
        try {
            Scanner read = new Scanner(new FileInputStream("dictionaries.dat"));
            String line;

            while (read.hasNextLine()) {
                line = read.nextLine();
                if (!line.contains("#")) {
                    this.splitWordAndAddToTree(line);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void splitWordAndAddToTree(String line) {
        String[] Str = line.split("\\|");
        // StringTokenizer str = new StringTokenizer(line, "|");

        String key = Str[0];
        String value = Str[1];
        key = key.trim();
        value = value.trim();

        word = new Word(key, value);
        treeMap.put(key.toLowerCase(), value.toLowerCase());

    }


    public int addWord(Word word, TreeMap<String, String> treeMap) {
        if ((word.getWord_target().compareTo("") == 0) ||
                (word.getWord_explain().compareTo("") == 0)) {
            return notFull;
        } else {
            if (treeMap.containsKey(word.getWord_target())) {
                return exsit;
            } else {
                String target = word.getWord_target().toLowerCase();
                String explain = word.getWord_explain().toLowerCase();
                treeMap.put(target, explain);
                return ok;
            }
        }
    }

    public void deleteWord(String word) {
        treeMap.remove(word);
    }

    public void editWord(Word word) {
        treeMap.put(word.getWord_target().toLowerCase(), word);

    }

    public static void searchWord(String word) {
        Set<String> keySet = treeMap.keySet();
        for (String key : keySet) {
            if(word.equals(key)){
                System.out.println(treeMap.get(key));
            }
        }
    }
}

