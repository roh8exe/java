import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();
        switch (empID) {
            case 1:
                System.out.println("Rohit Bansal");
                break;
            case 2:
                System.out.println("Rahul mittal");
                break;
            case 3:
                System.out.println("Salman khan");
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("No such department exist");
                }
                break;
            default:
                System.out.println("Enter a valid empID");

        }
    }
}

