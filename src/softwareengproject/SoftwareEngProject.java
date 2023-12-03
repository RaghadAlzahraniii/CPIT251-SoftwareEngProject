
package softwareengproject;

import java.util.ArrayList;
import java.util.Scanner;

public class SoftwareEngProject {

    public static void main(String[] args) {

        Coach coach = new Coach("123456"); // suppose "123" with actual coach ID

        Scanner scanner = new Scanner(System.in);
        // Adding a course
        System.out.print("\nEnter Course Name : ");
        String name = scanner.nextLine();
        
        System.out.print("\nEnter courseId: ");
        String courseId = scanner.next();
        
        System.out.print("\nEnter price: ");
        double price = scanner.nextDouble();
        
        coach.addCourse(name, courseId, price);

        // Trainee selecting a course
        // Displaying courses
       
        Trainee trainee = new Trainee();
        ArrayList<Course> availableCourses = coach.getCourseList();
        trainee.viewCourses(availableCourses);

        boolean courseAvailable = false;
        while (!courseAvailable) {
            System.out.print("\nEnter the Course ID you want to select: ");
            String selectedCourseId = scanner.next();
            courseAvailable = trainee.selectCourse(selectedCourseId, availableCourses);

            if (!courseAvailable) {
                System.out.println("Course not available. Please enter another course ID.");
            }
        }

        // Continue with the trainee's actions after selecting a course
        // Create trainee profile 
        // Create trainee profile
        ArrayList<Trainee> traineeList = new ArrayList< Trainee>();
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
        
        Trainee trainee1 = new Trainee(Id, Name, Sex, Weight, Height, goal);
        trainee1.createProfile(Id, Name, Sex, Weight, Height, goal);
        traineeList.add(trainee1);

        // View trainee profile by coach (with ID verification)
        System.out.print("\nEnter Coach ID to view trainee profile:  ");
        String coachIdInput = scanner.nextLine();
        coach.viewTraineeProfile(traineeList,coachIdInput );
    }
}

