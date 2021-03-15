package ro.info.uaic;

public class Student {

    private String name;
    private boolean available;
    private double examScore;

    public double getExamScore() {
        return examScore;
    }

    public void setExamScore(double examScore) {
        if(examScore < 0)
            System.out.println("Invalid number!");
        else this.examScore = examScore;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Student(String name) {
        this.name = name;
        available = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

}
