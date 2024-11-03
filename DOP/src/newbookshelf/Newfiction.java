package newbookshelf;

public record Newfiction(String name, String author, NewfictionType type) implements IBOOK<String> {
    @Override
    public String getDetails() {
        return "Fiction Name: " + name + ", Author: " + author + ", Type: " + type;
    }
}
