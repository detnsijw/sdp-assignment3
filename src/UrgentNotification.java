public class UrgentNotification extends Notification {
    public UrgentNotification(MessageSender sender) {
        super(sender);
    }

    @Override
    public void send(String recipient, String details) {
        String formattedMessage = "CRITICAL ALERT: " + details.toUpperCase();
        sender.sendMessage(recipient, formattedMessage);
    }
}
