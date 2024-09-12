import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String department;
    private double cgpa;
    private static int totalStudents = 0;
    private static String university; 

    
    public Student(int id, String name, String department, double cgpa) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
        totalStudents++; 
    }

    
    public static void setUniversity(String university) {
        Student.university = university;
    }

    
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
        System.out.println("University: " + university);
        System.out.println();
    }

    
    public static void displayTotalStudents() {
        System.out.println("Total number of students: " + totalStudents);
    }
}
