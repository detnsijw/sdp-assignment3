public class TelegramSender implements MessageSender{
    @Override
    public void sendMessage(String recipient, String messageBody) {
        System.out.println("[Telegram] Sending to @" + recipient + ": " + messageBody);

    }
}
