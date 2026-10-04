public class SmsSender implements MessageSender{
    @Override
    public void sendMessage(String recipient, String messageBody) {
        System.out.println("[SMS] Sending to phone " + recipient + ": " + messageBody);
    }
}
