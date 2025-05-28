import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- String Operations ---");
            System.out.println("1. CharAt");
            System.out.println("2. CompareTo");
            System.out.println("3. Concat");
            System.out.println("4. Equals");
            System.out.println("5. Replace");
            System.out.println("6. Split");
            System.out.println("7. Trim");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter a string: ");
                    String str1 = sc.nextLine();
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();
                    System.out.println("Character at index " + index + ": " + str1.charAt(index));
                    break;

                case 2:
                    System.out.print("Enter first string: ");
                    String s1 = sc.nextLine();
                    System.out.print("Enter second string: ");
                    String s2 = sc.nextLine();
                    System.out.println("CompareTo result: " + s1.compareTo(s2));
                    break;

                case 3:
                    System.out.print("Enter first string: ");
                    String c1 = sc.nextLine();
                    System.out.print("Enter second string: ");
                    String c2 = sc.nextLine();
                    System.out.println("Concatenated string: " + c1.concat(c2));
                    break;

                case 4:
                    System.out.print("Enter first string: ");
                    String e1 = sc.nextLine();
                    System.out.print("Enter second string: ");
                    String e2 = sc.nextLine();
                    System.out.println("Are they equal? " + e1.equals(e2));
                    break;

                case 5:
                    System.out.print("Enter string: ");
                    String rep = sc.nextLine();
                    System.out.print("Enter character to replace: ");
                    char oldChar = sc.nextLine().charAt(0);
                    System.out.print("Enter new character: ");
                    char newChar = sc.nextLine().charAt(0);
                    System.out.println("After replacement: " + rep.replace(oldChar, newChar));
                    break;

                case 6:
                    System.out.print("Enter a string: ");
                    String splitStr = sc.nextLine();
                    System.out.println("Split result:");
                    for (String part : splitStr.split(" ")) {
                        System.out.println(part);
                    }
                    break;

                case 7:
                    System.out.print("Enter a string with extra spaces: ");
                    String trimStr = sc.nextLine();
                    System.out.println("After trim: " + trimStr.trim());
                    break;

                case 8:
                    exit = true;
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
