import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Machine> inventory = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean running = true;

        while (running) {
            showMenu();
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> addMachine();
                case 2 -> listMachines();
                case 3 -> searchMachine();
                case 4 -> calculateRentalCost();
                case 5 -> CSVExporter.exportToCSV(inventory, "machines.csv");
                case 6 -> {
                    System.out.println("Exiting program...");
                    running = false;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    //Interactive Menu
    private static void showMenu() {
        System.out.println("========================================");
        System.out.println("     MALPHAEGIS RENTAL MANAGER v1.0");
        System.out.println("========================================");
        System.out.println("1. Add New Machine");
        System.out.println("2. List All Machines");
        System.out.println("3. Search Machine by ID");
        System.out.println("4. Calculate Rental Cost");
        System.out.println("5. Export Inventory to CSV");
        System.out.println("6. Exit Program");
        System.out.println("========================================");
        System.out.print("Choose an option: ");
    } //ends showMenu

    private static void addMachine() {
        System.out.println("Add (1) Excavator or (2) Forklift?");
        int type = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Brand: ");
        String brand = scanner.nextLine();
        System.out.print("Enter Model: ");
        String model = scanner.nextLine();
        System.out.print("Enter Year: ");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Daily Rate: ");
        double rate = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter Hours Used: ");
        double hours = Double.parseDouble(scanner.nextLine());

        if (type == 1) { // Excavator
            System.out.print("Enter Bucket Capacity: ");
            double bucket = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter Operating Weight: ");
            double weight = Double.parseDouble(scanner.nextLine());

            inventory.add(new Excavator(id, brand, model, year, rate, hours, bucket, weight));
            System.out.println("Excavator added!\n");

        } else if (type == 2) { // Forklift
            System.out.print("Enter Lift Capacity: ");
            double lift = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter Max Height: ");
            double height = Double.parseDouble(scanner.nextLine());

            inventory.add(new Forklift(id, brand, model, year, rate, hours, lift, height));
            System.out.println("Forklift added!\n");

        } else {
            System.out.println("Invalid machine type.\n");
        }
    }


    //First version for List Machines
    private static void listMachines() {
        if (inventory.isEmpty()) {
            System.out.println("No machines in inventory.\n");
            return;
        }

        System.out.println("----- MACHINE INVENTORY -----");
        for (Machine m : inventory) {
            System.out.println(m);
        }
        System.out.println();
    }


    private static void searchMachine() {
        System.out.print("Enter ID to search: ");
        String id = scanner.nextLine();

        for (Machine m : inventory) {
            if (m.getId().equalsIgnoreCase(id)) {
                System.out.println("Machine found:");
                System.out.println(m + "\n");
                return;
            }
        }

        System.out.println("No machine found with ID: " + id + "\n");
    }

    private static void calculateRentalCost() {
        System.out.print("Enter machine ID: ");
        String id = scanner.nextLine();

        for (Machine m : inventory) {
            if (m.getId().equalsIgnoreCase(id)) {
                System.out.print("Enter number of days: ");
                int days = Integer.parseInt(scanner.nextLine());
                System.out.println("Rental cost = $" + m.calculateRentalCost(days) + "\n");
                return;
            }
        }

        System.out.println("Machine not found.\n");
    }

} // ends main class