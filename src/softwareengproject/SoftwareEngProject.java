/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareengproject;

import java.util.ArrayList;
import java.util.Scanner;

public class SoftwareEngProject {
    public static void main(String[] args) {
        Coach coach = new Coach("Coach123"); // Replace "Coach123" with actual coach ID
        Trainee trainee = new Trainee();

        // Adding a course
        coach.addCourse("Java Programming", "CS101", 49.99);

        // Displaying courses
        ArrayList<Course> availableCourses = coach.getCourseList();
        trainee.viewCourses(availableCourses);

        // Trainee selecting a course
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the Course ID you want to select: ");
        String selectedCourseId = scanner.nextLine();

        boolean courseAvailable = trainee.selectCourse(selectedCourseId, availableCourses);
        if (courseAvailable) {
            // Continue with the trainee's actions after selecting a course

            // Create trainee profile
            trainee.createProfile("John Doe", "example@email.com");
            
            // View trainee profile by coach (with ID verification)
            System.out.print("\nEnter Coach ID to view trainee profile: ");
            String coachIdInput = scanner.nextLine();
            coach.viewTraineeProfile(trainee, coachIdInput);
        }
    }
}
