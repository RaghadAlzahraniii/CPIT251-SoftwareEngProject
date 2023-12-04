package softwareengproject;

import java.util.ArrayList;

class Trainee {

    ArrayList<Trainee> traineeList;
    private String Id;
    private String Name;
    private String Phone;
    private String Email;
    private String Sex;
    private int Weight;
    private int Height;
    private String goal;

    public Trainee(String Id, String Name, String Phone, String Email, String Sex, int Weight, int Height, String goal) {
        this.Id = Id;
        this.Name = Name;
        this.Phone = Phone;
        this.Email = Email;
        this.Sex = Sex;
        this.Weight = Weight;
        this.Height = Height;
        this.goal = goal;
    }

    Trainee() {
    }

    public ArrayList<Trainee> getTraineeList() {
        return traineeList;
    }

    // Other trainee information fields
    public void createProfile(String Id, String Name, String Phone, String Email, String Sex, int Weight, int Height, String goal) {

        this.Id = Id;
        this.Name = Name;
        this.Phone = Phone;
        this.Email = Email;
        this.Sex = Sex;
        this.Weight = Weight;
        this.Height = Height;
        this.goal = goal;
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
                return true;
            }// Course is available
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
    public String getPhone() {
        return Phone;
    }

    public String getEmail() {
        return Email;
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
