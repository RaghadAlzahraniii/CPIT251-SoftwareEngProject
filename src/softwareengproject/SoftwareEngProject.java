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
       Scanner scanner = new Scanner(System.in);
        // Adding a course////////////خلصنا
        String name=scanner.next();
        String courseId=scanner.next();
        double price=scanner.nextDouble();
        coach.addCourse("Keto Diet", "KO100", 150.0);

        

        // Trainee selecting a course
       // Displaying courses
        ArrayList<Course> availableCourses = coach.getCourseList();
        trainee.viewCourses(availableCourses);
        System.out.print("\nEnter the Course ID you want to select: ");
        String selectedCourseId = scanner.nextLine();
          
        boolean courseAvailable = trainee.selectCourse(selectedCourseId, availableCourses);
        if (courseAvailable) {
            // Continue with the trainee's actions after selecting a course

            // Create trainee profile ///////////////خلصنا ذي الميثودا
            System.out.print("\nEnter the your ID:  ");
        String Id = scanner.nextLine();
        System.out.print("\nEnter the your Name:  ");
        String Name = scanner.nextLine();
         System.out.print("\nEnter the your Sex:  ");
        String Sex = scanner.nextLine();
        System.out.print("\nEnter the your Weight:  ");
        int Weight = scanner.nextInt();
         System.out.print("\nEnter the your Height:  ");
        int Height = scanner.nextInt();
        System.out.print("\nEnter the Goal:  ");
        String goal = scanner.nextLine();
        
            trainee.createProfile(Id,Name,Sex,Weight,Height,goal);
          
            // View trainee profile by coach (with ID verification)//فيه مشكله
            System.out.print("\nEnter Coach ID to view trainee profile: ");
            String coachIdInput = scanner.nextLine();
            coach.viewTraineeProfile(trainee, coachIdInput);
        }
    }
}
