
import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryManagement {

    public ArrayList<Word> insertFromCommandline() {
        Scanner scanner = new Scanner(System.in);
        Dictionary dictionary = new Dictionary();
        int numberWords = scanner.nextInt();
        scanner.nextLine();
        while (0 != numberWords) {
            Word word = new Word();
            System.out.println("Nhap tu tieng anh : ");
            word.setWord_target(scanner.nextLine());

            System.out.println("Nhap giai thich sang tieng viet");
            word.setWord_explain(scanner.nextLine());
            dictionary.wordList.add(word);
            numberWords--;
        }
        return dictionary.wordList;
    }

}

