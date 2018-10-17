package partA;
import org.joda.time.*;
import java.util.*;

public class Student {
    
    private String Name;
    private String Age;
    private LocalDate DOB;
    private String ID;
    private String UserName;
    private Course course;
    private ArrayList<String> modules = new ArrayList<String>();
    
    public Student(String n, String a, String ID, LocalDate Birth, Course c)
    {
        this.Name = n;
        this.Age = a;
        this.ID = ID;
        this.DOB = Birth;
        this.course = c;
        this.updateModules();
    }
    
    public String getUsername()
    {
        this.UserName = this.Name + "_" + this.Age;
        return this.UserName;
    }
    
    public void updateModules()
    {
        this.modules = this.course.getModules();
    }
}
