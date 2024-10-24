
package oldshelf;

public class Fiction extends Book {

	
	private String name;

	// type is a per-instance object and it is initialized only once (static means it's shared across all instances)
	private     FictionType type;

   // type remains static for all instances
	public Fiction(String title, String name, FictionType type) {
		super(title); 
		this.name = name;
		Fiction.type = type;  // Since type is static, it is shared and initialized once
	}

	
	public String getName() {
		return name;
	}

	public static FictionType getType() {
		return type;
	}


	@Override
	public String toString() {
		return "Fiction [name=" + name + ", type=" + type + ", title=" + getTitle() + "]";
	}
}
