import java.util.Scanner;
public class CylinderVolume{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        double r = scanner.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double h = scanner.nextDouble();
        double volume = Math.PI * Math.pow(r, 2) * h;
        System.out.println("The volume of the cylinder is: " + volume);
    }
}
