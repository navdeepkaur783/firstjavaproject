public class Manager extends Employee
{
    double allowance;

    @Override
    public double getSalary(double allowance) {
        return super.getSalary(16.45, 80) + allowance;


    }
}

