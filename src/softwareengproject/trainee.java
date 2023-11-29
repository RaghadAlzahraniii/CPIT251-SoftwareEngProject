/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareengproject;

import java.util.ArrayList;

class Trainee {
    ArrayList<Trainee> traineeList;
    private String Name;
    private String Id;
    private int Weight;
    private String Sex;
    private int Height;
    private String goal;

    public Trainee(String Name, String Id, int Weight, String Sex, int Height, String goal) {
        this.Name = Name;
        this.Id = Id;
        this.Weight = Weight;
        this.Sex = Sex;
        this.Height = Height;
        this.goal = goal;
    }

    public ArrayList<Trainee> getTraineeList() {
        return traineeList;
    }

   
    
    // Other trainee information fields

   void createProfile(String Id,String Name, String Sex, int Weight, int Height, String goal) {
       trainee newProfile = new trainee(Id,Name,  Sex, Weight,Height,  goal);
           traineeList.add(newProfile);
       
       
        // Set other trainee information here
        System.out.println("Profile created successfully!");
    }

   


    // Other methods in the Trainee class

    public void viewCourses(ArrayList<Course> courseList) {
        System.out.println("\nAvailable Courses:");
        for (Course course : courseList) {
            System.out.println("Name: " + course.getName());
            System.out.println("Course ID: " + course.getCourseId());
            System.out.println("Price: $" + course.getPrice());
            System.out.println("-----------");
        }
    }

    public boolean selectCourse(String courseId, ArrayList<Course> courseList) {
        for (Course course : courseList) {
            if (course.getCourseId().equals(courseId)) {
                System.out.println("Course selected: " + course.getName());
                return true; // Course is available
            }
        }
        System.out.println("Course Not available");
        return false; // Course is not available
    }

    public String getId() {
        return Id;
    }
     public String getName() {
        return Name;
    }

    public int getWeight() {
        return Weight;
    }

    public String getSex() {
        return Sex;
    }

    public int getHeight() {
        return Height;
    }

    public String getGoal() {
        return goal;
    }
       
}
