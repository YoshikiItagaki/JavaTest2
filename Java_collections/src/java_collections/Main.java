package java_collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();

		//1. ArrayList
		colors.add("red");
		colors.add("blue");
		colors.add("yellow");
		colors.add("orange");
		colors.add("green");
		colors.add("pink");
		colors.add("purple");

		System.out.println(colors.get(5));

		colors.remove(1);
		colors.add(2,"light blue");

		System.out.println(colors.get(1));

		colors.set(6, "white");
		colors.add(0,"black");

		System.out.println(colors.get(6));

		//2. HashMap: you create a list by which you can assign both a key and content to each element
		// which enables you to locate easy where the element you are looking for is.
		HashMap<String, String> employees = new HashMap<>();

		employees.put("A001", "Tanaka Taro");
		employees.put("A002", "Sato Jiro");
		employees.put("A003", "Yamada Hanako");
		employees.put("A004", "Sato Jiro");

		System.out.println(employees);

		employees.remove("A003");
		employees.put("A004","Takahashi Saburo");

		//3. HashSet: you create a list by which you can assign only a single value to each element
		HashSet<String> momotaro = new HashSet<>();
		momotaro.add("Momotaro");
		momotaro.add("monkey");
		momotaro.add("dog");
		momotaro.add("Kiji");
		momotaro.add("dog");
		momotaro.add("kibidango");
		momotaro.add("kibidango");

		System.out.println(momotaro);

		//4 Array
		int[] numbers = {1,2,3,4,5};
		System.out.println(numbers[4]);

		//5 for loop

		int value = 10;

		if(value == 0) {
			System.out.println("The value is 0. ");
		} else if(value >= 1 || value <=5) {
			System.out.println("The value is between 1 and 5");
		} else {
			System.out.println("The value is " + value);
		}

		//7 switch statement

		int day = 0;

		switch(day) {
			case 0:
				System.out.println("It's Sunday today.");
				break;
			case 1:
				System.out.println("It's Monday today.");
				break;
			case 2:
				System.out.println("It's Tuesday today.");
				break;
			case 3:
				System.out.println("It's Wednesday today.");
				break;
			case 4:
				System.out.println("It's Thursday today.");
				break;
			case 5:
				System.out.println("It's Friday today.");
				break;
			case 6:
				System.out.println("It's Saturday today.");
				break;
			default:
				System.out.println("Invalid input: " + day);
				break;
		}

		//8 while loop

				int number = 0;

				while(number <30) {
					number++;

					if(number % 3 == 0) {
						System.out.println(number + " good");
					}
				}



		/*int number = 0;

		do {
			number++;
			if(number % 3 == 0) {
				System.out.println(number + " good");
			}

		} while(number < 30);*/

		//While loop checks the condition first and then executes the statement(s),
		//Whereas do-while loop will execute the statement(s) at least once, then the condition is checked.

				String[] jpWeek = {"日", "月", "火", "水", "木", "金", "土"};
				String[] enWeek = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

				for(int i =0; i<jpWeek.length; i++) {
					System.out.println(jpWeek[i] + "曜日は英語で" + enWeek[i] + "です");
				}

				for(int i = 0; i<10; i++) {
					if(i%3==0) {
						continue;
					}
					System.out.println(i);
				}

	}

}
