import java.util.ArrayList;
import java.util.ArrayList;

public class Main {

    private static ArrayList<Machine> inventory = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean running = true;

        while (running) {
            showMenu();
            int choice = Integer.parseInt(scanner.nextLine());

            switch (chice) {
                case 1 -> addMachine();
                case 2 -> listMachines();
                case 3 -> searchMachine();
                case 4 -> calculateRentalCost();
                case 5 -> {
                    System.out.println("Existing program...");
                    running = false;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("========================================");
        System.out.println("     MALPHAEGIS RENTAL MANAGER v1.0");
        System.out.println("========================================");
        System.out.println("1. Add New Machine");
        System.out.println("2. List All Machines");
        System.out.println("3. Search Machine by ID");
        System.out.println("4. Calculate Rental Cost");
        System.out.println("5. Exit Program");
        System.out.println("========================================");
        System.out.print("Choose an option: ");
    }


} // ends main class