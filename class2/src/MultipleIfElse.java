import java.util.Scanner;

public class MultipleIfElse {
        public static void main(String[] args) {
            System.out.print("Enter your Amount Please: ");
            Scanner Input = new Scanner(System.in);
            int salary = Input.nextInt();
            if (salary <= 10000) {
                salary += 1000; //salary = salary + 1000
            } else if (salary <= 20000) {
                salary += 2000;

            } else {
                salary += 3000;
            }
            System.out.print("Your Final Salary is : ");
            System.out.println(salary);
        }
    }

