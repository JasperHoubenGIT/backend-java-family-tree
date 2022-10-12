import org.junit.jupiter.api.Test;

import javax.swing.event.ListSelectionEvent;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void addChild() {
        //arange
        Person parent = new Person("jasper", "Houben","man",27);
        Person child = new Person("floris", "Houben", "man",2);
        List<Person> children = new ArrayList<>();

        //act
        parent.addChild(parent, child);
        List<Person> kids = parent.getChildren();

        //assert
        assertEquals(children, kids);
        assertEquals("junior",parent.getChildren().get(0).getName());
        assertEquals("Houben",parent.getChildren().get(0).getName());
        assertEquals("man",parent.getChildren().get(0).getName());
        assertEquals(2,parent.getChildren().get(0).getName());


    }
}