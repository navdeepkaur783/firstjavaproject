import java.lang.*;
public class areaCircle {
    public static void main(String args[])
    {
        double area_circle=circle_area(4.5);
        System.out.println("Area of circle"+" "+area_circle);
    }
    public static double circle_area(double radius)
    {
        return Math.PI *radius*radius;
    }

}
