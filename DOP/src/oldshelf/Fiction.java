package oldshelf;

public class Fiction extends Book {

   
    private String name;

    // FictionType is a per-instance object, so it should not be static.
    private final FictionType type;

   
    public Fiction(String title,String name, FictionType type) {
        super(title);  
        this.name = name;  
        this.type = type;   
    }

   
    public FictionType getType() {
        return this.type;
    }
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Fiction{name='" + name + "', type=" + type + "}";
    }
}
