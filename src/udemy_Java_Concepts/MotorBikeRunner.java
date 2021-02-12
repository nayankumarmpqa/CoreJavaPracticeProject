package udemy_Java_Concepts;

public class MotorBikeRunner {

	public static void main(String[] args) {

		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();

		ducati.start();
		honda.start();

		ducati.setSpeed(100);
		honda.setSpeed(50);

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());


		ducati.increaseSpeed(10);
		honda.increaseSpeed(10);

		System.out.println("After increase " + ducati.getSpeed());
		System.out.println("After increase " + honda.getSpeed());

		ducati.decreaseSpeed(50);
		honda.decreaseSpeed(540);

		System.out.println("After decrease " + ducati.getSpeed());
		System.out.println("After decrease " + honda.getSpeed());
	}


}
