public class Main {
    public static void main(String[] args) {

        /*
        I dette forbedrede scenario bruges et interface (MessageService)
         og en factory (MessageServiceFactory), hvilket gør det muligt at
         skifte mellem forskellige sendingstjenester uden at ændre
          MessageSender-klassen.
         */

        MessageService service = MessageServiceFactory.getMessageService("email");
        MessageSender sender = new MessageSender(service);
        sender.sendMessage("Hello World!", "Magnus@gmail.com");

        service = MessageServiceFactory.getMessageService("sms");
        sender = new MessageSender(service);
        sender.sendMessage("Hello World!", "+1234567890");


        }
}