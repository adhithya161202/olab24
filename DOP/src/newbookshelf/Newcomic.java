package newbookshelf;

public record Newcomic(String title) implements IBOOK<String> {
    @Override
    public String getDetails() {
        return "Comic Title: " + title;
    }
}

