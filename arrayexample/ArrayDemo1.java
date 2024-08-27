package com.demo.arrayexample;

import java.util.Scanner;

public class ArrayDemo1 {

	//Create an array of numbers - user input
	public void acceptUserInput()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array : ");
		int sizeOfArr = sc.nextInt();
		System.out.println("Array size : " + sizeOfArr);//String + int = concatenation
		
		//Array Declaration
		int[] marks = new int[sizeOfArr];
		
		//Accepting the elements of array
		for(int i=0; i<marks.length; i++)//sizeOfArr
		{
			//Enter marks of Subject 1 : 
			System.out.println("Enter marks of subject " + (i+1) + " : " );
			marks[i] = sc.nextInt();
		}
		
		//Displaying the array elements
		for(int i=0; i< marks.length; i++)
		{	
			//Marks of subject 1 : 50
			System.out.println("Marks of Subject " +(i+1) + " : " + marks[i]);
		
		}
		System.out.println("-----------------------------");
		
		//Enhanced for loop
		for(int element : marks)
		{
			System.out.println("Marks of Subject : " + element);
		}
		
		sc.close();
	}
	public static void main(String[] args) 
	{
		ArrayDemo1 obj = new ArrayDemo1();
		obj.acceptUserInput();
		
		//int[] arr = new int[-5]; //NegativeArraysizeException
		
	}

	
}
