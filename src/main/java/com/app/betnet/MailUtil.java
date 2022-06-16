package com.app.betnet;

import java.util.Properties;
import javax.mail.*;
import javax.mail.Authenticator;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * This Code was a test and doesen't work because Google accounts doesen't support third party apps anymore.
 * Check here: https://support.google.com/accounts/answer/6010255.
 */

public class MailUtil {

    public static void sendMail(String recepient) throws Exception {
        Properties properties = new Properties();

        Properties props = new Properties();
        props.put("mail.smtp.ssl.trust", "*");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.starttls.enable", "true");

        String myAccountEmail = "betnet.help@gmail.com";
        String password = "sml12345";

        Session session = Session.getDefaultInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail, password);
            }
        });
        Message message = prepareMessage(session, myAccountEmail, recepient);

        Transport.send(message);
        System.out.println("Message sent successfully");
    }

    private static Message prepareMessage(Session session, String myAccountEmail, String recepient) {
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("My First Email from Java App");
            message.setText("Hey There, \n Look my email");
            return message;
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
