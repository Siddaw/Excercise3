public class Student {
    private static int idCounter = 0;


    private final int studentId;
    private final String studentName;


    {
        studentId = ++idCounter;  // Assign a unique ID to each instance
    }


    public Student(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        this.studentName = name.trim();
    }


    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }


    public static int getTotalStudents() {
        return idCounter;
    }


    @Override
    public String toString() {
        return "Student ID = " + studentId + ", Name = " + studentName;
    }


    public static void main(String[] args) {

        Student student1 = null;
        Student student2 = null;
        Student student3 = null;

        try {
            student1 = new Student("Alice");
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating student1: " + e.getMessage());
        }

        try {
            student2 = new Student("");
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating student2: " + e.getMessage());
        }

        try {
            student3 = new Student("Charlie");
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating student3: " + e.getMessage());
        }


        if (student1 != null) System.out.println(student1);
        if (student2 != null) System.out.println(student2);
        if (student3 != null) System.out.println(student3);


        System.out.println("Total students created: " + Student.getTotalStudents());
    }
}
