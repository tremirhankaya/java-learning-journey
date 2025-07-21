import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CargoManager {

    ArrayList<BaseCargo> CargoList = new ArrayList<>();

    public void CargoAdd(BaseCargo baseCargo) {
        ListIterator<BaseCargo> iterator = CargoList.listIterator();


        while (iterator.hasNext()) {
            BaseCargo cargo = iterator.next();
            if (cargo.getId() == baseCargo.getId()) {
                System.out.println("Already exists");
                return;


            }
        }
        CargoList.add(baseCargo);
        System.out.println("Added " + baseCargo.getId());

    }

    public void CargoDelete(int id) {
        Iterator<BaseCargo> iterator = CargoList.iterator();

        while (iterator.hasNext()) {
            BaseCargo cargo = iterator.next();
            if (cargo.getId() == id) {
                iterator.remove();
                System.out.println("Cargo deleted");
                return;
            }
        }

    }

    public void listCargos() {
        for (BaseCargo baseCargo : CargoList) {
            baseCargo.showInfo();
        }
    }

    public void updateCargo(int id, String newStatus) {
        for (BaseCargo k : CargoList) {
            if (k.getId() == id) {
                k.setStatus(newStatus);
            } else {
                System.out.println("Wrong ID");
            }

        }
    }

    public BaseCargo findCargo(int id) {
        for (BaseCargo baseCargo : CargoList) {
            if (baseCargo.getId() == id) {
                return baseCargo;
            }
        }
        return null;
    }

}
