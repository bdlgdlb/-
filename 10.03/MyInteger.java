public class MyInteger{
	private int value;

	public MyInteger(int value){
		this.value = value;
	}

	public int getValue(){
		return value;
	}

	//判断偶数
	public boolean isEven(){
		return  value % 2 == 0;
	}

	public static boolean isEven(int value){
		return  value % 2 == 0;
	}

	public static boolean isEven(MyInteger o){
		return  isEven(o.getValue());
	}

	//判断奇数
	public boolean isOdd(){
		return  value % 2 == 1;
	}

	public static boolean isOdd(int value){
		return  value % 2 == 1;
	}

	public static boolean isOdd(MyInteger o){
		return  isOdd(o.getValue());
	}

	//判断素数
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

	//比较对象的值和指定的值是否相等
	public boolean equals(int value){
		return this.value == value;
	}

	public boolean equals(MyInteger o){
		return equals(o.getValue());
	}

	//将数字字符数组转化为int值
	public static int parseInt(char[] numbers){
		int result = 0;
		for (int i = 0; i < numbers.length; i++) {
			result = result * 10 + (numbers[i] - '0');
		}

		return result;
	}

	//将字符串转换为一个int值
	public static int parseInt(String s){
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			result = result * 10 + (s.charAt(i) - '0');
		}

		return result;
	}
}