class Question4Individual {

    public String fullName;

    private int yearsOld;

    public Question4Individual(String fullName, int yearsOld) {
        this.fullName = fullName;
        setYearsOld(yearsOld);
    }

    protected void setYearsOld(int yearsOld) {
        if (yearsOld > 0) {
            this.yearsOld = yearsOld;
        } else {
            throw new IllegalArgumentException("Years must be positive.");
        }
    }

    String getDetails() {
        return "Name: " + fullName + ", Age: " + yearsOld;
    }
}


class Worker extends Question4Individual {
    String employeeNumber;

    // Constructor
    public Worker(String fullName, int yearsOld, String employeeNumber) {
        super(fullName, yearsOld);
        this.employeeNumber = employeeNumber;
    }

    public void displayDetails() {
        System.out.println(getDetails() + ", Employee Number: " + employeeNumber);
    }
}

class Manager extends Question4Individual {
    String department;

    public Manager(String fullName, int yearsOld, String department) {
        super(fullName, yearsOld);
        this.department = department;
    }


    public void displayManagerInfo() {
        System.out.println(getDetails() + ", Department: " + department);
    }
}

public class AccessControlShowcase {
    public static void main(String[] args) {
        Question4Individual individual = new Question4Individual("Mary Alueel", 36);
        System.out.println("Public member access: " + individual.fullName);

        Worker worker = new Worker("Peter Ayiik", 47, "W123");

        // Accessing public and package-private members
        System.out.println("Worker Name: " + worker.fullName); // Public access
        System.out.println("Employee Number: " + worker.employeeNumber); // Package-private access

        // Accessing protected method indirectly through a public method
        worker.displayDetails();

        // Creating an instance of Manager
        Manager manager = new Manager("Jacob Deng", 40, "Sales");
        manager.displayManagerInfo();

        // Attempting to access package-private method directly (allowed)
        System.out.println("Individual Info: " + individual.getDetails()); // Allowed within same package
    }
}
