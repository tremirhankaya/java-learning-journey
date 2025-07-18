public class NotificationManager {
    private BaseNotifier baseNotifier;
    public NotificationManager(BaseNotifier baseNotifier) {
        this.baseNotifier = baseNotifier;
    }
    public void notifyUser() {
        this.baseNotifier.sendNotification("Your order has been received!");
    }
}
