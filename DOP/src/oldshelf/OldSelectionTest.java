package oldshelf;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class OldSelectionTest {

    @Test
    void testGetAgeOrTitle_Comic() {
        Comic comic = new Comic("Batman", 50);
        assertEquals("superman", OldSelection.getAgeOrTitle(comic));
    }

    @Test
    void testGetAgeOrTitle_SomeObject() {
        Object someObject = new Object();
        assertEquals("", OldSelection.getAgeOrTitle(SomeObject));
    }
}
