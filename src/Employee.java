import java.util.Date;

public class Employee {

    private String empName;
    private int empId;
    private String empDept;
    private Date hireDate;
    private double hourlyRate=20.10;
    private int workHours=40;

    public String getEmployeeDetails(String empName,String empDept,int empId ,Date hireDate,double hourlyRate,int workHours)
    {
        String details="Employee Name "+empName+"Employee Department "+empDept+"Employee ID "+ empId+"Hiring date "+hireDate+"Pay rate "+hourlyRate+"working hous "+workHours;
        return details;
    }


    public double getSalary()
    {
        return hourlyRate*workHours;
    }
}
