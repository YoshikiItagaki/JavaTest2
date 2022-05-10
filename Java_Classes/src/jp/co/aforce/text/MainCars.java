package jp.co.aforce.text;

public class MainCars {

	public static void main(String[] args) {

		Car car1 = new Car();
		Key key = new Key();
		car1.lock(key);
		car1.initialize();
		car1.check();

		Car car2 = new Car();
		RemoteController controller = new RemoteController();
		car2.lock(controller);

		SuperCar superCar = new SuperCar();
		superCar.initialize();

	}

}
