package ro.info.uaic;

public class School implements Comparable<School> {

    private String name;
    private int capacity;

    public School(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if(capacity < 0)
            System.out.println("Invalid number!");
        else
            this.capacity = capacity;
    }

    public void decrementCapacity() {
        capacity--;
    }

    @Override
    public int compareTo(School obj) {
        return this.name.compareTo(obj.getName());
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
