import java.util.Date;

public abstract class Employee {

    private String empName;
    private int empId;
    private String empDept;
    private Date hireDate;
    private double hourlyRate;
    int workHours;

    public String getEmployeeDetails()
    {
        String details="Employee Name "+empName+"Employee Department "+empDept+"Employee ID "+
        empId+"Hiring Date is "+hireDate+"Hourly pay rate "+hourlyRate;
        return details;
    }
    public double getSalary()
    {
        return hourlyRate*workHours;
    }


    protected abstract double getSalary(int workHours, double allowance);
}
