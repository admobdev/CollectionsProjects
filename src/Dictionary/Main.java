package Dictionary;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DictionaryService exp = new DictionaryController();
        while(true){
            System.out.println("""
                    1 -> Add word
                    2 -> Add synonym
                    3 -> Translate
                    4 -> List
                    5 -> Edit Translate
                    6 -> Edit word
                    7 -> Delete word
                    8 -> Delete Translate""");
            switch (sc.nextInt()){
                case 1 -> exp.addWord();
                case 2 -> exp.addSynonyms();
                case 3 -> exp.translate();
                case 4 -> exp.list();
                case 5 -> exp.editTranslate();
                case 6 -> exp.editWord();
                case 7 -> exp.deleteWord();
                case 8 -> exp.deleteTranslate();
            }
        }
    }
}
