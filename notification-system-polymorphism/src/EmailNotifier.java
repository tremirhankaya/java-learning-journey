public class EmailNotifier extends BaseNotifier{
    public void sendNotification(String message) {
        System.out.println("Notification sent via email. "+message);
    }
}
