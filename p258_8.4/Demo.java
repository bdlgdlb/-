/*
	˼·��ÿλ��Ա����һ�У�������һ��һά����ֱ��Ӧװ��ÿλ��Աÿ�ܹ�����ʱ��
 */
import java.util.Scanner;
class Demo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// System.out.println("Entre a 8-by-7 matrix row by row:");
		int[][] m = new int[8][7];
		int[] sum = new int[8];
		int[] copy = new int[8];
		// ��������
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = input.nextInt();
			}
		}
		//���ÿλ��Աÿ�ܹ�������ʱ���������sum�����Ӧ�Ŀռ���
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

	//����һ�����飬������Ӵ�С����
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