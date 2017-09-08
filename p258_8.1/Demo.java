/*（求矩阵中各列数字的和）编写一个方法，求整数矩阵中特定列的所有元素的和，使用下列方法头：
public static double sunColumn(double[][] m, int columnIndex)
编写一个测试程序，读取一个3x4的矩阵，然后显示每列元素的和。*/
/*
思路：用特定列的元素意味着第二个下角标是不变的，只要变动第一个下角标就行了
问题：二维数组length不太懂

答案：
二维数组的length属性与一维数组不同。
一维数组表示数组的长度。
在二维数组中：
数组名.length指示数组的行数。
数组名[行下标] .length指示该行中的元素个数。
 */
import  java.util.Scanner;

class Demo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-by-4 matrix row by row:");
		double[][] m = new double[3][4];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = input.nextDouble();
			}
		}

		for (int i = 0; i < m[0].length; i++) {
			System.out.println("Sum of the elements at column " + i + " is " + sunColumn(m,i));
		}
	}

	public static double sunColumn(double[][] m, int columnIndex){
		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i][columnIndex];
		}
		return sum;
	}
}
/*
1.5 2 3 4
5.5 6 7 8
9.5 1 3 1
Sum of the elements at column 0 is 16.5
Sum of the elements at column 1 is 9.0
Sum of the elements at column 2 is 13.0
Sum of the elements at column 3 is 13.0
 */