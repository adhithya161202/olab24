package newbookshelf;

public sealed interface IBOOK<T> permits Newcomic, Newfiction, Newtextbook {
    T getDetails();
}
