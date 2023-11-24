/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareengproject;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class SoftwareEngProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Raghad");
        System.out.println("Raghad");
        System.out.println("Shahad");
        System.out.println("Maha");
        System.out.println("Atheer");
Coach coach = new Coach();
trainee Trainee=new trainee();
        // Adding a course
        coach.addCourse("Java Programming", "CS101", 49.99);

        // Displaying courses
        // Displaying added courses
        ArrayList<Course> availableCourses = coach.getCourseList();
        Trainee.viewCourses(availableCourses);

        // Trainee selecting a course
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the Course ID you want to select: ");
        String selectedCourseId = scanner.nextLine();

        // Checking course availability
        boolean courseAvailable = Trainee.selectCourse(selectedCourseId, availableCourses);
        if (courseAvailable) {
            // Continue with the trainee's actions after selecting a course
    }
    
}}
