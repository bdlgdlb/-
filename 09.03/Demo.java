import java.util.Date;

public class Demo {
	public static void main(String[] args) {
		Date date = new Date();

		date.setTime(10000l);
		System.out.println(date.toString());
		date.setTime(100000l);
		System.out.println(date.toString());
		date.setTime(1000000l);
		System.out.println(date.toString());
		date.setTime(10000000l);
		System.out.println(date.toString());
		date.setTime(100000000l);
		System.out.println(date.toString());
		date.setTime(1000000000l);
		System.out.println(date.toString());
		date.setTime(10000000000l);
		System.out.println(date.toString());
		date.setTime(100000000000l);
		System.out.println(date.toString());

	}
}

/*
	Thu Jan 01 08:00:10 CST 1970
	Thu Jan 01 08:01:40 CST 1970
	Thu Jan 01 08:16:40 CST 1970
	Thu Jan 01 10:46:40 CST 1970
	Fri Jan 02 11:46:40 CST 1970
	Mon Jan 12 21:46:40 CST 1970
	Mon Apr 27 01:46:40 CST 1970
	Sat Mar 03 17:46:40 CST 1973
 */