package jp.co.aforce.test;

import java.util.Random;

public class PracticeTest2 {

	public static void main(String[] args) {

		int x = 10;
		int y = 28;
		double z = 3.14;

		//1.
		System.out.println(x*y);

		//2.
		System.out.println("割った結果:" + y/x + "、余り:" + y%x);

		//3.
		double a = y * z;
		System.out.println(a);

		//4.
		System.out.println(a+=1);

		//5.
		int age = 24;
		Random random = new Random();
		int randomNumber = random.nextInt(100);
		System.out.println("randomNumber="+randomNumber);

		if(age > randomNumber) {
			System.out.println("私の方が年上です。");
		} else if(age < randomNumber) {
			System.out.println("私の方が年下です。");
		} else {
			System.out.println("私と同い年です");
		}


	}

}
