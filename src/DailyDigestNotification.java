public class DailyDigestNotification extends Notification {
    public DailyDigestNotification(MessageSender sender) {
        super(sender);
    }

    @Override
    public void send(String recipient, String details) {
        String formattedMessage = "Daily Digest Report: " + details;
        sender.sendMessage(recipient, formattedMessage);
    }
}
