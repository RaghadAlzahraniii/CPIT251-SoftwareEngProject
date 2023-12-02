/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
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
 * @author mahaf
 */
public class TraineeTest {
    
    public TraineeTest() {
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
     * Test of getTraineeList method, of class Trainee.
     */
    @Ignore
    @Test
    public void testGetTraineeList() {
        System.out.println("getTraineeList");
        Trainee instance = new Trainee();
        ArrayList<Trainee> expResult = null;
        ArrayList<Trainee> result = instance.getTraineeList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of createProfile method, of class Trainee.
     */
    @Test
    public void testCreateProfile() {
        System.out.println("createProfile");
        String Id = "210567";
        String Name = "maha";
        String Sex = "famale";
        int Weight = 65;
        int Height = 165;
        String goal = "Lose weight";
        Trainee instance = new Trainee();
        instance.createProfile(Id, Name, Sex, Weight, Height, goal);
        assertEquals(Id, instance.getId());
        assertEquals(Name, instance.getName());
        assertEquals(Sex, instance.getSex());
        assertEquals(Weight, instance.getWeight());
        assertEquals(Height, instance.getHeight());
        assertEquals(goal, instance.getGoal());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of viewCourses method, of class Trainee.
     */
    @ Ignore
    @Test
    public void testViewCourses() {
        System.out.println("viewCourses");
        ArrayList<Course> courseList = null;
        Trainee instance = new Trainee();
        instance.viewCourses(courseList);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of selectCourse method, of class Trainee.
     */
    @Ignore
    @Test
    public void testSelectCourse() {
        System.out.println("selectCourse");
        String courseId = "";
        ArrayList<Course> courseList = null;
        Trainee instance = new Trainee();
        boolean expResult = false;
        boolean result = instance.selectCourse(courseId, courseList);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Trainee.
     */
    @Ignore
    @Test
    public void testGetId() {
        System.out.println("getId");
        Trainee instance = new Trainee();
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Trainee.
     */
    @Ignore
    @Test
    public void testGetName() {
        System.out.println("getName");
        Trainee instance = new Trainee();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getWeight method, of class Trainee.
     */
    @Ignore
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        Trainee instance = new Trainee();
        int expResult = 0;
        int result = instance.getWeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSex method, of class Trainee.
     */
    @Ignore
    @Test
    public void testGetSex() {
        System.out.println("getSex");
        Trainee instance = new Trainee();
        String expResult = "";
        String result = instance.getSex();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getHeight method, of class Trainee.
     */
    @Ignore
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        Trainee instance = new Trainee();
        int expResult = 0;
        int result = instance.getHeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getGoal method, of class Trainee.
     */
    @Ignore
    @Test
    public void testGetGoal() {
        System.out.println("getGoal");
        Trainee instance = new Trainee();
        String expResult = "";
        String result = instance.getGoal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
