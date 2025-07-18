public class SmsNotifier extends BaseNotifier{
    public void sendNotification(String message) {
        System.out.println("Notification sent via sms. "+message);
    }

}
