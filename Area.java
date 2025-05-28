import java.util.Scanner;

class Area {
    private int length;
    private int breadth;
    private double base;
    private double height;
    public static Scanner scanner = new Scanner(System.in);

    public void AreaOfRectangle() {
        System.out.print("Enter length: ");
        this.length = scanner.nextInt();
        System.out.print("Enter breadth: ");
        this.breadth = scanner.nextInt();
        int area = this.length * this.breadth;
        System.out.println("Area of rectangle: " + area);
    }

    public void AreaOfSquare() {
        System.out.print("Enter side length: ");
        this.length = scanner.nextInt();
        int area = this.length * this.length;
        System.out.println("Area of square: " + area);
    }

    public void AreaOfTriangle() {
        System.out.print("Enter base: ");
        this.base = scanner.nextDouble();
        System.out.print("Enter height: ");
        this.height = scanner.nextDouble();
        double area = 0.5 * this.base * this.height;
        System.out.println("Area of triangle: " + area);
    }
}

public class FindArea {
    public static void main(String[] args) {
        Area area = new Area();
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Area Calculator ---");
            System.out.println("1. Area Of Rectangle");
            System.out.println("2. Area Of Square");
            System.out.println("3. Area Of Triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = Area.scanner.nextInt();

            switch (choice) {
                case 1:
                    area.AreaOfRectangle();
                    break;
                case 2:
                    area.AreaOfSquare();
                    break;
                case 3:
                    area.AreaOfTriangle();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using the Area Calculator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        Area.scanner.close();
    }
}
