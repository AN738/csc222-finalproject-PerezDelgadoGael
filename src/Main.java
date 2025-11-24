public class Main {

    public static void main(String[] args) {

        // Create sample Excavator
        Excavator excavator = new Excavator(
                "EX001", "Caterpillar", "320D", 2018,
                350.0, 4200.5, 1.2, 21000
        );

        // Create sample Forklift
        Forklift forklift = new Forklift(
                "FL001", "Toyota", "8FGCU25", 2020,
                180.0, 1500.0, 2500.0, 12.5
        );

        // Print the objects
        System.out.println(excavator);
        System.out.println(forklift);
    }

} // ends main class