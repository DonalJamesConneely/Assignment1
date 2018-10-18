package partA;

import java.util.ArrayList;
import org.joda.time.LocalDate;

public class Course {
    
    private String name;
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Module> modules = new ArrayList<Module>();
    private LocalDate startdate;
    private LocalDate enddate;
    
    //Constructor.
    public Course (String n, LocalDate start, LocalDate end)
    {
        this.name = n;
        this.startdate = start;
        this.enddate = end;
    }

    //Get Name.
    public String getName() {
        return name;
    }

    //Set Nanme.
    public void setName(String name) {
        this.name = name;
    }

    //Get Start Date.
    public LocalDate getStartdate() {
        return startdate;
    }

    //Set Start Date.
    public void setStartdate(LocalDate startdate) {
        this.startdate = startdate;
    }

    //Get End Date.
    public LocalDate getEnddate() {
        return enddate;
    }

    //Set End Date.
    public void setEnddate(LocalDate enddate) {
        this.enddate = enddate;
    }
    
    //Set Modules as input list.
    public void setModules(ArrayList<Module> m)
    {
        this.modules = m;
    }
    
    //Set Students as input list.
    public void setStudents(ArrayList<Student> s)
    {
        this.students = s;
        
        for(Student stud: this.students)
        {
            stud.setCourse(this);
        }
    }
    
    //Return Module List
    public ArrayList getModules()
    {
        return this.modules;
    }
    
    //Return Student List
    public ArrayList getStudents()
    {
        return this.students;
    }
    
    //Add Student to Course
    public void addStudent(Student s)
    {
        this.students.add(s);
        
        s.setCourse(this);
    }
    
    //Add Module to Course.
    public void addModule(Module m)
    {
        this.modules.add(m);
        
        m.addCourse(this);
    }
    
    public void print()
    {
        System.out.println("//////////////Course Details//////////////");
        System.out.println("" + name + ", Start: " + startdate + ", End: " + enddate);
        System.out.println("//////////////Modules on Course//////////////");
        for(Module mod: this.modules)
        {
            System.out.println("" + mod.getName());
        }
        
        System.out.println("//////////////Students on Course//////////////");
        for(Student stud: this.students)
        {
            System.out.println("" + stud.getName() + ",\tUsername: " + stud.getUserName());
        }
    }
}
