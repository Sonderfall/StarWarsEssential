package com.starwars.app.server;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.starwars.app.client.msg.SendMessageService;

public class SendMessageServiceImpl extends RemoteServiceServlet implements SendMessageService {

	private static final long serialVersionUID = -7577870210617534949L;

	public void sendMessage(String iName, String iEmail, String iMessage) {
		final String lAdressTo = "starwars.essential@gmail.com";
	    final String lAdressFrom = "valentin.macheret.fr@gmail.com";
	    final String lPasswordFrom = "mypwd";
	    
		Properties lProps = new Properties();
		lProps.put("mail.smtp.host", "smtp.gmail.com");
        lProps.put("mail.smtp.port", "587");
        
        lProps.put("mail.transport.protocol", "smtp");
        lProps.put("mail.smtp.auth", "true");
        lProps.put("mail.smtp.starttls.enable", "true");
        lProps.put("mail.smtp.tls.", "true");
        
        lProps.put("mail.smtp.user", lAdressFrom);
        lProps.put("mail.password", lPasswordFrom);
		
        lProps.put("mail.debug", "true");
        
        Session lSession = Session.getInstance(lProps,
                new javax.mail.Authenticator() {
                  protected PasswordAuthentication getPasswordAuthentication() {
                      return new PasswordAuthentication(lAdressFrom, lPasswordFrom);
                  }
                });

        try {
            Message lMsgToSend = new MimeMessage(lSession);
            lMsgToSend.setFrom(new InternetAddress(lAdressFrom, "Admin SWE"));
            lMsgToSend.setRecipients(Message.RecipientType.TO, InternetAddress.parse(lAdressTo));
            lMsgToSend.setSubject("Message de " + iName + " (" + iEmail + ")" + " sur StarWarsEssential");
            lMsgToSend.setText(iMessage);
            lMsgToSend.setSentDate(new Date());
            lMsgToSend.saveChanges();
            
            Transport.send(lMsgToSend);
            
            System.out.println("SERVER : Sending message");
        } catch (MessagingException e) {
        	System.out.println("SERVER : Error sending message -> Messaging");
        } catch (UnsupportedEncodingException e) {
        	System.out.println("SERVER : Error sending message -> UnsupportedEncoding");
		}
	}
}