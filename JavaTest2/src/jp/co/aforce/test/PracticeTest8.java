package jp.co.aforce.test;

public class PracticeTest8 {

	//1.
	public static void printHello() {
		System.out.println("Hello\n");
	}

	//2.
	public static void printRandomMessage() {
		int n = (int)(3*Math.random());

		switch(n) {
			case 0:
				System.out.println("こんばんは");
			break;
			case 1:
				System.out.println("こんにちは");
			break;
			case 2:
				System.out.println("おはよう");
			break;
		}

		System.out.println("\n");

	}

	//3.
	public static void printMessage(String message) {
		System.out.println(message);
		System.out.println("\n");
	}

	//4.
	public static void printMessage(String message, int count) {
		for(int i = 0; i < count; i++) {
			System.out.println(message);
		}

		System.out.println("\n");
	}

	//5.
	public static void printRectangleArea(double height, double width) {
		double area = height * width;
		System.out.println(area);
		System.out.println("\n");
	}

	//6.
	public static void getWeatherForecast() {
		int randomDay = (int)(3*Math.random());
		int randomWeather = (int)(4*Math.random());

		switch(randomDay) {
		case 0://今日
			switch(randomWeather) {
			case 0:
				System.out.println("今日の天気は晴れでしょう");
			break;
			case 1:
				System.out.println("今日の天気は曇りでしょう");
			break;
			case 2:
				System.out.println("今日の天気は雨でしょう");
			break;
			case 3:
				System.out.println("今日の天気は雪でしょう");
				break;
			}
		break;
		case 1://明日
			switch(randomWeather) {
			case 0:
				System.out.println("明日の天気は晴れでしょう");
			break;
			case 1:
				System.out.println("明日の天気は曇りでしょう");
			break;
			case 2:
				System.out.println("明日の天気は雨でしょう");
			break;
			case 3:
				System.out.println("明日の天気は雪でしょう");
				break;
			}
		break;
		case 2://明後日
			switch(randomWeather) {
			case 0:
				System.out.println("明後日の天気は晴れでしょう");
			break;
			case 1:
				System.out.println("明後日の天気は曇りでしょう");
			break;
			case 2:
				System.out.println("明後日の天気は雨でしょう");
			break;
			case 3:
				System.out.println("明後日の天気は雪でしょう");
				break;
			}
		break;

		}

		System.out.println("\n");


	}

	//7.
	public static boolean isEvenNumber(int value) {


		if(value/2 == 0) {
			System.out.println("\n");
			return true;
		} else {
			System.out.println("\n");
			return false;

		}


	}

	//8.

	public static String getMessage(String name, boolean isKid) {

		if(isKid == true) {
			System.out.println("\n");
			return "こんにちは。" + name + "ちゃん。\n";

		} else {
			System.out.println("\n");
			return "こんにちは。" + name +  "さん。\n";

		}

	}

	//9.

	/*public static String getLongestString(String bodies[]) {
		int i;

		for(i = 0; i < bodies.length; i++ ) {
			if(bodies[i].length() > bodies[i+1].length()) {
				bodies[i+1] = bodies[i];
			} else if(bodies[i].length() < bodies[i+1].length()) {
				bodies[i+1] = bodies[i+1];
			} else {
				bodies[i+1] = bodies[i+1];
			}
		}
		return bodies[i + (bodies.length - 1)];

	}*/

	//9　解答写経
	/*public String getLongestString(String[]array) {

		String str = null;
		int maxCount = array[0].length();

		for(int i = 1; i < array.length; i++) {
			if(maxCount <= array[i].length()) {
				maxCount = array[i].length();
				str = array[i];
			}
		}

		return str;
	}*/

	//9 解答を参考に

	public static String getLongestString(String bodies[]) {

		String str = null;
		int maxCount = bodies[0].length();
		System.out.println("\n");

		for(int i = 0; i < bodies.length; i++ ) {
			if(maxCount <= bodies[i].length()) {
				maxCount = bodies[i].length();
				str = bodies[i];

			}
		}
		return str;

	}








}
