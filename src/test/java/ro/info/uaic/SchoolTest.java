package ro.info.uaic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    @Test
    public void constructorTest(){
        School school = new School("nume", 5);
        assertEquals("nume", school.getName());
        assertEquals(5, school.getCapacity());
    }
    //test for constructor

    @Test
    public void setterTest(){
        School school = new School("nume", 5);
        school.setName("numeNou");
        assertEquals("numeNou", school.getName());
        //test for name setter

        school.setCapacity(10);
        assertEquals(10, school.getCapacity());
        //test for capacity setter

        school.setCapacity(-5);
        assertEquals(10, school.getCapacity());
        //test for capacity setter wrong capacity
    }

    @Test
    public void toStringTest(){
        School school = new School("nume", 5);
        assertEquals("School{name='nume', capacity=5}", school.toString());
    }


}