package com.tw.mail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class MailDemoOne {

	/**
	 * @param args
	 */
	public static void main(String[] args)  {
		String msg = (sendMail()) ? "OK" : "NOT OK";
		System.out.println(msg);
	}

	public static boolean sendMail() {
		try {
			
			Email email = new SimpleEmail();
			email.setHostName("smtp.gmail.com");
			email.setSmtpPort(587);
			email.setAuthenticator(new DefaultAuthenticator("webber.larch@gmail.com",
					"uxb2b1234"));
			email.setTLS(true);
			email.setFrom("webber.larch@gmail.com");
			email.setSubject("TestMail");
			email.setMsg("This is a test mail ... :-)");
			email.addTo("webber.larch@gmail.com");
			email.send();
			
			return true;
			
		} catch (EmailException e) {
			e.printStackTrace();
			return false;
		}
	}

}
