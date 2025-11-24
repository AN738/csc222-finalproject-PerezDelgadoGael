public class Machine {

    //Fields
    private String id;
    private String brand;
    private String model;
    private int year;
    ptivate double dailyRate;
    private double hoursUsed;

    //Constructor
    public Machine(String id, String brand, String model, int year, double dailyRate, double hoursUsed) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.dailyRate = dailyRate;
        this.hoursUsed = hoursUsed;
    }//ends

    // Methods from UML
    public void displayDetails() {
        System.out.println(this);
    }

    public double calculateRentalCost(int days) {
        return dailyRate * days;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public double getDailyRate() { return dailyRate; }
    public void setDailyRate(double dailyRate) { this.dailyRate = dailyRate; }

    public double getHoursUsed() { return hoursUsed; }
    public void setHoursUsed(double hoursUsed) { this.hoursUsed = hoursUsed; }

    @Override
    public String toString() {
        return "Machine {" +
                "id='" + id + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", dailyRate=" + dailyRate +
                ", hoursUsed=" + hoursUsed +
                '}';
    }
}
