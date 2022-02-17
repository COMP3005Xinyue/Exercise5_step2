public class French extends language {
    NewsItem newsItem;

    public French(NewsItem ni) {
        newsItem = ni;
    }

    public String getTranslate() {
        return newsItem.getTranslate() + " was translated to French\n";
    }

    void create() {}
}
