public class Exercise10_10{
	public static void main(String[] args) {
		Queue queue = new Queue();

		for (int i = 0; i <= 20; i++) {
			queue.enqueue(i);
		}

		System.out.println("The queue is " + queue.getSize());

		for (int i = 0; i <= 20; i++){
			System.out.println("Queue remove the " + queue.dequeue());
		}
	}
}