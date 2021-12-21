import java.util.Scanner;

public class hafta6 {
    public static void main(String[] args) throws IllegalArgumentException {
        Scanner input = new Scanner(System.in);
        int radius;
        radius = -5;
        try{
        setRad(radius);
        }
        catch (IllegalArgumentException e){
          radius*=-1;
            System.out.println("Exception");
        }
        finally {
            System.out.println("radius: "+radius);
        }
    }
    public static void setRad(int radiuss) throws IllegalArgumentException {
        if (radiuss <0){
            throw new IllegalArgumentException();
        }
    }

}
