/*��������и������ֵĺͣ���дһ���������������������ض��е�����Ԫ�صĺͣ�ʹ�����з���ͷ��
public static double sunColumn(double[][] m, int columnIndex)
��дһ�����Գ��򣬶�ȡһ��3x4�ľ���Ȼ����ʾÿ��Ԫ�صĺ͡�*/
/*
˼·�����ض��е�Ԫ����ζ�ŵڶ����½Ǳ��ǲ���ģ�ֻҪ�䶯��һ���½Ǳ������
���⣺��ά����length��̫��

�𰸣�
��ά�����length������һά���鲻ͬ��
һά�����ʾ����ĳ��ȡ�
�ڶ�ά�����У�
������.lengthָʾ�����������
������[���±�] .lengthָʾ�����е�Ԫ�ظ�����
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