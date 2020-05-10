package factory.message.interfaces.impl;

import factory.message.interfaces.Message;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LocalMessage implements Message {

    @Override
    public String showMessage() {
        return getMessage();
    }

    private String getMessage() {
        String msg = null;
        Properties properties = new Properties();
        try(InputStream resourceAsStream = LocalMessage.class.getClassLoader().getResourceAsStream("application.properties")) {
            properties.load(resourceAsStream);
            msg = properties.getProperty("Message");
            return msg;
        } catch (IOException e) {
            throw new RuntimeException("Something goes wrong!", e);
        }
    }
}
