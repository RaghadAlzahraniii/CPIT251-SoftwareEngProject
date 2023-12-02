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
         
        Coach coach = new Coach("123456"); // Replace "Coach123" with actual coach ID
        Trainee trainee = new Trainee();
         ArrayList<Trainee> traineeList = new ArrayList< Trainee>();
        
       Scanner scanner = new Scanner(System.in);
        // Adding a course////////////خلصنا
        String name=scanner.next();
        String courseId=scanner.next();
        double price=scanner.nextDouble();
        coach.addCourse("Keto Diet", "KO100", 150.0);

        

        /*// Trainee selecting a course
       // Displaying courses
        ArrayList<Course> availableCourses = coach.getCourseList();
        trainee.viewCourses(availableCourses);
        System.out.print("\nEnter the Course ID you want to select: ");
        String selectedCourseId = scanner.nextLine();
          
        boolean courseAvailable = trainee.selectCourse(selectedCourseId, availableCourses);
        if (courseAvailable) {
            // Continue with the trainee's actions after selecting a course*/

            // Create trainee profile ///////////////خلصنا ذي الميثودا
           // Create trainee profile
            System.out.print("\nEnter your ID: ");
            String Id = scanner.next(); // Use next() for ID
            System.out.print("\nEnter your Name: ");
            String Name = scanner.next(); // Use next() for Name
            System.out.print("\nEnter your Sex: ");
            String Sex = scanner.next(); // Use next() for Sex
            System.out.print("\nEnter your Weight: ");
            int Weight = scanner.nextInt();
            System.out.print("\nEnter your Height: ");
            int Height = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            System.out.print("\nEnter the Goal: ");
            String goal = scanner.nextLine(); // 
            Trainee trainee1 = new Trainee(Id,Name,Sex,Weight,Height,goal);
            traineeList.add(trainee1);
             
            // View trainee profile by coach (with ID verification)//فيه مشكله
            System.out.print("\nEnter Coach ID to view trainee profile: ");
            String coachIdInput = scanner.nextLine();
            coach.viewTraineeProfile(traineeList, coachIdInput);
        }
    }

