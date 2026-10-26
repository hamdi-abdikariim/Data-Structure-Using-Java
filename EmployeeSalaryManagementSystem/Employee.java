package Assignment.EmployeeSalaryManagementSystem;


class Employee {
    String employeeId;
    String name;
    String department;
    double basicSalary;

    Employee(String employeeId, String name,String department, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        return basicSalary;
    }

    void displayInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Category: " + getClass().getSimpleName());
        System.out.printf("Monthly Salary: $"+ calculateSalary());
        System.out.println();
    }
}

class FullTimeEmployee extends Employee {
    double allowance;

    FullTimeEmployee(String id, String name, String department,double basicSalary, double allowance) {
        super(id, name, department, basicSalary);
        this.allowance = allowance;
    }

    @Override
    double calculateSalary() {
        return basicSalary + allowance;
    }
}

class PartTimeEmployee extends Employee {
    double hoursWorked;
    double hourlyRate;

    PartTimeEmployee(String id, String name, String department,double hoursWorked, double hourlyRate) {
        super(id, name, department, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

class Manager extends Employee {
    double bonus;

    Manager(String id, String name, String department,double basicSalary, double bonus) {
        super(id, name, department, basicSalary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return basicSalary + bonus;
    }
}

