public class MessageSender {
    private MessageService messageService;

    public MessageSender(MessageService service) {

        this.messageService = service;
    }

    public void sendMessage(String message, String recipient) {

        messageService.sendMessage(message, recipient);
    }
}