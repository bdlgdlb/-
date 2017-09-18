public class Queue{
	private int[] element;
	private int size;
	private static final int DEFAULT_CAPACITY = 16;

	public Queue(){
		this(DEFAULT_CAPACITY);
	}

	public Queue(int capacity){
		element = new int[capacity];
	}

	public void enqueue(int v){
		if (size >= element.length) {
			int[] temp = new int[element.length * 2];
			System.arraycopy(element, 0, temp, 0, element.length);
			element = temp; 
		}

		element[size++] = v;
	}

	public int dequeue(){
		int temp;
		temp = element[0];
		for (int i = 1; i < element.length; i++) {
			element[i - 1] = element[i];
		}
		element[--size] = 0;
		return temp;
	}

	public boolean empty(){
		return size == 0;
	}

	public int getSize(){
		return size;
	}
}