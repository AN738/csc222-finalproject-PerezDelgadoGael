import java.io.PrintWriter;
import java.io.File;
import java.util.List;

public class CSVExporter {

    public static void exportToCSV(List<Machine> inventory, String filename) {

        try (PrintWriter writer = new PrintWriter(new File(filename))) {

            // Header
            writer.println("id,brand,model,year,dailyrate,hoursused,type,extra1,extra2");

            // Data rows
            for (Machine m : inventory) {

                if (m instanceof Excavator ex) {
                    writer.println(
                            ex.getId() + "," +
                                    ex.getBrand() + "," +
                                    ex.getModel() + "," +
                                    ex.getYear() + "," +
                                    ex.getDailyRate() + "," +
                                    ex.getHoursUsed() + "," +
                                    "Excavator," +
                                    ex.getBucketCapacity() + "," +
                                    ex.getOperatingWeight()
                    );
                }
                else if (m instanceof Forklift fl) {
                    writer.println(
                            fl.getId() + "," +
                                    fl.getBrand() + "," +
                                    fl.getModel() + "," +
                                    fl.getYear() + "," +
                                    fl.getDailyRate() + "," +
                                    fl.getHoursUsed() + "," +
                                    "Forklift," +
                                    fl.getLiftCapacity() + "," +
                                    fl.getMaxHeight()
                    );
                }
            }

            System.out.println("CSV export successful: " + filename + "\n");

        } catch (Exception e) {
            System.out.println("Error exporting CSV file.");
        }
    }
}