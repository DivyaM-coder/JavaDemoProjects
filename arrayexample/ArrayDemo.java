package com.demo.arrayexample;

public class ArrayDemo {

	public static void main(String[] args) {
		//Array declaration
		int[] arr = new int[5]; //recommended approach
		//int arr1[] = new int[5];
		arr[0] = 40;
		arr[1] = 50;
		arr[2] = 20;
		arr[3] = 80;
		arr[4] = 20;
		//arr[5] = 10; exception
		System.out.println(arr);
		for(int i =0; i < arr.length; i++ ){
			System.out.println(arr[i]);	}
	
		System.out.println("-------------------");
		int[] arr1 = {10,20,40,50,60};//dec and initialization
		System.out.println(arr1[0]); //10
		
	}

}
