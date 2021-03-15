package ro.info.uaic;

import java.util.List;
import java.util.Map;

public class Solution {

    public void printSolution(School schools[], Student students[]){
        int i = 0;
        for(School school: schools) {
            System.out.print(school.getName() + " has accepted: ");
            while(school.getCapacity() > 0 && i < students.length) {
                System.out.print(students[i++].getName() + " ");
                school.decrementCapacity();
            }
            System.out.println();
        }
    }

}
