public class Excavator extends Machine {

    private double bucketCapacity;
    private double operatingWeight;

    //Constructor
    public Excavator(String id, String brand, String model, int year, double dailyRate, double hoursUsed,
                     double bucketCapacity, double operatingWeight) {

        super(id, brand, model, year, dailyRate, hoursUsed);
        this.bucketCapacity = bucketCapacity;
        this.operatingWeight = operatingWeight;
    }

    public boolean isHeavyDuty() {
        return operatingWeight > 20000; // example
    }

    //Getters and Setters
    public double getBucketCapacity() { return bucketCapacity; }
    public void setBucketCapacity(double bucketCapacity) { this.bucketCapacity = bucketCapacity; }

    public double getOperatingWeight() { return operatingWeight; }
    public void setOperatingWeight(double operatingWeight) { this.operatingWeight = operatingWeight; }

    //DisplayDetails() Override
    @Override
    public void displayDetails() {
        System.out.println(this);
    }

    //toString() Override
    @Override
    public String toString() {
        return "Excavator {" +
                "id='" + getId() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() +
                ", dailyRate=" + getDailyRate() +
                ", hoursUsed=" + getHoursUsed() +
                ", bucketCapacity=" + bucketCapacity +
                ", operatingWeight=" + operatingWeight +
                '}';
    }
}//ends Excavator class