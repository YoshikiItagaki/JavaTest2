package surasura.chapter11;

public class MyClassA {

	private int fieldA =0;

	private void methodA() {
		System.out.println("Do methodA");
	}

	void callSample() {
		System.out.println(this.fieldA);
		this.methodA();
	}



}
