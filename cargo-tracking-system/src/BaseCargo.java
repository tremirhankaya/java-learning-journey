public class BaseCargo {
    private int id;
    private String senderName;
    private String receiverName;
    private String destinationAddress;
    private String status;


    public BaseCargo() {
        this.status = "Waiting at Branch";
    }


    public int getId() {
        return id;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public String getStatus() {
        return status;
    }

    // --- Setter Metotları ---
    public void setId(int id) {
        this.id = id;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public void setInformation(int id, String receiverName, String destinationAddress,String senderName) {
        setId(id);
        setReceiverName(receiverName);
        setDestinationAddress(destinationAddress);
        setSenderName(senderName);
    }

    public void showInfo() {
        System.out.println("---------------------------------");
        System.out.println("Cargo ID            : " + id);
        System.out.println("Sender Name         : " + senderName);
        System.out.println("Receiver Name       : " + receiverName);
        System.out.println("Destination Address : " + destinationAddress);
        System.out.println("Status              : " + status);
        System.out.println("---------------------------------");
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }
}