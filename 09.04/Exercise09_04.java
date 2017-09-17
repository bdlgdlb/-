import java.util.Random;

public class Exercise09_04{
	public static void main(String[] args) {
		Random random = new Random(1000);

		for (int i = 0; i < 50; i++){
			System.out.printf("%d\t",random.nextInt(100));
			if (i % 10 == 9){
				System.out.println();
			}
		}
	}
}
/*
	87      35      76      24      92      49      41      45      64      50

	79      59      72      83      36      75      46      2       23      41

	22      71      89      2       93      42      49      42      35      76

	32      0       52      95      87      31      99      18      79      2

	91      5       55      84      71      95      58      87      77      38

 */