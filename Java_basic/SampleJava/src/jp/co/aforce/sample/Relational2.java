package jp.co.aforce.sample;

import java.util.Date;

public class Relational2 {

	public static void main(String[] args) {

		System.out.println("(10 > 0) && (20 == 20) " + ((10 > 0) && (20 == 20)));
		System.out.println("(10 < 0) && (20 == 20) " + ((10 < 0) && (20 == 20)));
		System.out.println("(10 > 0) && (20 == 21) " + ((10 > 0) && (20 == 21)));
		System.out.println("(10 < 0) || (20 == 20) " + ((10 < 0) || (20 == 20)));
		System.out.println("(10 < 0) || (20 == 21) " + ((10 < 0) || (20 == 21)));
		System.out.println("!(10 < 0) " + !(10 < 0));
		System.out.println("!(20 == 20) " + !(20 == 20));


		Date today = new Date();

	}

}
