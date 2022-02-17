import java.util.ArrayList;
import java.util.List;

public abstract class NewsItem {
    String name;
    TitleGenerator tg;
    FederationGenerator fg;
    SummaryGenerator sg;

    List<String> language = new ArrayList<>();

    abstract void create();

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public String toString() {
        return this.getTranslate();
    }

    public NewsItem addTranslation(List translate){
        language = translate;
        NewsItem translated = this;
        for (String i : language){
            if (i.equals("Mandarin")){
                translated = new Mandarin(translated);
            }else if (i.equals("Japanese")){
                translated = new Japanese(translated);
            }else if (i.equals("French")){
                translated = new French(translated);
            }
        }
        return translated;
    }

    protected String getTranslate() {
        StringBuffer result = new StringBuffer();
        result.append(name + " news item\n");
        result.append(tg.outcome());
        result.append("\n");
        result.append(fg.outcome());
        result.append("\n");
        result.append(sg.outcome());
        result.append("\n");

        return result.toString();
    }
}

