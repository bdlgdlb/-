import java.util.Scanner;

public class Exercise08_17 {
	public static void main(String[] args) {
	  	Scanner input = new Scanner(System.in);

	  	int n = input.nextInt();

	  	double[] balances = new double[n];
	  	double[][] borrowers = new double[n][n];

	  	double limit = input.nextDouble();

	  	for (int i = 0;i < n; i++){
	  		balances[i] = input.nextDouble();
	  		int numberOfBorrowers = input.nextInt();
	  		for (int j = 0; j < numberOfBorrowers; j++){
	  			int k = input.nextInt();
	  			borrowers[i][k] = input.nextDouble();
	  		}
	  	}
	  	double[] asset = new double[n];
	  	boolean[] isSafe = new boolean[n];

	  	for(int i = 0; i < n;i++)
	  		isSafe[i] = true;

		System.out.print("Unsafe banks are ");
		boolean newUnsafeFound = true;
		while (newUnsafeFound){
			newUnsafeFound = false;
			for (int i = 0;i < n;i++){
				asset[i] = balances[i];
				for(int j = 0;j < n; j++)
					asset[i] += borrowers[i][j];
			

				if (isSafe[i] && asset[i] < limit){
					isSafe[i] = false;
					newUnsafeFound = true;
					System.out.print(i + " ");

					for (int k = 0; k < n; k++){
						borrowers[k][i] = 0;
					}
				}
			}	
		}	
	}	
}
	
