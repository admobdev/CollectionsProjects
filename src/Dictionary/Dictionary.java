package Dictionary;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {
    private String translate;
    private List<String> synonyms = new ArrayList<>();

    public Dictionary() {
    }
    public Dictionary(String translate) {
        this.translate = translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    public List<String> getSynonyms() {
        return synonyms;
    }

    @Override
    public String toString() {
        return "Translate: " + translate + ". Synonyms: " + synonyms;
    }
}
