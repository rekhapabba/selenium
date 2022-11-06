package week1.day1;

public class TwoWheeler {
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 8934566789L;
	boolean isPunctured = false;
	String bikeName = "Jupiter Activa";
	double runningKM = 50;
	
	public static void main(String[] args) {
		// Object to call TwoWheeler class
		TwoWheeler myBike = new TwoWheeler();
		System.out.println("I ride " + myBike.bikeName);
		System.out.println("It has " + myBike.noOfWheels + " Wheels");
		long chassisNumber = myBike.chassisNumber;
		System.out.println("The Chassis number is " + chassisNumber);
		System.out.println("Status of Puncture is " + myBike.isPunctured);
		System.out.println("It gives mileage of " + myBike.runningKM + "km/litre");
		short noOfMirrors = myBike.noOfMirrors;
		System.out.println("It has " + noOfMirrors + " Mirrors");

	}
}
