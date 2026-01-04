abstract class Vehicle implements Servicable {
    protected int id;
    static int idGen = 1;
    String model;
    int year;
    double basePrice;


    public Vehicle(String model, int year, double basePrice) {
        this.id = idGen++;
        this.model = model;
        this.year = year;
        this.basePrice = basePrice;
    }

    public int getAge(int currentYear) {
        return currentYear - this.year;
    }

    public abstract double calculateInsuranceFee();

    @Override
    public void performService() {
        System.out.println("Performing service on " + model);
    }

    @Override
    public int getServiceIntervalKm() {
        return 10000;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Model: " + model + ", Year: " + year + ", Base Price: " + basePrice;
    }
}