/*
 求矩阵主对角线元素的和
 编写一个方法，求n x n的double类的矩阵中主对角线上所有数字的和，使用下列的方法头：
  	public static double sumMajorDiagonal(double[][] m)
 	编写一个测试程序，读取一个4x4的矩阵，然后显示它的主对角线上的所有元素的和。
 */
import java.util.Scanner;
class Demo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Entre a 4-by-4 matrix row by row:");
		double[][] m = new double[4][4];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = input.nextDouble();
			}
		}
		System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(m));
	}

//思路： 主对角线上的数组角标数字相同
//即m[0][0],m[1][1],m[2][2],m[3][3]相加
	public static double sumMajorDiagonal(double[][] m){
		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i][i];
		}
		return sum;
	}
	//反对角线的思路就是m[i][m[i].length - i] 
	/*
	C:\Users\lenovo\Desktop\Demo\p258_8.2>java Demo < 1.txt
	Entre a 4-by-4 matrix row by row:
	Sum of the elements in the major diagonal is 34.5
	 */
}