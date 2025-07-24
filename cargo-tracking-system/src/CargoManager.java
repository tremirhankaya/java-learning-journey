import java.util.List;

public class CargoManager {

    private CargoDAO cargoDAO = new CargoDAO();

    public CargoManager() {
    }

    public void addCargo(BaseCargo baseCargo) {
        if (cargoDAO.findCargoById(baseCargo.getId()) != null) {
            System.out.println("Cargo with this ID already exists. Cannot add duplicate.");
            return;
        }
        cargoDAO.addCargo(baseCargo);
    }

    public void deleteCargo(int id) {
        cargoDAO.deleteCargo(id);
    }

    public void listCargos() {
        List<BaseCargo> cargoList = cargoDAO.getAllCargos(); //
        if (cargoList.isEmpty()) {
            System.out.println("No cargos to display.");
            return;
        }
        for (BaseCargo baseCargo : cargoList) {
            baseCargo.showInfo();
        }
    }

    public void updateCargoStatus(int id, String newStatus) {
        if (cargoDAO.findCargoById(id) == null) {
            System.out.println("Cargo not found with ID: " + id + ". Cannot update.");
            return;
        }
        cargoDAO.updateCargoStatus(id, newStatus);
    }

    public BaseCargo findCargo(int id) {
        return cargoDAO.findCargoById(id);
    }
}