
public class URLify {
    public String urlify(String s, int length) {
        return s.trim().replaceAll(" ", "%20");
    }
}
