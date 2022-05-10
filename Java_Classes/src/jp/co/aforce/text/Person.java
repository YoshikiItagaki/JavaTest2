package jp.co.aforce.text;

public class Person {

	//We store information of some fields only in a class.
	//That is what we call a static field, whereas you normally keep fields in each instance.
	String name;
	static int count = 0;

	//Method
	void setName(String name) {
		this.name = name;
	}

	//Static Method
	static void setCount(int count) {
		Person.count = count;
	}



	public static void main(String[] args) {

		Person person1 = new Person();
		Person person2 = new Person();

		//Field
		person1.name = "Nakagaki";
		person2.name = "Hayashi";

		//Static Field
		Person.count = 2;

		//Method
		person1.setName("Nakagaki");
		person2.setName("Hayashi");

		//Static Field
		Person.setCount(2);

	}
}

//We usually specify relations between object fields and an instance or object methods and an instance
//However, we occasionally run across a situation where we want to clarify fields that restore information
//of the class itself or prepare a class that contains those fields.