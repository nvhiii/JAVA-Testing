public class Course {

    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) { // constructor
        this.courseName = courseName;
    }

    public void addStudent(String student) { // static method
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() { // getter method (accessor)
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

  /*  public void dropStudent(String student) {

    }

   */
}
