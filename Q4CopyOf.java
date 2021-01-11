package Assignment1;

public class Q4CopyOf {

	public static int[] CopyOf(int[] oldArray) {
		 int newArray[]=new int[oldArray.length];
		 
		 for(int i=0;i<oldArray.length;i++) {
			 newArray[i]=oldArray[i];
		 }
		 
		 return newArray;
	 }
	
	public static void print(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
