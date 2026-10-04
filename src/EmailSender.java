public class EmailSender implements MessageSender{
    @Override
    public void sendMessage(String recipient, String messageBody) {
        System.out.println("[Email] Sending to <" + recipient + ": " + messageBody);
    }
}
