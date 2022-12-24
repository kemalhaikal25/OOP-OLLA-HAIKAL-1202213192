import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Restaurant resto = new Restaurant();
            int customerID, orderQty;
            try {

                System.out.println("\nEnter Customer ID: ");
                customerID = input.nextInt();

                System.out.println("Enter how much food to made: ");
                orderQty = input.nextInt();

                Thread thread1 = new Thread(resto);
                Waiter waiter = new Waiter(customerID, orderQty);
                Thread thread2 = new Thread(waiter);

                thread1.start();
                thread2.start();
                thread1.join();
                thread2.join();

            } catch (Exception e) {
                System.out.println("Input must be Integer");
            }
        }

    }

}