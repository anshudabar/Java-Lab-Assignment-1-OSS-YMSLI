package Assignment1;

import java.util.Scanner;

public class Q4CopyOfTester {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int size=obj.nextInt();
		int array1[] = new int[size];
		System.out.println("Enter the elements of the array :");
		
		for(int i=0;i<size;i++) {
			array1[i]=obj.nextInt();
		}
		
		int newArray []=Q4CopyOf.CopyOf(array1);
		newArray[size-1]=7;         //to check if changes reflect or not
		Q4CopyOf.print(array1);
		Q4CopyOf.print(newArray);
		
	}
}
