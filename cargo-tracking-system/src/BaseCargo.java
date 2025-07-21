public class BaseCargo {
    private int id;
    private String name;
    private String destination;
    private String status;

    public BaseCargo() {
        this.status = "Waiting at Branch";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setInformation(int id, String name, String destination) {
        setId(id);
        setName(name);
        setDestination(destination);

    }

    public void showInfo() {
        System.out.println("---------------------------------");
        System.out.println("Cargo ID      : " + id);
        System.out.println("Receiver      : " + name);
        System.out.println("Destination   : " + destination);
        System.out.println("Status        : " + status);
        System.out.println("---------------------------------");


    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void updateCargo(String newStatus) {

    }

    ;
}
