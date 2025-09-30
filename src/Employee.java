abstract class Employee {
    // Encapsulation: private fields
    private int id;
    private String name;
    private double baseSalary;

    // Constructor
    public Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    // Abstract Method (must be implemented in subclasses)
    public abstract double calculateSalary();

    // Concrete Method
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }
}
// Manager Class
class Manager extends Employee {
    private double bonus;

    public Manager(int id, String name, double baseSalary, double bonus) {
        super(id, name, baseSalary);
        this.bonus = bonus;
    }

    public double getBonus() { return bonus; }
    public void setBonus(double bonus) { this.bonus = bonus; }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}

// SalesPerson Class
class SalesPerson extends Employee {
    private double commission;

    public SalesPerson(int id, String name, double baseSalary, double commission) {
        super(id, name, baseSalary);
        this.commission = commission;
    }

    public double getCommission() { return commission; }
    public void setCommission(double commission) { this.commission = commission; }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + commission;
    }
}

// Intern Class
class Intern extends Employee {
    public Intern(int id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return 3000; // Fixed salary for interns
    }
}
  