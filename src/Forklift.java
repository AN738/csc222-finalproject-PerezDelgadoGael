public class Forklift extends Machine {

    private double liftCapacity;
    private double maxHeight;

    // Constructor
    public Forklift(String id, String brand, String model, int year, double dailyRate, double hoursUsed,
                    double liftCapacity, double maxHeight) {

        //Call parent constructor
        super(id, brand, model, year, dailyRate, hoursUsed);
        this.liftCapacity = liftCapacity;
        this.maxHeight = maxHeight;
    }

    public boolean canLiftOver(double amount) {
        return liftCapacity >= amount;
    }

    // Getters & Setters
    public double getLiftCapacity() { return liftCapacity; }
    public void setLiftCapacity(double liftCapacity) { this.liftCapacity = liftCapacity; }

    public double getMaxHeight() { return maxHeight; }
    public void setMaxHeight(double maxHeight) { this.maxHeight = maxHeight; }

    // displayDetails Override
    @Override
    public void displayDetails() {
        System.out.println(this);
    }

    // toString() Override
    @Override
    public String toString() {
        return "Forklift {" +
                "id='" + getId() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() +
                ", dailyRate=" + getDailyRate() +
                ", hoursUsed=" + getHoursUsed() +
                ", liftCapacity=" + liftCapacity +
                ", maxHeight=" + maxHeight +
                '}';
    }

} // Ends Forklift class