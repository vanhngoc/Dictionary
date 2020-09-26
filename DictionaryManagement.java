
import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryManagement {

    public ArrayList<Word> insertFromCommandline() {
        Scanner scanner = new Scanner(System.in);
        Word word = new Word();
        Dictionary dictionary = new Dictionary();
        int numberWords = scanner.nextInt();
        while (0 != numberWords) {
            System.out.println("Nhap tu tieng anh : ");
            word.setWord_target(scanner.next());

            System.out.println("Nhap giai thich sang tieng viet");
            word.setWord_explain(scanner.next());
            dictionary.wordList.add(word);
            numberWords--;
        }
        return dictionary.wordList;
    }

    public static void main(String[] args) {

        DictionaryManagement dicMan = new DictionaryManagement();
        Word word = new Word();
        Dictionary dictionary = new Dictionary();
        dictionary.setWordList(dicMan.insertFromCommandline());
        for (int i = 0; i < dictionary.getWordList().size(); i++) {
//            word = dictionary.getWordList().get(i);
            System.out.println(dictionary.getWordList());
            System.out.println(word.getWord_target() + "\t" + word.getWord_explain());
        }






    }
}
