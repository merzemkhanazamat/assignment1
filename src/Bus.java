class Bus extends Vehicle {
    private int passengerCapacity;

    public Bus(String model, int year, double basePrice, int passengerCapacity) {
        super(model, year, basePrice);
        this.passengerCapacity = passengerCapacity;
    }


    @Override
    public double calculateInsuranceFee() {
        int age = getAge(2026);
        return basePrice * 0.07 + age * 30;
    }


    @Override
    public void performService() {
        System.out.println("Выполнение обслуживания автобуса на " + model);
    }

    @Override
    public int getServiceIntervalKm() {
        return 20000;
    }

    @Override
    public String toString() {
        return super.toString() + ", Passenger Capacity: " + passengerCapacity;
    }
}