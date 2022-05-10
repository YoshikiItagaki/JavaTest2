package jp.co.aforce.test;

public class Main {

	public static void main(String[] args) {

		//9 配列
		String bodies [] = {"あし","あたま", "おなか", "うで","てのひら"};

		/*		System.out.println(bodies[0].length());
		*/

		PracticeTest8.printHello(); //1
		PracticeTest8.printRandomMessage(); //2
		PracticeTest8.printMessage("Hello"); //3
		PracticeTest8.printMessage("Hello",5); //4
		PracticeTest8.printRectangleArea(2,5); //5
		PracticeTest8.getWeatherForecast(); //6
		System.out.println(PracticeTest8.isEvenNumber(2)); //7
		System.out.println(PracticeTest8.getMessage("あき",false));//8
		Person person = new Person("Nobu", 40);//10
		System.out.println(person.isAdult(person));
		System.out.println(PracticeTest8.getLongestString(bodies));//9






	}

}
