package interfaceTest;

public class Vehicle implements Drivable {
	int speed;
	int wheels = 94;
	
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	public int getWheels(){
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	Vehicle() {}
	Vehicle(int wheels, int speed) {
		this.wheels = wheels;
		this.speed = speed;
	}
	

	
	


}
