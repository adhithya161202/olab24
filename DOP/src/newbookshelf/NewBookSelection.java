package newbookshelf;

public class NewBookSelection {

     public static String getAgeOrTitle(Object o) {
        if (o instanceof IBOOK) {
            if (o instanceof Newcomic comic) {
                return comic.title();
            } else if (o instanceof Newfiction fiction) {
                return fiction.name();
            } else if (o instanceof Newtextbook textBook) {
                return textBook.subject();
            }
        }
        return "";  
    }


    public static void main(String[] args) {
        // Test instances of each type in the newbookshelf package
        Newcomic comic = new Newcomic("Spider Man");
        Newfiction fiction = new Newfiction("Percy Jackson", "Rick Riordan", NewfictionType.MYSTERY);
        Newtextbook textBook = new Newtextbook("Mathematics");
        
        // Test NewfictionType directly
        NewfictionType genre = NewfictionType.COMEDY;

        // Testing the getAgeOrTitle method
        System.out.println(getAgeOrTitle(comic));         
        System.out.println(getAgeOrTitle(fiction));      
        System.out.println(getAgeOrTitle(textBook));      
        System.out.println(getAgeOrTitle(genre));         
        System.out.println(getAgeOrTitle(new Object()));  
    }
}
