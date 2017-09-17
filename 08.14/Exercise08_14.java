import java.util.Scanner;

public class Exercise08_14{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the size for the matrix:");

		int n = input.nextInt();
		int[][] a = new int[n][n];

		 boolean isSameOnARow = false, isSameOnAColumn = false,
      isSameOnADiagonal = false, isSameOnASubdiagonal = false;

		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++){
				a[i][j] = (int)(Math.random()*2);
				System.out.print(a[i][j]);
			}
			System.out.println();
		}

		//判断行
		for (int i = 0;i < n;i++){
			boolean same = true;
			for (int j = 0; j < n; j++){
				if (a[i][0] != a[i][j]){
					same = false;
					break;
				}
			}
			if (same){
				System.out.println("All" + a[i][0] + "s on row " + i);
				isSameOnARow = true;
			}
		}

		//判断列
		for (int i = 0;i < n;i++){
			boolean same = true;
			for (int j = 0; j < n; j++){
				if (a[0][i] != a[j][i]){
					same = false;
					break;
				}
			}
			if (same){
				System.out.println("All" + a[0][i] + "s on column " + i);
				isSameOnAColumn = true;
			}
		}

		//判断正对角线
	
		boolean same = true;
		for (int i = 0; i < n; i++){
			if (a[0][0] != a[i][i]){
				same = false;
				break;
			}
		}
		if (same){
			System.out.println("All" + a[0][0] + "s on the major diagonal " );
			isSameOnADiagonal = true;
		}
		

		//判断反对角线
		 same = true;
		for (int i = 0; i < n; i++){
			if (a[0][n-1] != a[i][i]){
				same = false;
				break;
			}
		}
		if (same){
			System.out.println("All" + a[0][0] + "s on the major diagonal " );
			isSameOnASubdiagonal= true;
		}

		if (!isSameOnARow){
			System.out.println("No same numbers on a row");
		}

		if (!isSameOnAColumn){
			System.out.println("No same numbers on a column");
		}

		if (!isSameOnADiagonal){
			System.out.println("No same numbers on the major diagonal");
		}

		if (!isSameOnASubdiagonal){
			System.out.println("No same numbers on the sub-diagonal");
		}
		
	}	
}	
