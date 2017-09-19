public class Exercise10_14 {
	public static void main(String[] args) {
		MyDate date1 = new MyDate();
		MyDate date2 = new MyDate(34355555133101L);
		MyDate date3 = new MyDate(561555550000L);

		System.out.println("Date1: " + date1.getMonth() + "/" + date1.getDay() + 
			"/" + date1.getYear());
		System.out.println("Date2: " + date2.getMonth() + "/" + date2.getDay() + 
			"/" + date2.getYear());
		System.out.println("Date3: " + date3.getMonth() + "/" + date3.getDay() + 
			"/" + date3.getYear());
	}
}

/*
	Date1: 8/19/2017
	Date2: 8/8/3058
	Date3: 9/18/1987

 */