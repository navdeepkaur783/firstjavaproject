import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        Employee employee=new Employee();
        Manager manager=new Manager();

        Director director=new Director();

        System.out.println(employee.getEmployeeDetails("Navdeep", "XYZ", 34, Date.valueOf("1992-03-01"), 16.75, 80));
        System.out.println("Employee Salary is "+employee.getSalary());
        System.out.println("Manager Salary is "+manager.getSalary());
        System.out.println("Salary of Director is"+director.getSalary());


        manager.getEmployeeDetails("Navdeep","XYZ",34, Date.valueOf("1992-03-01"),16.75,80);
        manager.getSalary();



    }
}
