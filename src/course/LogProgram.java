package course;

import entities.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LogProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file full path");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            Set<Student> set = new HashSet<>();
            String courseCode = br.readLine();
            while (courseCode != null) {
                set.add(new Student(courseCode));
                courseCode = br.readLine();
            }
            System.out.println("total students: "  + set.size());

        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }
        sc.close();

    }
}