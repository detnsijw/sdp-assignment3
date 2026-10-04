public class Main{
    public static void main(String[] args) {
        MessageSender email = new EmailSender();
        MessageSender telegram = new TelegramSender();
        MessageSender sms = new SmsSender();

        Notification urgentAlert = new UrgentNotification(email);
        urgentAlert.send("admin@company.com", "Database connection lost!");

        System.out.println("\n>> Switching channel to Telegram...");
        urgentAlert.setSender(telegram);
        urgentAlert.send("dev_team_lead", "Database connection lost!");

        System.out.println("\n>> Switching channel to SMS...");
        urgentAlert.setSender(sms);
        urgentAlert.send("+1234567890", "Database connection lost!");

        System.out.println("\n>> Sending Daily Digest...");
        Notification dailyDigest = new DailyDigestNotification(telegram);
        dailyDigest.send("john_doe", "All 12 background jobs completed successfully.");
    }
}