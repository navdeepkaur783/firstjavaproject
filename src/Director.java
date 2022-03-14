public class Director extends Manager{
   private double bonus=500;
    @Override
    public double getSalary() {
        return super.getSalary()+bonus;
    }
}
