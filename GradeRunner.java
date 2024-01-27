package day20exceptions;

import java.util.ArrayList;
import java.util.List;

public class GradeRunner {

    public static void main(String[] args) {

        System.out.println(addGrades(80));
        System.out.println(addGrades(-80));
        System.out.println(addGrades(800));

    }

    public static List<Integer> addGrades(int grade)
    {
        List<Integer> gradesList = new ArrayList<>();

        if(grade>=0 && grade<=100) {
            gradesList.add(grade);
        }else{
            throw new IllegalGradeException("Grade cannot be less than zero and more tha 100");
        }

        return gradesList;

    }
}
