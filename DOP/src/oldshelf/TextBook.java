package oldshelf;

public class TextBook extends Book {


	private final String subject;

	
	public TextBook(String subject) {
		super(subject);  // Call to parent constructor with the subject as the title
		this.subject = subject;
	}


	public String getSubject() {
		return subject;
	}

	@Override
	public String toString() {
		return "TextBook [subject=" + subject + "]";
	}
}

