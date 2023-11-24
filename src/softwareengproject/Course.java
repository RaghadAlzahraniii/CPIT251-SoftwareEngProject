/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareengproject;

/**
 *
 * @author borga
 */
class Course {
   private String name;
    private String courseId;
    private double price;

    public Course(String name, String courseId, double price) {
        this.name = name;
        this.courseId = courseId;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCourseId() {
        return courseId;
    }

    public double getPrice() {
        return price;
    } 
}
