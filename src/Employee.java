import java.util.Date;

public class Employee {

    private String empName;
    private int empId;
    private String empDept;
    private Date hireDate;
    private double hourlyRate;
    int workHours;
    public Employee()
    {
        System.out.println("Base Class Constructor");
    }

    public String getEmployeeDetails(String empName,String empDept,int empId ,Date hireDate,double hourlyRate,int workHours)
    {
        String details="Employee Name "+empName+"Employee Department "+empDept+"Employee ID "+ empId+"Hiring date "+hireDate+"Pay rate "+hourlyRate+"working hous "+workHours;
        return details;
    }
    public double getSalary(double hourlyRate,int workHours)
    {
        return hourlyRate*workHours;
    }
}
