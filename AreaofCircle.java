import java.util.Scanner;
public class CircleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double r = scanner.nextDouble();
        double area = Math.PI * Math.pow(r, 2);

        System.out.println("The area of the circle is: " + area);
    }
}
