//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        // Array of Employees (Polymorphism in action)
        Employee[] employees = new Employee[3];

        employees[0] = new Manager(1, "Ahmed", 10000, 5000);
        employees[1] = new SalesPerson(2, "Amr", 7000, 2000);
        employees[2] = new Intern(3, "Omar", 3000);

        // instanceof to check the specific type of each employee and print their role.
        // Loop through employees
        for (Employee emp : employees) {
            // Print Role using instanceof
            if (emp instanceof Manager) {
                System.out.println("Role: Manager");
            } else if (emp instanceof SalesPerson) {
                System.out.println("Role: SalesPerson");
            } else if (emp instanceof Intern) {
                System.out.println("Role: Intern");
            }

            emp.displayInfo();
            System.out.println("Total Salary: " + emp.calculateSalary());
            System.out.println("-------------------");
        }
    }}
