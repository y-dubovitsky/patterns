package factory.message.interfaces.impl;

import factory.message.interfaces.Message;
import factory.message.interfaces.Provider;

public class MessageProvider implements Provider {

    private Message message;

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    @Override
    public void executeAction() {
        System.err.println(message.showMessage());
    }
}
