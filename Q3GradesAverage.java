package Assignment1;

import java.util.Scanner;

public class Q3GradesAverage {
	Scanner obj = new Scanner(System.in);
	private int numStudents,count=1,total=0;
	private int Grades[];
	
	public Q3GradesAverage(int numStudents) {
		this.numStudents = numStudents;
		Grades= new int[numStudents];
	}
	
	public void addGrades() {
		while(count<=numStudents) {
			System.out.println("Enter the grade of student: "+count);
			int marks= obj.nextInt();
			if(marks<0 || marks>100)
				continue;
			Grades[count-1]=marks;
			total+=marks;
			count++;
		}
	}
	
	public void average() {
		double avg = total/numStudents;
		System.out.println("The average is: "+avg);
	}
	
}
