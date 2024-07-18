import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        int h = 10;
        int i = 1;
        // Loop to multiply h by 5 in each iteration and print the result
        while (i <= 5) {
            h *= 5;  // Multiply h by 5 and reassign the value
            System.out.println(h);
            i++;
        }

        // Resetting the counter for printing the name 5 times
        i = 1;
        while (i <= 5) {
            System.out.println(name);
            i++;
        }
    }
}