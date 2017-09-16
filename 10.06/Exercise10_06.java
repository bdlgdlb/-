public class Exercise10_06{

	public static boolean isPrime(int number){
		for (int i = 2; i < number / 2; i++) {
			if(number % i == 0){
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		final int LIMIT = 120;

		StackOfIntegers stack = new StackOfIntegers();

		for (int i = 2; i < LIMIT; i++) {
			if(isPrime(i)){
				stack.push(i);
			}
		}

		System.out.println("The prime numbers less than 120 are : ");

		int i = 0;
		while (!stack.empty()) {
			System.out.print(stack.pop() + "\t");
			i++;
			if (i % 5 == 0) {
				System.out.println();
			}
		}
	}
}

/*
	The prime numbers less than 120 are :
	113     109     107     103     101
	97      89      83      79      73
	71      67      61      59      53
	47      43      41      37      31
	29      23      19      17      13
	11      7       5       4       3
	2
 */