public class Exercise13_06{
	public static void main(String[] args) {
		ComparableCircle comparableCircle1 = new ComparableCircle(12.5);
		ComparableCircle comparableCircle2 = new ComparableCircle(18.3);

		System.out.println("\nComparableCircle1:");
		System.out.println(comparableCircle1);
		System.out.println("\nComparableCircle2:");
		System.out.println(comparableCircle2);

		System.out.println((comparableCircle1.compareTo(comparableCircle2) == 1 
			? "\nComparableCircle1 " : "\nComparableCircle2 ") + 
			"is the larger of the two Circles");
	}
}

/*

ComparableCircle1:
created on Sat Oct 14 16:53:06 CST 2017
color: while and filled: false
Date created: Sat Oct 14 16:53:06 CST 2017
Radius: 12.5
Area: 490.8738521234052

ComparableCircle2:
created on Sat Oct 14 16:53:06 CST 2017
color: while and filled: false
Date created: Sat Oct 14 16:53:06 CST 2017
Radius: 18.3
Area: 1052.0879637606859

ComparableCircle2 is the larger of the two Circles

 */