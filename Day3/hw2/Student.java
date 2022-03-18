package Day3.hw2;

public class Student extends User{
    private String[] courses;
    public Student(){

    }
    public Student(int userId,String firstName,String lastName,String password,String[] courses){
        super(userId,firstName, lastName, password);
        this.courses = courses;
    }
    public String[] getCourses() {
        return courses;
    }
    public void setCourses(String[] courses) {
        this.courses = courses;
    }
    
}
