import java.util.Scanner;

public class NestedSwitchNew {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();
        switch (empID) {
            case 1 -> System.out.println("Rohit Bansal");
            case 2 -> System.out.println("Rahul mittal");
            case 3 -> {
                System.out.println("Salman khan");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("No such department exist");
                }
            }
            default -> System.out.println("Enter a valid empID");
        }
    }
}
