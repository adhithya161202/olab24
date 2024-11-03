package oldshelf;

public class OldSelection {

	/**
	 * This method checks the type of the object passed to it.
	 * @param o object
	 * @return if o is not a book, returns an empty string. If o is Comic, returns title,
	 * if Fiction, returns name, and if TextBook, returns subject.
	 */
	// public static String getAgeOrTitle(Object o) {
	// 	if (o instanceof Comic) {
	// 		return ((Comic) o).getTitle();
	// 	} else if (o instanceof Fiction) {
	// 		return ((Fiction) o).getName();
	// 	} else if (o instanceof TextBook) {
	// 		return ((TextBook) o).getSubject();
	// 	}
	// 	return "";  
	// }	

	public static String getAgeOrTitle(Object o) {
        return switch (o) {
            case Comic comic -> comic.getTitle();
            case Fiction fiction -> fiction.getName();
            case TextBook textBook -> textBook.getSubject();
            default -> "";
        };
    }

	public static void main(String[] args) {
		
		TextBook text = new TextBook("chemistry");
		Comic comics = new Comic("superman",40);
		Fiction fic = new Fiction("Goatlife", "Benyamin", FictionType.Tragedy);

		
		System.out.println(getAgeOrTitle(text));  
		System.out.println(getAgeOrTitle(comics));  
		System.out.println(getAgeOrTitle(fic));  

		System.out.println(getAgeOrTitle(new Object()));  
	}
}