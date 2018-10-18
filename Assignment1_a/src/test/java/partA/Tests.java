package partA;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import org.joda.time.LocalDate;


public class Tests {
    
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Module> modules = new ArrayList<Module>();
    private ArrayList<Course> courses = new ArrayList<Course>();
    private Student var;
    private Course cour;
    private Module mod;
    
    @Before
    //Run this setup before tests.//
    public void setUp() throws Exception
    {
        //Initialise the Array List to variable sizes.//
        cour = new Course("ECE", LocalDate.parse("2018-09-01"), LocalDate.parse("2018-12-20"));
        mod = new Module("Subject", "EE???");
        var = new Student("Bill", "21", "15379999", LocalDate.parse("1997-07-01"));
        
        courses.add(cour);
        modules.add(mod);
        students.add(var);
    }
    
    @Test
    public void getUsernameTest()
    {
            String expected = "Bill_21";
            String real = students.get(0).getUsername();
            
            assertEquals(expected, real);
    }
}
