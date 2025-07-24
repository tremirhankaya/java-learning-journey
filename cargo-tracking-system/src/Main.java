import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int id;
        String receiverName;
        String destinationAddress;
        String newStatus;
        String senderName;
        int choice;
        CargoManager cargoManager = new CargoManager();
        Scanner input = new Scanner(System.in);

        while (true) {
            choice = readInt(input, """
                    Please make a selection
                    1-Add Cargo.
                    2-Where is my Cargo?
                    3-Delete Cargo
                    4-List Cargos
                    5-Update Cargo Status
                    6-Exit
                    """);

            switch (choice) {
                case 1:
                    id = readInt(input, "Enter Cargo ID: ");

                    if (cargoManager.findCargo(id) != null) {
                        System.out.println("Cargo with ID " + id + " already exists. Please use a different ID.");
                        break;
                    }
                    System.out.println("Enter Sender Name: ");
                    senderName=input.nextLine();
                    System.out.print("Enter Receiver Name: ");
                    receiverName = input.nextLine();
                    System.out.print("Enter Destination Address: ");
                    destinationAddress = input.nextLine();


                    BaseCargo newBaseCargo = new BaseCargo();
                    newBaseCargo.setInformation(id, receiverName, destinationAddress,senderName);
                    cargoManager.addCargo(newBaseCargo);
                    break;

                case 2:
                    id = readInt(input, "Enter Cargo ID: ");
                    BaseCargo foundBaseCargo = cargoManager.findCargo(id);
                    if (foundBaseCargo != null) {
                        System.out.println("----------------------------------");
                        System.out.println("Current Status: " + foundBaseCargo.getStatus());
                        System.out.println("----------------------------------");
                    } else {
                        System.out.println("Cargo Not Found for ID: " + id);
                    }
                    break;

                case 3:
                    id = readInt(input, "Enter Cargo ID to delete: ");
                    cargoManager.deleteCargo(id);
                    break;

                case 4:
                    cargoManager.listCargos(); // Manager metodu çağrıldı
                    break;

                case 5:
                    id = readInt(input, "Enter Cargo ID to update: ");
                    System.out.print("Enter a New Status: ");
                    newStatus = input.nextLine();
                    cargoManager.updateCargoStatus(id, newStatus);
                    break;

                case 6:
                    System.out.println("Exiting application.");
                    input.close();
                default:
                    System.out.println("Please enter a number between 1 and 6.");
                    break;
            }
        }
    }


    private static int readInt(Scanner input, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                int value = input.nextInt();
                input.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                input.nextLine();
            }
        }
    }
}