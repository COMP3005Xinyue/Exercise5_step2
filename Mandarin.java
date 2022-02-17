public class Mandarin extends language {
    NewsItem newsItem;

    public Mandarin(NewsItem ni) {
        newsItem = ni;
    }

    public String getTranslate() {
        return newsItem.getTranslate() + " was translated to Mandarin\n";
    }

    void create() {}
}
