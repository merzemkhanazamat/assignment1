import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FleetApp {
    private final List<Vehicle> vehicles;
    private final Scanner scanner;

    public FleetApp() {
        vehicles = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            System.out.println("Fleet Management System");
            System.out.println("1. Print all vehicles");
            System.out.println("2. Add new car");
            System.out.println("3. Add new bus");
            System.out.println("4. Show total yearly insurance fees");
            System.out.println("5. Show vehicles older than N years");
            System.out.println("6. Perform service for all vehicles");
            System.out.println("7. Quit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    printAllVehicles();
                    break;
                case 2:
                    addNewCar();
                    break;
                case 3:
                    addNewBus();
                    break;
                case 4:
                    showTotalInsuranceFees();
                    break;
                case 5:
                    showVehiclesOlderThanNYears();
                    break;
                case 6:
                    performServiceForAllVehicles();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private void printAllVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles in the fleet.");
        } else {
            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle);
            }
        }
    }

    private void addNewCar() {
        System.out.println("Enter model, year, basePrice, and numberOfDoors:");
        String model = scanner.nextLine();
        int year = scanner.nextInt();
        double basePrice = scanner.nextDouble();
        int numberOfDoors = scanner.nextInt();
        scanner.nextLine();
        vehicles.add(new Car(model, year, basePrice, numberOfDoors));
    }

    private void addNewBus() {
        System.out.println("Enter model, year, basePrice, and passengerCapacity:");
        String model = scanner.nextLine();
        int year = scanner.nextInt();
        double basePrice = scanner.nextDouble();
        int passengerCapacity = scanner.nextInt();
        scanner.nextLine();
        vehicles.add(new Bus(model, year, basePrice, passengerCapacity));
    }

    private void showTotalInsuranceFees() {
        double total = 0;
        for (Vehicle vehicle : vehicles) {
            total += vehicle.calculateInsuranceFee();
        }
        System.out.println("«Общая годовая сумма страховых взносов: " + total);
    }

    private void showVehiclesOlderThanNYears() {
        System.out.println("Enter current year and N:");
        int currentYear = scanner.nextInt();
        int N = scanner.nextInt();
        scanner.nextLine();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getAge(currentYear) > N) {
                System.out.println(vehicle);
            }
        }
    }

    private void performServiceForAllVehicles() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Servicable) {
                ((Servicable) vehicle).performService();
            }
        }
    }

    public static void main(String[] args) {
        FleetApp app = new FleetApp();
        app.run();
    }
}