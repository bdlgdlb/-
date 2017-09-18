/*
	思路：每位雇员都是一行，可以用一个一维数组分别对应装下每位雇员每周工作总时长
 */
import java.util.Scanner;
class Demo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// System.out.println("Entre a 8-by-7 matrix row by row:");
		int[][] m = new int[8][7];
		int[] sum = new int[8];
		int[] copy = new int[8];
		// 输入数组
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = input.nextInt();
			}
		}
		//求出每位雇员每周工作的总时长并存放在sum数组对应的空间中
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				sum[i] += m[i][j];
				copy[i] = sum[i];
			}
		}
 		max(copy);
		for (int i = 0; i < sum.length; i++) {
			for(int j = 0; j < sum.length; j++){
				if (copy[i] == sum[j]){
					System.out.println("Employee " + j + " is " + copy[i]);
				}
			}
		}
	}

	//接受一个数组，将数组从大到小排序
	public static void max(int[] m)
	{
		int temp = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = i + 1; j < m.length; j++) {
				if (m[i] < m[j] ){
					temp = m[j];
					m[j] = m[i];
					m[i] = temp;
				}
			}
		}
	}
}