package week1.day2Assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr1 = {1,2,4,5,6,8};
		Arrays.sort(arr1);
		for(int i=0,j=1;i<arr1.length;i++,j++) {
			if(arr1[i] != j) {
			  System.out.println("Missing Number " + j);
			  i--;
			}
		}

		

	}

}
