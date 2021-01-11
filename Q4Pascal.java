package Assignment1;

public class Q4Pascal {
	public static void PrintPascal(int n) {
	    for(int i = 1; i <= n; i++) {
	    int temp=1;
	    
	    for(int j = 1; j <= i; j++) {
	        System.out.print(temp+" "); 
	        temp = temp * (i - j) / j;  
	    }
	    
	    System.out.println(); 
	    } 
	} 
}
