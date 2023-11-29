/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareengproject;

import java.util.ArrayList;

class Coach {
    private ArrayList<Course> courseList;
     // Assuming Trainee class exists
    private String coachId; // Adding Coach ID for verification

    public Coach(String coachId) {
        this.courseList = new ArrayList<>();
        this.traineeList = new ArrayList<>();
        this.coachId = coachId;
    }

    public void addCourse(String name, String courseId, double price) {
        Course newCourse = new Course(name, courseId, price);
        courseList.add(newCourse);
        System.out.println("Course added successfully!");
    }

    public void viewTraineeProfile(Trainee trainee, String requestingCoachId) {
        if (requestingCoachId.equals(coachId)) {
            System.out.println("Trainee Profile:");
            System.out.println("Name: " + trainee.getName());
            System.out.println("Contact Details: " + trainee.getContactDetails());
            // Display other trainee information here
        } else {
            System.out.println("You are not authorized to view this trainee's profile.");
        }
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    // Other methods in the Coach class...
}
