package Lessom16;

public class Test4 {
}

class Employee {
    double salary;
    boolean isManager;

    Employee (double salary, boolean isManager) {
        this.salary = salary;
        this.isManager = isManager;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(100.0, true);
        System.out.println("On manager? "+ emp.isManager+" "+emp.salary);
    }
}
