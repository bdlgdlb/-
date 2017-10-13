import java.util.*;

public class Exercise13_04{
	static Calendar calendar = new GregorianCalendar(); 
	public static void main(String[] args) {
		int month = calendar.get(Calendar.MONTH) + 1;
    	int year = calendar.get(Calendar.YEAR);

		if (args.length > 2) {
			System.out.println("Usage: java Exercise13_04 month year");
			System.exit(1);
		}
		else if (args.length == 2) {
			year = Integer.parseInt(args[1]);
			month = Integer.parseInt(args[0]);

			calendar.set(Calendar.YEAR, year);
			calendar.set(Calendar.MONTH, month - 1);
		}
		else if (args.length == 1) {
			month = Integer.parseInt(args[0]);

			calendar.set(Calendar.MONTH, month-1);
		}
		calendar.set(Calendar.DATE, 1);

		
		printHeader(calendar); 

		for (int i = 1; i < calendar.get(Calendar.DAY_OF_WEEK); i++) 
			System.out.print("    ");

		while (calendar.get(Calendar.DATE) <
			calendar.getActualMaximum(Calendar.DATE)) {

			if (calendar.get(Calendar.DAY_OF_WEEK) == 7)
				System.out.printf("%4d\n", calendar.get(Calendar.DATE));
			else
				System.out.printf("%4d", calendar.get(Calendar.DATE));

			calendar.add(Calendar.DATE, 1);
		}
		System.out.printf("%4d\n", calendar.get(Calendar.DATE));
	}

	/** Returns an String array of month names */
	public static String[] getMonths() {
		String[] months = {"January", "February", "March", "April", "May", "June", 
			"July", "August", "September", "October", "November", "December"};
		return months;
	}

	/** Display calander header */
	public static void printHeader(Calendar calendar) {
		// Create an array of month names
		String[] months = getMonths();

		// Center month and year center format
		int length = 29 / 2 - (months[calendar.get(Calendar.MONTH)].length() / 2 + 3);
		System.out.println();
		for (int i = 0; i < length; i++)
			System.out.print(" ");
		System.out.println(months[calendar.get(Calendar.MONTH)] + ", " + 
			calendar.get(Calendar.YEAR));

		// Print week day names
		System.out.println("-----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}
}