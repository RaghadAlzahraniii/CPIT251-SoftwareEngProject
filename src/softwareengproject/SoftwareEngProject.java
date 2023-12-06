
package softwareengproject;

import java.util.ArrayList;
import java.util.Scanner;

public class SoftwareEngProject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Trainee> traineeList = new ArrayList< Trainee>();
        Coach coach = new Coach("123456"); // suppose "123" with actual coach ID
        
        //Ask the user
        System.out.print("\nAre you Coach or  Trainee?");
        String Coach_or_Trainee=scanner.next();
        
        
        //if coach
        if (Coach_or_Trainee.equalsIgnoreCase("Coach")){
           System.out.print("\n1:Adding a course");  
           System.out.print("\n2:View trainee profile by coach");
           System.out.print("\nEnter number");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
        // Adding a course
        System.out.print("\nEnter Course Name : ");
        String name = scanner.next();
        
        System.out.print("\nEnter courseId: ");
        String courseId = scanner.next();
        
        System.out.print("\nEnter price: ");
        double price = scanner.nextDouble();
        
        coach.addCourse(name, courseId, price);
              break;
              case 2:
          // View trainee profile by coach (with ID verification)
        System.out.print("\nEnter Coach ID to view trainee profile: ");
        String coachIdInput = scanner.nextLine();
        coach.viewTraineeProfile(traineeList, coachIdInput);
         break;
        
        }
        }
        else if(Coach_or_Trainee.equalsIgnoreCase("Trainee")){
        System.out.print("\n1:Trainee selecting a course");
        System.out.print("\n2:Create trainee profile");
        System.out.print("\nEnter number");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
        
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

         break;
         case 2:
        // Create trainee profile 
        // Create trainee profile
        
        System.out.print("\nEnter your ID: ");
        String Id = scanner.next(); // Use next() for ID
        
        System.out.print("\nEnter your Name: ");
        String Name = scanner.next(); // Use next() for Name
        
        System.out.print("\nEnter your Phone number: ");
        String Phone = scanner.next(); // Use next() for phone
        
        System.out.print("\nEnter your Email: ");
        String Email = scanner.next(); // Use next() for email
        
        System.out.print("\nEnter your Sex: ");
        String Sex = scanner.next(); // Use next() for Sex
        
        System.out.print("\nEnter your Weight: ");
        int Weight = scanner.nextInt();
        
        System.out.print("\nEnter your Height: ");
        int Height = scanner.nextInt();
        
        scanner.nextLine(); // Consume newline character
        System.out.print("\nEnter the Goal: ");
        String goal = scanner.nextLine(); // 
        
        Trainee trainee1 = new Trainee(Id, Name,Phone,Email, Sex, Weight, Height, goal);
        trainee1.createProfile(Id, Name,Phone,Email, Sex, Weight, Height, goal);
        traineeList.add(trainee1);
          break;
        }}
    }}

