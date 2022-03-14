public class Manager extends Employee
{
    private double allowance=200;

    @Override
    public double getSalary() {
        return super.getSalary() + allowance;


    }
}

