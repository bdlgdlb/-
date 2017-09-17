import java.util.Date;

public class Exercise09_06{

	public static int[] getArray(){
		int[] array = new int[100000];
		for(int i = 0; i < array.length;i++){
			array[i] = (int)(Math.random() * 100000);
		}
		return array;
	}

	// public static void maoPao(int[] array){
	// 	int temp = 0;
	// }

	public static void xuanZe(int[] array){
		int temp = 0;
		for(int i = 0; i < array.length; i++){
			int k = i;
			for(int j = array.length - 1; j > i; j--){
				if (array[j] < array[k]){
					k = j;
				}
			}
			temp = array[i];
			array[i] = array[k];
			array[k] = temp;
		}
	}

	public static void main(String[] args) {
		StopWatch stopwatch = new StopWatch();
		int[] randomArray = getArray();

		stopwatch.start();

		xuanZe(randomArray);//
		stopwatch.stop();
		System.out.println("The execution time of sorting 100,000 " +
			"numbers using selection sort: " + stopwatch.getElapsedTime() +
			" milliseconds");
	}
}

class StopWatch{
	private long startTime;
	private long endTime;

	StopWatch(){
		this.startTime = System.currentTimeMillis();
	}

	public void start(){
		this.startTime = System.currentTimeMillis();
	}

	public void stop(){
		this.endTime = System.currentTimeMillis();
	}

	public long getElapsedTime(){
		return (endTime - startTime);
	}

	public long getStratTime(){
		return startTime;
	}

	public long getEndTime(){
		return endTime;
	}
}