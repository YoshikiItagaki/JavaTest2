package jp.co.aforce.text;

public class Car {

	protected int speed;

	//10.3 Override
	/*void speedUp(int value) {
		this.speed+=value;

		if(this.speed>=180) {
			this.speed=180;
		}
	}*/

	//10.3 Override
	void speedDown(int value) {
		this.speed-=value;
		if(this.speed<=-15) {
			this.speed=-15;
		}
	}

	//10.4 Overload
	void lock(Key key) {
		System.out.println("\nLocked with a key");
	}

	//10.4 Overload
	void lock(RemoteController controller) {
		System.out.println("\nLocked with a controller");
	}

	//10.6 Final
	final void initialize() {
		this.speed = 0;
		System.out.println("\nDrive on");
	}

	//10.7 Inner Class

	private Engine engine;
	private String name = "body";

	class Engine{

		private String name = "engine";

		void start() {
			System.out.println("Start the engine");
		}

		void check() {
			System.out.println(this.name);
			System.out.println(Car.this.name);
		}
	}

	Car(){
		//This is actually a constructor.
		//When you initialize Car, you do initialize Engine as well.
		this.engine = new Engine();
	}

	void start() {
		this.engine.start();
		System.out.println("\nYou may start");
	}

	void check() {
		this.engine.check();
	}

	//10.9 Static Field and Static Method

	//10.10 Constant

	private static final int MAX_SPEED = 180;

	void speedUp(int value) {
		this.speed+=value;

		if(this.speed >= MAX_SPEED) {
			this.speed = MAX_SPEED;
		}
	}

}
