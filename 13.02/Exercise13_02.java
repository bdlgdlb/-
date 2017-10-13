import java.util.ArrayList;

public class Exercise13_02{
	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList<>();
		list.add(1);
		list.add(2.3);
		list.add(3);
		list.add(4.6);
		list.add(5);
		list.add(6.246);
		list.add(7.43);
		list.add(8);
		System.out.println(list.toString());
		shuffle(list);
		System.out.println(list.toString());
	}

	// public static void shuffle(ArrayList<Number> list){
	// 	java.util.Collections.shuffle(list);
	// }

	public static void shuffle(ArrayList<Number> list){
		ArrayList<Number> array = new ArrayList<>();

		while(!list.isEmpty()){
			int i = (int)(Math.random() * list.size());
			array.add(list.get(i));
			list.remove(i);
		}

		for (int i = 0; i < array.size(); i++) {
			list.add(array.get(i));
		}
	}
}