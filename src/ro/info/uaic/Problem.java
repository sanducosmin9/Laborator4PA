package ro.info.uaic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem {

    private Map<School, List<Student>> schoolPreferences = new HashMap<>();
    private Map<Student, List<School>> studentPreferences = new HashMap<>();

    public Map<School, List<Student>> getSchoolPreferences() {
        return schoolPreferences;
    }

    public void setSchoolPreferences(Map<School, List<Student>> schoolPreferences) {
        this.schoolPreferences = schoolPreferences;
    }

    public Map<Student, List<School>> getStudentPreferences() {
        return studentPreferences;
    }

    public void setStudentPreferences(Map<Student, List<School>> studentPreferences) {
        this.studentPreferences = studentPreferences;
    }
}
