package week1.day2Assignments;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		for(int i=0;i<data.length;i++)
			System.out.println(data[i]);
		System.out.println("Second largest element is "+data[(data.length)-2]);

	}

}
