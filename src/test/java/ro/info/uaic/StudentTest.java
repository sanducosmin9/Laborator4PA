package ro.info.uaic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void constructorTest(){
        Student student = new Student("nume");
        assertEquals("nume", student.getName());
    }
    //test for constructor

    @Test
    public void setterTest(){
        Student student = new Student("nume");
        student.setName("numeNou");
        assertEquals("numeNou", student.getName());
    }

    @Test
    public void availableTest(){
        Student student = new Student("nume");
        assertEquals(true, student.isAvailable());

        student.setAvailable(false);
        assertEquals(false, student.isAvailable());
    }


    @Test
    public void toStringTest(){
        Student student = new Student("nume");
        assertEquals("Student{name='nume'}", student.toString());
    }
}