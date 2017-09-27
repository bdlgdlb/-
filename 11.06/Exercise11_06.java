import java.util.ArrayList;
import java.util.Date;

public class Exercise11_06{
	public static void main(String[] args) {
		ArrayList<Object> list =new ArrayList<>();

		list.add(new Loan());
		list.add(new Date());
		list.add(new String("String class"));
		list.add(new Circle());

		for (int i = 0; i < list.size(); i++) {
			System.out.println((list.get(i)).toString());
		}
	}
}
/*
	Loan@15db9742
	Wed Sep 27 10:47:34 GMT+08:00 2017
	String class
	Circle@5c647e05

 */