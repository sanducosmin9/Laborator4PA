package ro.info.uaic;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student obj1, Student obj2) {
        return obj1.getName().compareTo(obj2.getName());
    }
} // compares Location objects by their names;