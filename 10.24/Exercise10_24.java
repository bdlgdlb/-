public class Exercise10_24{
	public static void main(String[] args) {
		MyCharacter c = new MyCharacter('A');
		System.out.println(c.isDigit());
		System.out.println(MyCharacter.isDigit('t'));
	}
}

/*
	false
	false

 */