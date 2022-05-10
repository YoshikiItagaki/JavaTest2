package jp.co.aforce.practice;

public class MainMail {

	public static void main(String[] args) {

		Mail mail = new Mail();
		mail.sendMail("Tonight", "Are you up for some booze?'\n", "yoshiki@gmail.com");
		mail.sendMail("I definitely go for it", "masaki@gmail.com");
	}

}
