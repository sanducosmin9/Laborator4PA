package ro.info.uaic;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        compulsory();
    }

    public static void compulsory(){

        var students = IntStream.rangeClosed(0, 3)
                                        .mapToObj(i -> new Student("S" + i))
                                        .toArray(Student[]::new);
        //created the student objects

        var schools = IntStream.rangeClosed(0, 2)
                                        .mapToObj(i -> new School("H" + i, 2))
                                        .toArray(School[]::new);
        //created the school objects and set all the capacities to 2

        schools[0].setCapacity(1);
        //modified the first school's capacity

        List<Student> studentList = new ArrayList<>();
        //created an array list for the students

        studentList.addAll(Arrays.asList(students));
        //added all the students in the array list

        Collections.sort(studentList, new NameComparator());
        //sorted the students list

        Set<School> schoolList = new TreeSet<>(Arrays.asList(schools));
        //added the schools in the TreeSet


        Map<Student, List<School>> studentPreferences = new HashMap<>();

        studentPreferences.put(students[0], Arrays.asList(schools[0], schools[1], schools[2]));
        studentPreferences.put(students[1], Arrays.asList(schools[0], schools[1], schools[2]));
        studentPreferences.put(students[2], Arrays.asList(schools[0], schools[1]));
        studentPreferences.put(students[3], Arrays.asList(schools[0], schools[2]));
        //created the student's preference list using a simple put.

        Map<School, List<Student>> schoolPreferences = Map.ofEntries(
                new HashMap.SimpleEntry<School, List<Student>>(schools[0], Arrays.asList(students[3], students[0], students[1], students[2])),
                new HashMap.SimpleEntry<School, List<Student>>(schools[1], Arrays.asList(students[0], students[2], students[1])),
                new HashMap.SimpleEntry<School, List<Student>>(schools[2], Arrays.asList(students[0], students[1], students[3]))
        );
        //created the school's preference list using the Map.ofEntries.

        Solution solution = new Solution();
        //solution.printSolution(schools, students);
        //created a solution object and printed a bare bones solution for the school and student lists.
        //will modify if I have the chance.


        // ------------Querying--------------

        
        studentList.stream()
                .filter(student -> studentPreferences.get(student).containsAll(Arrays.asList(schools[0], schools[1])))
                .forEach(System.out::println);
        //query to print the students who find acceptable a given list of schools


        schoolList.stream()
                .filter(school -> schoolPreferences.get(school).get(0).equals(students[0]))
                .forEach(System.out::println);
        //query to print the schools who have the student given as parameter as their top priority

    }

}
