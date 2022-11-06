package week1.day1;

public class Mobile {
	String mobileBrandName = "Samsung";
	char mobileLogo = '$';
	short noOfMobilePiece = 123;
	int modelNumber = 31;
	long mobileImeiNumber = 546789234L;
	float mobilePrice = 35000f;
	boolean isDamaged = false;
	
	public void makeCall() {
		// Call making
		System.out.println("Calling...");
	}
	public void sendMsg() {
		// sending message
		System.out.println("Messaging...");
	}
	public static void main(String[] args) {
		// Object to call Mobile class
		Mobile myMobile = new Mobile();
		System.out.println("I use " + myMobile.mobileBrandName + " mobile");
		System.out.println("The brand model is M" + myMobile.modelNumber + "S");
		System.out.println("Its logo is " + myMobile.mobileLogo);
		long mobileImeiNumber = myMobile.mobileImeiNumber;
		System.out.println("The IMEI number is " + mobileImeiNumber);
		System.out.println("Status of damage is " + myMobile.isDamaged);
		short noOfMobilePiece = myMobile.noOfMobilePiece;
		System.out.println("It has " + noOfMobilePiece + " MobilePieces");
		System.out.println("Its price is Rs." + myMobile.mobilePrice);
		myMobile.makeCall();
		myMobile.sendMsg();
	}

}
