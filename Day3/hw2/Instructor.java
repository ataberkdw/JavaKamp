package Day3.hw2;

public class Instructor extends User{
    private String[] givenCourses;
    private String[] students;
    public Instructor(){

    }
    public Instructor(int userId,String firstName,String lastName,String password,String[] givenCourses,String[] students){
        super(userId,firstName, lastName, password);
        this.givenCourses = givenCourses;
        this.students = students;
    }
    public String[] getGivenCourses() {
        return givenCourses;
    }
    public void setGivenCourses(String[] givenCourses) {
        this.givenCourses = givenCourses;
    }
    public String[] getStudents() {
        return students;
    }
    public void setStudents(String[] students) {
        this.students = students;
    }
    
}
