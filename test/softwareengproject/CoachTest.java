/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareengproject;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author borga
 */
public class CoachTest {
    
    public CoachTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addCourse method, of class Coach.
     */
    @Test
    public void testAddCourse() {
    System.out.println("testAddCourse");
    String name = "Kito diet";
    String courseId = "KD100";
    double price = 150.0;
 
     Coach instance = new Coach(courseId);
   
    // Call the addCourse method

    // Assert that the course has been added correctly
    // You can add additional assertions if needed
    // For example, you can assert the size of the course list
    instance.addCourse(name, courseId, price);
    assertEquals(1, instance.getCourseList().size());

        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     /**
     * Test of viewTraineeProfile method, of class Coach.
     */
     //@Ignore
    
    @Test
    public void testViewTraineeProfile() {
        System.out.println("viewTraineeProfile");
        ArrayList<Trainee> traineeList = new ArrayList<>();
        String requestingCoachID = "210756";
        Coach instance = new Coach("210001");
        instance.viewTraineeProfile(traineeList, requestingCoachID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCourseList method, of class Coach.
     */
   //@Ignore
    @Test
    public void testGetCourseList() {
        System.out.println("getCourseList");
        Coach instance = new Coach("1200023"); // Initialize the Coach instance
        ArrayList<Course> expResult = new ArrayList<>(); // Initialize the expected result
        ArrayList<Course> result = instance.getCourseList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
