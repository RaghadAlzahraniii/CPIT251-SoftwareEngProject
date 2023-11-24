/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareengproject;

import java.util.ArrayList;

/**
 *
 * @author borga
 */
class Coach {
   private ArrayList<Course> courseList;

    public Coach() {
        this.courseList = new ArrayList<>();
    }

    public void addCourse(String name, String courseId, double price) {
        Course newCourse = new Course(name, courseId, price);
        courseList.add(newCourse);
        System.out.println("Course added successfully: " + newCourse.getName());
    }

    public void displayCourses() {
        System.out.println("List of Courses:");
        for (Course course : courseList) {
            System.out.println("Name: " + course.getName());
            System.out.println("Course ID: " + course.getCourseId());
            System.out.println("Price: $" + course.getPrice());
            System.out.println("------------------------");
        }
    } 
}
