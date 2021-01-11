package Assignment1;

import java.util.Scanner;

public class Q3GradesAverageTester {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int numStudents= obj.nextInt();		
		Q3GradesAverage result=new Q3GradesAverage(numStudents);
		result.addGrades();
		result.average();
		obj.close();
	}
}
