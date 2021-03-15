package ro.info.uaic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameComparatorTest {

    @Test
    public void compareTest(){
        Student s1 = new Student("Bogdan");
        Student s2 = new Student("Alex");

        NameComparator comparator = new NameComparator();

        assertEquals(1, comparator.compare(s1, s2));
        assertEquals(-1, comparator.compare(s2, s1));
    }

}