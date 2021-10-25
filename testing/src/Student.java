public class Student {

    private Name name;
    private double gpa;

    public Student(Name name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public Student(String first, String last, double gpa) {
        name = new Name(first, last);
        this.gpa = gpa;
    }

    public String toString() {
        return name.toString() + " " + gpa; // this is delegation
    
    }
    
    public boolean equals(Student other) {
        return name.equals(other.name);
    }

    public Name getName() {
        return name;
    }


}
