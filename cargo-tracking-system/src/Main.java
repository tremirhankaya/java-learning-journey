import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int id;
        String name;
        String address;
        String cargoStatus;
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
                    5-Update Cargo
                    6-Exit
                    """);


            switch (choice) {
                case 1:

                    id = readInt(input, "Enter ID: ");


                    if (cargoManager.findCargo(id) != null) {
                        System.out.println("Cargo is already exists");
                        break;
                    }


                    System.out.println("Enter receiver name");
                    name = input.next();
                    System.out.println("Enter destination");
                    address = input.next();
                    input.nextLine();


                    BaseCargo baseCargo = new BaseCargo();
                    baseCargo.setInformation(id, name, address);
                    cargoManager.CargoAdd(baseCargo);


                    break;
                case 2:
                    id = readInt(input, "Enter ID: ");
                    if (cargoManager.findCargo(id) != null) {
                        System.out.println("----------------------------------");
                        System.out.println(cargoManager.findCargo(id).getStatus());
                        System.out.println("----------------------------------");

                    } else {
                        System.out.println("Wrong ID");
                    }
                    break;


                case 3:
                    id = readInt(input, "Enter ID: ");
                    if (cargoManager.findCargo(id) == null) {
                        System.out.println("Cargo Not Found");
                        break;
                    }
                    cargoManager.CargoDelete(id);


                    break;
                case 4:
                    cargoManager.listCargos();
                    break;

                case 5:
                    id = readInt(input, "Enter ID: ");
                    if (cargoManager.findCargo(id) == null) {
                        System.out.println("Wrong ID");
                        break;

                    }
                    System.out.println("Enter a new status ");
                    cargoStatus = input.next();
                    cargoManager.updateCargo(id, cargoStatus);
                    break;

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
                return value;


            } catch (Exception e) {
                System.out.println("Invalid input. Try again!");
                input.nextLine();
            }
        }
    }


}
