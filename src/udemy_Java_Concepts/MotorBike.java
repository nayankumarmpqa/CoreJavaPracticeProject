package udemy_Java_Concepts;

public class MotorBike {
	// add state

	int speed;

	// add behavior

	void start() {
		System.out.println("Bike Started");
	}

	void setSpeed(int speed) { // local variable int speed in the brackets
		if (speed > 0) {

		this.speed = speed;
		}
		else {
			System.out.println("You are trying to set -ve speed");
		}
	}

	int getSpeed() {

		return this.speed;
	}

	void increaseSpeed(int howMuch) { // local variable int speed in the brackets

		setSpeed(this.speed + howMuch);
	}

	void decreaseSpeed(int howMuch) { // local variable int speed in the brackets

		setSpeed(this.speed - howMuch);
	}
}
