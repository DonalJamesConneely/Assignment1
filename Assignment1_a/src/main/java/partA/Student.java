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
    private ArrayList<Module> modules = new ArrayList<Module>();
    
    //Constructor.
    public Student(String n, String a, String ID, LocalDate Birth)
    {
        this.Name = n;
        this.Age = a;
        this.ID = ID;
        this.DOB = Birth;
        this.UserName = this.Name + "_" + this.Age;
    }

    //Get Name.
    public String getName() {
        return Name;
    }

    //Set Name.
    public void setName(String Name) {
        this.Name = Name;
    }

    //Get Age.
    public String getAge() {
        return Age;
    }

    //Set Age.
    public void setAge(String Age) {
        this.Age = Age;
    }

    //Get Date of Birth.
    public LocalDate getDOB() {
        return DOB;
    }

    //Set Date of Birth.
    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    //Get ID.
    public String getID() {
        return ID;
    }
    
    //Set ID.
    public void setID(String ID) {
        this.ID = ID;
    }

    //Return the Students username.
    public String getUserName() {
        return UserName;
    }
    
    //Set the course of this student
    public void setCourse(Course c)
    {
        this.course = c;
    }
    
    //Set the Modules of this student.
    public void setModules(ArrayList<Module> mod)
    {
        this.modules = mod;
    }
    
    //Return the Course of this student.
    public Course getCourse()
    {
        return this.course;
    }
    
    //Return Module List
    public ArrayList getModules()
    {
        return this.modules;
    }
    
    //Add Module to student Module List.
    public void addModule(Module m)
    {
        this.modules.add(m);
    }
}
