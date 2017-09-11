import java.util.GregorianCalendar;

public class Exercise09_05{
	public static void main (String[] agrs){
		GregorianCalendar g = new GregorianCalendar();

		System.out.println(g.get(GregorianCalendar.YEAR) + " : " + 
			(g.get(GregorianCalendar.MONTH) + 1) + " : " + g.get(GregorianCalendar.DAY_OF_MONTH));

		g.setTimeInMillis(1234567898765L);
		System.out.println(g.get(GregorianCalendar.YEAR) + " : " + 
			(g.get(GregorianCalendar.MONTH) + 1) + " : " + g.get(GregorianCalendar.DAY_OF_MONTH));
	}
}

//Java 的月份是从0开始的，0就相当于一月份，所以要加一。
/*
	2017 : 9 : 11
	2009 : 2 : 14
 */