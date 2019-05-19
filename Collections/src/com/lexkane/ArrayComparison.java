package com.lexkane;
import java.util.Arrays;

public class ArrayComparison {

	public static void main(String[] args) {
		int arr1[] = {1,2,3};
		int arr2[] = {1,2,3};
		
		/*if(arr1 == arr2){
			System.out.println("Arrays are Equals");
		}else{
			System.out.println("Arrays are not Equals");
		}*/
		/*boolean flag = true;
		
		if(arr1.length == arr2.length){
			
			for (int i = 0; i < arr2.length; i++) {
				if(arr1[i] == arr2[i]){
					
				}else{
					flag = false;
					break;
				}
			}
			
		}else{
			System.out.println("Arrays length is not matching");
		}
		
		if(flag){
			System.out.println("Arrays are Equals");
		}else{
			System.out.println("Arrays are not Equals");
		}*/
		
		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Arrays are Equals");
		}else{
			System.out.println("Arrays are not Equals");
		}
		int[] intArray = new int[5];
		String[] arrayTwo = new String[]{"New York", "LA", "Zurich", "London", "New Delhi"};
		
		
		intArray[0] = 76;
		intArray[1] = 66;
		intArray[2] = 987;
		intArray[3] = 12;
		intArray[4] = 176;
		
		
		
		/*System.out.println(intArray[2]);
		System.out.println(arrayTwo[7]);
*/
		for (int i = 0; i < intArray.length; i++) {
			System.out.println("Element at Index : " +i+ " is : " + intArray[i]);
		}
		
		for (String city : arrayTwo) {
			System.out.println(city);
		}
	}

	}

