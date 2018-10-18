package partA;

import java.util.ArrayList;

public class Module {
    
    private String name;
    private String ID;
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Course> courses = new ArrayList<Course>();
    
    //Constructor.
    public Module (String n, String id)
    {
        this.name = n;
        this.ID = id;
    }
    
    //Set Courses as input list.
    public void setCourses(ArrayList<Course> c)
    {
        this.courses = c;
    }
    
    //Set Students as input list.
    public void setStudents(ArrayList<Student> s)
    {
        this.students = s;
    }
    
    //Return Course List
    public ArrayList getCourses()
    {
        return this.courses;
    }
    
    //Return Student List
    public ArrayList getStudents()
    {
        return this.students;
    }
    
    //Add a student to the Module.
    public void addStudent(Student s)
    {
        this.students.add(s);
      
        s.addModule(this);
    }
    
    //Add a Course to the Module list.
    public void addCourse(Course c)
    {
        this.courses.add(c);
    }
}