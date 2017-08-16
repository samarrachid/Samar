package interfaceTest;

public interface Drivable {
	// why do it if i have to redefine them anyway??
	// is it because any vehicle have to implement them ?
	// like if we make a car class, motor class, .. etc..
	int getSpeed();
	void setSpeed(int speed);
	int getWheels();
	void setWheels(int wheels);
}
