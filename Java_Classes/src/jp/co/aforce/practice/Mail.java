package jp.co.aforce.practice;

public class Mail {

	void sendMail(String title, String text, String address) {
		System.out.println("Send an email to " + address);
		System.out.println("Title: " + title);
		System.out.println("Text: " + text);
	}

	void sendMail(String text, String address) {
		System.out.println("Send an email to " + address);
		System.out.println("Title: No Title");
		System.out.println("Text: " + text);
	}

}
