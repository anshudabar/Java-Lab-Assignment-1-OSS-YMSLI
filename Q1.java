package Assignment1;

public class Q1 {
	public int total = 0;
    public void fibo(int n) {
    	 int a = 0;
    	 int b = 1;
    	 int sum = 0;
    	int i=0;
    	System.out.println("The first "+n+" fibonacci numbers are:");
    	while(i<=n) {
    		total+=sum;
    		if(sum != 0 )
    			System.out.print(sum + " ");
    		a = b;
    		b = sum;
    		sum = a+b;
    		i++;
    	}
    	System.out.println();
    }
    
    public void average(int n) {
    	float avg = total/n;
    	System.out.println("The average is " + avg);
    }
      
}
