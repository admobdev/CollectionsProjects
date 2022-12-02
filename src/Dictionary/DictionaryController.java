package Dictionary;

import java.util.*;

public class DictionaryController implements DictionaryService {
    private Map<String, Dictionary> map = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    @Override
    public void addWord() {
        System.out.println("Enter word: ");
        String word = sc.next();
        System.out.println("Enter translation of word: ");
        String translate = sc.next();
        Dictionary dictionary = new Dictionary(translate);
        map.put(word, dictionary);
    }

    @Override
    public void addSynonyms() {
        System.out.println("Enter word: ");
        String word = sc.next();
        if (map.containsKey(word)) {
            Dictionary dictionary = map.get(word);
            System.out.println("Synonym: ");
            String synonym = sc.next();
            dictionary.getSynonyms().add(synonym);
        } else {
            System.out.println("Not found !");
        }
    }

    @Override
    public void translate() {
        System.out.println("Enter word: ");
        String word = sc.next();
        if (map.containsKey(word)) {
            Dictionary dictionary = map.get(word);
            System.out.println("Enter new translation: ");
            String tr = sc.next();
            dictionary.setTranslate(tr);
        } else {
            System.out.println("Not found !");
        }
    }

    @Override
    public void list() {


        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(s + " -> " + map.get(s));
        }
    }

    @Override
    public void editTranslate() {
        System.out.println("Enter word: ");
        String word = sc.next();
        if (map.containsKey(word)) {
            Dictionary dictionary = map.get(word);
            System.out.println(dictionary);
        } else {
            System.out.println("Not found !");
        }
    }

    @Override
    public void editWord() {
        System.out.println("Enter word: ");
        String word = sc.next();
        if (map.containsKey(word)) {
            Dictionary dictionary = map.get(word);
            System.out.println("Enter new word: ");
            String wr = sc.next();
            map.put(word, dictionary);
            map.remove(word);
        }
    }

    @Override
    public void deleteWord() {
        System.out.println("Enter word: ");
        String word = sc.next();
        if (map.containsKey(word)) {
            map.remove(word);
        } else {
            System.out.println("Not found !");
        }
    }

    @Override
    public void deleteTranslate() {
        System.out.println("Enter word: ");
        String word = sc.next();
        if (map.containsKey(word)) {
            Dictionary dictionary = map.get(word);
            dictionary.setTranslate(null);
        } else {
            System.out.println("Not found !");
        }
    }
}