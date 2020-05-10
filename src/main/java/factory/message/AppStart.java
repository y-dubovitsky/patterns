package factory.message;

import factory.message.factory.MessageSupportFactory;
import factory.message.interfaces.Message;
import factory.message.interfaces.Provider;

public class AppStart {

    public static void main(String[] args) {
        Message message = MessageSupportFactory.getInstance().getMessage();
        Provider provider = MessageSupportFactory.getInstance().getProvider();
        provider.setMessage(message);
       provider.executeAction();
    }
}
