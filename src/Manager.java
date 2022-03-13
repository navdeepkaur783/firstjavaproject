public class Manager extends Employee
{
    double allowance;

    @Override
    protected double getSalary(int workHours, double allowance)
    {
        return super.getSalary()+allowance;
    }
}

