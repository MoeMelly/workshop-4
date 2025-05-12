import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;


public class Dealership {
    static Scanner scan = new Scanner(System.in);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

    public static void main(String[] args) throws Exception {

        homeMenu();

    }

    public static void homeMenu() throws Exception {
        boolean keepGoing = true;

        while (keepGoing) {
            System.out.println("1.-View Vehicle Inventory-");
            timer(100);
            System.out.println("\n==========================");
            System.out.println("2.-Get Vehicles By type-");
            timer(50);
            System.out.println("\n==========================");
            System.out.println("3.-Get Vehicles by fuel type -");
            timer(50);

            System.out.println("\n==========================");
            System.out.println("4.-Get Vehicles by Model-");
            timer(50);
            System.out.println("\n===========================");
            System.out.println("5.-Get Vehicles by trim-");
            timer(50);
            System.out.println("\n===========================");
            System.out.println("6.-Get Vehicles by color-");
            String input = scan.nextLine();
            System.out.println("7.-Vin Number-");
            System.out.println();

            switch (input) {
                case "1":
                    System.out.println("Loading vehicle inventory...");
                    timer(70);
                    loadVehicles();
                    break;
                case "2":
                    System.out.println("Please wait...");
                    timer(400);
                   getType(DealershipManager.vehicles());
                    break;
                case "3":
                    timer(200);
                    getFuelType(DealershipManager.vehicles());
                    break;
                case "4":
                    System.out.println("Search vehicle by model");
                    timer(200);
                    getVehicleModel(DealershipManager.vehicles());
                    break;
                case "5":
                    System.out.println("Getting Vehicle by trim");
                    timer(200);
                    getVehicleTrim();
                    break;
                case "6":
                    System.out.println("Search Vehicle by color");
                    timer(200);
                    getVehicleColor();
                    break;
                case "7":
                    System.out.println("Search Vehicle Vin");
                    timer(200);
                    getVehicleVin();
                    break;
                case "8":
                    System.out.println("Search Vehicle by year");
                    break;
                case "9":
                    System.out.println("Search Vehicle by Mileage");
                case "10":
                    System.out.println("Search Vehicle by price");
                    break;
                case "11":
                    System.out.println("Car Availability");
                    break;
                default:
                    System.out.println("Invalid Input. Please choose a number from 1-11.");
                    keepGoing = false;
                    break;
            }
        }
    }


    public static void loadVehicles() throws Exception {
        ArrayList<Vehicles> inventory = VehicleManager.getVehicles();
        for (Vehicles vehicle : inventory) {
            timer(50);
            System.out.println(vehicle);
        }

        System.out.println("\nWould You Like To Make A Purchase?");
        timer(200);
        System.out.println("Yes/No: ");
        String purchaseInput = scan.nextLine().trim().toLowerCase();

        boolean keepLoop = true;

        if (purchaseInput.equals("yes")) {
            System.out.println("You Have Chose to make a purchase");
            System.out.println("Please wait...");
            timer(500);
            keepLoop = false;
        } else if (purchaseInput.equals("no")) {
            System.out.println("Redirecting Back to Main Menu..");
            timer(100);
        } else {
            System.out.println("Invalid input. Please choose yes or no.");
        }
    }

        public static void getType(ArrayList<Vehicles> allVehicles) throws Exception {
            System.out.println("Enter Vehicle type");
            String type = scan.nextLine();

            ArrayList<Vehicles> filteredVehicles = new ArrayList<> (VehicleManager.getVehicles().stream()
                            .filter(vehicles -> vehicles.getType().trim().equalsIgnoreCase(type.trim()))
                            .toList());

            if (filteredVehicles.isEmpty()) {
                System.out.println("No Vehicle Found.");
            } else {
                for (Vehicles vehicle : filteredVehicles) {
                    System.out.println(vehicle + vehicle.getType());
                }
            }


        }

    public static void getFuelType(ArrayList<Vehicles> allVehicles) throws Exception {
        System.out.print("Enter Vehicle FuelType");
        String fuel = scan.nextLine();

        ArrayList<Vehicles> filteredVehicles = new ArrayList<> (VehicleManager.getVehicles().stream()
                .filter(vehicles -> vehicles.getType().trim().equalsIgnoreCase(fuel.trim()))
                .toList());

        if (filteredVehicles.isEmpty()) {
            System.out.println("No Vehicle found.");

        } else {
            for (Vehicles vehicle : filteredVehicles) {
                System.out.println("Fuel Type: " + vehicle.getFuelType());
            }
        }

    }
    public static void getMake(ArrayList<Vehicles> allVehicles) throws Exception {
        System.out.println("Enter Vehicle Make");
        String make = scan.nextLine();

        ArrayList<Vehicles> filteredList = new ArrayList<> (VehicleManager.getVehicles().stream()
                .filter(vehicles -> vehicles.getMake().trim().equalsIgnoreCase(make.trim()))
                .toList());

        if (filteredList.isEmpty()) {
            System.out.println("No Vehicle found");
        } else {
            for (Vehicles vehicles : filteredList) {
                System.out.println("Vehicle Make: " + vehicles.getMake());
            }
        }

    }
    public static void getVehicleModel(ArrayList<Vehicles> vehicles) {

    }
    public static void getVehicleTrim() {

    }

    public static void getVehicleColor() {

    }
    public static void getVehicleVin() {

    }
    public static void getVehicleYear() {

    }
    public static void vehicleMileage() {


    } public static void vehiclePrice() {

    }
    public static void isAvailable() {

    }






























    public static void timer(int timer) {

        try {
            Thread.sleep(timer);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}















































































































