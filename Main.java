import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello, World!");
        System.out.println("How old are you?");
        int age = -2;
        do {
            try {
                age = scan.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number");
                System.out.println(e.getMessage());
                scan.next();
            }
        }while ((age == -2));

        System.out.println("You are " + age + " years old");
    }

}
