package newshelf;
public class NewSelection {
	/**
	 * 
	 * @param o object
	 * returns if o is not a book, returns empty string, if Comic, returns title, of Fiction
	 * returns name, and if TextBook, returns subject.
	 */
  public static String getAgeOrTitle(Object o) {
        if (o instanceof IBook) {
            if (o instanceof Ncomic comic) {
                return comic.title();
            } else if (o instanceof Nfiction fiction) {
                return fiction.name();
            } else if (o instanceof NtextBook textBook) {
                return textBook.subject();
            }
        }
        return "";  
    }

    public static void main(String[] args) {
     
        Ncomic comic = new Ncomic("Super Man");
        Nfiction fiction = new Nfiction("Harrypotter", "J K Rowling",NfictionType.fatansy);
        NtextBook textBook = new NtextBook("chemistry");

        System.out.println(getAgeOrTitle(comic));     
        System.out.println(getAgeOrTitle(fiction));   
        System.out.println(getAgeOrTitle(textBook));  

        System.out.println(getAgeOrTitle(new Object()));
    }
}