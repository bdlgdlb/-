public class MyInteger{
	private int value;

	public MyInteger(int value){
		this.value = value;
	}

	public int getValue(){
		return value;
	}

	//�ж�ż��
	public boolean isEven(){
		return  value % 2 == 0;
	}

	public static boolean isEven(int value){
		return  value % 2 == 0;
	}

	public static boolean isEven(MyInteger o){
		return  isEven(o.getValue());
	}

	//�ж�����
	public boolean isOdd(){
		return  value % 2 == 1;
	}

	public static boolean isOdd(int value){
		return  value % 2 == 1;
	}

	public static boolean isOdd(MyInteger o){
		return  isOdd(o.getValue());
	}

	//�ж�����
	public boolean isPrime(){
		for (int i = 2; i < value; i++) {
			if (value % i == 0){
				return false;
			}
		}

		return true;
	}

	public static boolean isPrime(int value){
		for (int i = 2; i < value; i++) {
			if (value % i == 0){
				return false;
			}
		}

		return true;
	}

	public static boolean isPrime(MyInteger o){
		return isPrime(o.getValue());
	}

	//�Ƚ϶����ֵ��ָ����ֵ�Ƿ����
	public boolean equals(int value){
		return this.value == value;
	}

	public boolean equals(MyInteger o){
		return equals(o.getValue());
	}

	//�������ַ�����ת��Ϊintֵ
	public static int parseInt(char[] numbers){
		int result = 0;
		for (int i = 0; i < numbers.length; i++) {
			result = result * 10 + (numbers[i] - '0');
		}

		return result;
	}

	//���ַ���ת��Ϊһ��intֵ
	public static int parseInt(String s){
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			result = result * 10 + (s.charAt(i) - '0');
		}

		return result;
	}
}