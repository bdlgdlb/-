public class Exercise10_01{
	public static void main(String[] args) {
		Time t1 = new Time();
		Time t2 = new Time(555550000);

		System.out.println("t1 : " + t1.getHour() + " Hour " + t1.getMinute() + " min " + t1.getSecond() + " sec ");
		System.out.println("t2 : " + t2.getHour() + " Hour " + t2.getMinute() + " min " + t2.getSecond() + " sec ");
	}
}

/*
	t1 : 12 Hour 9 min 59 sec
	t2 : 10 Hour 19 min 10 sec
 */