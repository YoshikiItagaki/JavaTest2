package jp.co.aforce.test;

public class Person {

	private String name;
	private int age;

	Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	String getName() {
		return name;
	}

	int getAge() {
		return age;
	}

	public boolean isAdult(Person person) {
		if(this.age==20) {
			return true;
		} else {
			return false;
		}

	}
}
