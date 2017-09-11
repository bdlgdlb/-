import java.util.Date;

public class Exercise09_03{
	public static void main(String[] args) {
		Date date = new Date();

		int count = 1;
		long time = 10000;
		while(count <= 8){
			date.setTime(time);
		System.out.println(date.toString());
			count ++;
			time *= 10;
		}	
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