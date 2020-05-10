package factory.message.factory;

import factory.message.interfaces.Message;
import factory.message.interfaces.Provider;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MessageSupportFactory {

    private static MessageSupportFactory instance;

    private Message message;
    private Provider provider;

    private Properties properties;

    static {
        instance = new MessageSupportFactory();
    }

    public static MessageSupportFactory getInstance() {
        return instance;
    }

    public Message getMessage() {
        return message;
    }

    public Provider getProvider() {
        return provider;
    }

    private MessageSupportFactory() {
        properties = new Properties();
        try(InputStream input = MessageSupportFactory.class.getClassLoader().getResourceAsStream("application.properties")) {
            properties.load(input);
            String messageClassName = properties.getProperty("MessageClass");
            String providerClassName = properties.getProperty("ProviderClass");
            //* create objects
            message = (Message) Class.forName(messageClassName).newInstance();
            provider = (Provider) Class.forName(providerClassName).newInstance();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
