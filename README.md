
interface Displayable {
    void displayDetails();
}

// Abstract parent class
abstract class Student {
    private String name;
    private String registrationNumber;

    // Constructor
    Student(String name, String registrationNumber) {
        this.name = name;
        this.registrationNumber = registrationNumber;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    // Abstract method
    public abstract double calculateFinalScore();
}

// Child class
class CourseworkStudent extends Student implements Displayable {
    private double courseworkMarks;
    private double examMarks;

    CourseworkStudent(String name, String registrationNumber,
                      double courseworkMarks, double examMarks) {
        super(name, registrationNumber);
        this.courseworkMarks = courseworkMarks;
        this.examMarks = examMarks;
    }

    // Implement abstract method
    @Override
    public double calculateFinalScore() {
        return courseworkMarks * 0.4 + examMarks * 0.6;
    }

    // Implement interface method
    @Override
    public void displayDetails() {
        System.out.println("Student Name: " + getName());
        System.out.println("Registration Number: "
                           + getRegistrationNumber());
        System.out.println("Final Score: "
                           + calculateFinalScore());
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Runtime polymorphism
        Student student = new CourseworkStudent(
            "John", "UICT/001", 80, 70
        );

        System.out.println("STUDENT RESULTS");
        student.getName();
        System.out.println("Final Score: "
                           + student.calculateFinalScore());

        Displayable display = (Displayable) student;
        display.displayDetails();
    }
}
