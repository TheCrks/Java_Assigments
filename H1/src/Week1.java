import java.util.Scanner;

public class Week1 {


    public static void main(String[] args) {
        System.out.println("Radius: ");
        Scanner input = new Scanner(System.in);

        float radius = input.nextFloat();
        double area = AreaCalculate(radius);

        System.out.println("Area is : " + area );
    }

    public static double AreaCalculate(double Radius){
        return Radius * Radius * 3.14;
    }
}
