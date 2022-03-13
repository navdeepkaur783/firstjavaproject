import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        Employee employee=new Employee();
        Manager manager=new Manager();


        manager.getEmployeeDetails("Navdeep","XYZ",34, Date.valueOf("1992-03-01"),16.75,80);
        manager.getSalary(200);



    }
}
