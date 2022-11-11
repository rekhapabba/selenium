package week1.day2Assignments;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num= 153, sum=0, temp, n;
		n=num;
		while(n>0) {
			temp = n%10;
			sum+= temp*temp*temp;
			n= n/10;
		}
		if(num==sum)
			System.out.println("Given number "+num+" is Armstrong Number");
		else
			System.out.println("Given number "+num+" is not an Armstrong Number");

	}
}
