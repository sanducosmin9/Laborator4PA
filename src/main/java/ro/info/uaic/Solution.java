package ro.info.uaic;

import java.util.List;
import java.util.Map;

public class Solution {

    public void printSolution(Map<Student, List<School>> studentPreferences, Map<School, List<Student>> schoolPreferences){

        for(Map.Entry<School, List<Student>> entry : schoolPreferences.entrySet()){

            School school = entry.getKey();
            List<Student> studentList = entry.getValue();
            //copied the key and value in variables

            System.out.print(school.getName() + " has accepted: ");

            for(Map.Entry<Student, List<School>> entryStudent : studentPreferences.entrySet()){
                Student student = entryStudent.getKey();
                List<School> schoolList = entryStudent.getValue();
                //copied the key and value in variables

                if(studentList.contains(student) && schoolList.contains(school) && student.isAvailable() && school.getCapacity() > 0) {
                    System.out.print(student.getName() + ", ");
                    student.setAvailable(false);
                    school.decrementCapacity();
                }
                //checked if the schools contain students and vice-versa
                //also checked the flag and the capacity of the school
            }
            System.out.println();
        }
    }

}
