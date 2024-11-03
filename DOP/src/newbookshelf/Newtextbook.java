package newbookshelf;

public record Newtextbook(String subject) implements IBOOK<String> {
    @Override
    public String getDetails() {
        return "Textbook Subject: " + subject;
    }
}
