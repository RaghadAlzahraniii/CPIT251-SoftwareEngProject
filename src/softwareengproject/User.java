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

public class User {
    
    private ArrayList<User> user;
    private String firstName;
    private String lastName;
    private String ID;
    private String PhoneNumber;
    private String Email;
    private String CoachOrTrainee;

    public User(String firstName, String lastName, String ID, String PhoneNumber,String CoachOrTrainee) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.PhoneNumber = PhoneNumber;
        this.CoachOrTrainee= CoachOrTrainee;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getID() {
        return ID;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public String getCoachOrTrainee() {
        return CoachOrTrainee;
    }
    
}
