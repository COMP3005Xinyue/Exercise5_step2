public class Japanese extends language {
    NewsItem newsItem;

    public Japanese(NewsItem ni) {
        newsItem = ni;
    }

    public String getTranslate() {
        return newsItem.getTranslate() + " was translated to Japanese\n";
    }

    void create() {}
}
