class Car extends Vehicle {
    private int numberOfDoors;

    // Конструктор
    public Car(String model, int year, double basePrice, int numberOfDoors) {
        super(model, year, basePrice);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double calculateInsuranceFee() {
        int age = getAge(2026);
        return basePrice * 0.05 + age * 20;
    }

    @Override
    public void performService() {
        System.out.println("Performing car service on " + model);
    }


    @Override
    public int getServiceIntervalKm() {
        return 15000;
    }

    @Override
    public String toString() {
        return super.toString() + ", Doors: " + numberOfDoors;
    }
}