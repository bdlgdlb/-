/*
 ��������Խ���Ԫ�صĺ�
 ��дһ����������n x n��double��ľ��������Խ������������ֵĺͣ�ʹ�����еķ���ͷ��
  	public static double sumMajorDiagonal(double[][] m)
 	��дһ�����Գ��򣬶�ȡһ��4x4�ľ���Ȼ����ʾ�������Խ����ϵ�����Ԫ�صĺ͡�
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

//˼·�� ���Խ����ϵ�����Ǳ�������ͬ
//��m[0][0],m[1][1],m[2][2],m[3][3]���
	public static double sumMajorDiagonal(double[][] m){
		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i][i];
		}
		return sum;
	}
	//���Խ��ߵ�˼·����m[i][m[i].length - i] 
	/*
	C:\Users\lenovo\Desktop\Demo\p258_8.2>java Demo < 1.txt
	Entre a 4-by-4 matrix row by row:
	Sum of the elements in the major diagonal is 34.5
	 */
}