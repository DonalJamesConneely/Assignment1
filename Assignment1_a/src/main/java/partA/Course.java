package partA;

import java.util.ArrayList;
import org.joda.time.LocalDate;

public class Course {
    
    private String name;
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Module> modules = new ArrayList<Module>();
    private LocalDate startdate;
    private LocalDate enddate;
    
    public Course (String n, LocalDate start, LocalDate end)
    {
        this.name = n;
        this.startdate = start;
        this.enddate = end;
    }
    
    //Set Modules as input list.
    public void setModules(ArrayList<Module> m)
    {
        this.modules = m;
        
        //Loop through all students and update their module lists.
        for(Student stud: this.students)
        {
            for(Module mod : this.modules)
            {
                mod.addStudent(stud);
                stud.updateModules();
            }
        }
    }
    
    //Set Students as input list.
    public void setStudents(ArrayList<Student> s)
    {
        this.students = s;
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
        
        //Loop through all modules and add student to modules.
        for(Module mod: this.modules)
        {
            mod.addStudent(s);
        }
    }
    
    //Add Module to Course.
    public void addModule(Module m)
    {
        this.modules.add(m);
        
        //Loop through all students and update their module lists.
        for(Student stud: this.students)
        {
            m.addStudent(stud);
            stud.updateModules();
        }
    }
}
