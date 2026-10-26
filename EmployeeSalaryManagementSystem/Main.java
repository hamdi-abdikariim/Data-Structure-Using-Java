package Assignment.EmployeeSalaryManagementSystem;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = {
                new FullTimeEmployee("EMP001", "Asma Abdullhi", "IT", 500, 50),
                new PartTimeEmployee("EMP002", " Hamda Jamaal", "Finance", 13, 8),
                new Manager("EMP003", "Mohamed Omar", "Management", 1000, 200)
        };

        String[] categories = {
                "Full-Time Employee",
                "Part-Time Employee",
                "Manager"
        };

        System.out.println("===== EMPLOYEE SALARY REPORT =====");
        System.out.println();

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Employee ID: " + employees[i].employeeId);
            System.out.println("Name: " + employees[i].name);
            System.out.println("Category: " + categories[i]);

            System.out.printf("Monthly Salary: $"+employees[i].calculateSalary());

            System.out.println();
        }
    }
}

