public class MessageServiceFactory {
    public static MessageService getMessageService(String type) {
        if (type.equalsIgnoreCase("email")) {
            return new EmailService();
        } else if (type.equalsIgnoreCase("sms")) {
            return new SMSService();
        }
        throw new IllegalArgumentException("Unknown message service type");
    }
}