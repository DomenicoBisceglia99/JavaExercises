package base;

public class ArrayMultidimensionale {
	public static void main(String[]args) {
		//gli array possono avere più dimensioni, ad esempio possono essere utilizzati per le matrici
		
		int[][] arr = new int[5][3];
		for(int i = 0; i < 5; i++) {
			for(int k = 0; k < 3; k++) {
				System.out.print(arr[i][k]+" ");
			}
			System.out.println();
		}
		
		
	}
}
