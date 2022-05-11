package jp.co.aforce.sample;

import java.util.ArrayList;

public class Sample {

	public static void main(String[] args) {

		//Collection
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("red");
		colors.add("blue");
		colors.add("yellow");
		colors.add("orange");
		colors.add("green");
		colors.add("pink");
		colors.add("purple");

		//1.
		System.out.println(colors.get(4));
		System.out.println(colors);

		//2.
		colors.remove(1);
		colors.add(2, "light blue");
		System.out.println(colors);

		//3.
		System.out.println(colors.get(1));

		//4
		colors.set(6,"white");
		colors.add(0,"black");
		System.out.println(colors);

		//5.
		System.out.println(colors.get(6));
	}

}
