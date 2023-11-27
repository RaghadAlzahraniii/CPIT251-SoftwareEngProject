/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareengproject;

import java.util.ArrayList;

class Trainee {
    private String name;
    private String contactDetails;
    // Other trainee information fields

    public void createProfile(String name, String contactDetails) {
        this.name = name;
        this.contactDetails = contactDetails;
        // Set other trainee information here
        System.out.println("Profile created successfully!");
    }

    public String getName() {
        return name;
    }

    public String getContactDetails() {
        return contactDetails;
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
}
