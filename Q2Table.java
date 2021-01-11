package Assignment1;

public class Q2Table {
	private int n;
	private int arrTable[][];
	
	public Q2Table(int n){
		this.n=n;
	}
	public void ConstructTable() {
		arrTable= new int[n][10];
		for(int i=0;i<n;i++) {
			for(int j=0;j<=9;j++) {
				arrTable[i][j]=(i+1)*(j+1);
			}
		}
	}
	public void PrintTable() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<=9;j++) {
				System.out.print(arrTable[i][j]+" ");
			}
			System.out.println();
		}
	}
}
