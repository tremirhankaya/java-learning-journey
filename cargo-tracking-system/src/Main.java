import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int id;
        String name;
        String address;
        String cargoStatus;
        CargoManager cargoManager = new CargoManager();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Please make a selection");
            System.out.println("1-Add Cargo.");
            System.out.println("2-Where is my Cargo?");
            System.out.println("3-Delete Cargo");
            System.out.println("4-List Cargos");
            System.out.println("5-Update Cargo");
            System.out.println("6-Exit");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter ID");
                    id = input.nextInt();
                    if (cargoManager.findCargo(id) != null) {
                        System.out.println("Cargo is already exists");
                        break;
                    }

                    System.out.println("Enter receiver name");
                    name = input.next();
                    System.out.println("Enter destination");
                    address = input.next();
                    BaseCargo baseCargo = new BaseCargo();
                    baseCargo.setInformation(id, name, address);
                    cargoManager.CargoAdd(baseCargo);


                    break;
                case 2:
                    System.out.println("Enter ID");
                    id = input.nextInt();
                    if (cargoManager.findCargo(id) != null){
                        System.out.println("----------------------------------");
                        System.out.println(cargoManager.findCargo(id).getStatus());
                        System.out.println("----------------------------------");

                    }else{
                        System.out.println("Wrong ID");
                    }
                    break;


                case 3:
                    System.out.println("Enter ID");
                    id = input.nextInt();
                    cargoManager.CargoDelete(id);


                    break;
                case 4:
                    cargoManager.listCargos();
                    break;

                case 5:
                    System.out.println("Enter ID");
                    id = input.nextInt();
                    System.out.println("Enter a new status ");
                    cargoStatus = input.next();
                    cargoManager.updateCargo(id, cargoStatus);
                    System.out.println("Cargo has been updated");
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}
