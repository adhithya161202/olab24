package oldshelf;

import java.util.*;

public class Comic extends Book {  
	private final int ageOfMainCharacter;

	public Comic(String title, int ageOfMainCharacter) {
		super(title);  
		this.ageOfMainCharacter = ageOfMainCharacter;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getAgeOfMainCharacter() {
		return ageOfMainCharacter;
	}

	
	@Override
	public String toString() {
		return "Comic [title=" + title + ", ageOfMainCharacter=" + ageOfMainCharacter + "]";
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(title, ageOfMainCharacter);  
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Comic comic = (Comic) o;
		return ageOfMainCharacter == comic.ageOfMainCharacter && Objects.equals(title, comic.title);
	}
}

