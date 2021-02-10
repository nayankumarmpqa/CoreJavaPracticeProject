package udemy_Java_Concepts;

public class MotorBike {
	// add state

	int speed;
	// add behavior

	void setSpeed(int speed) {
		this.speed = speed;
		System.out.println(speed);
		System.out.println("this.speed " + this.speed);
	}
	void start() {
		System.out.println("Bike Started");
	}
}
