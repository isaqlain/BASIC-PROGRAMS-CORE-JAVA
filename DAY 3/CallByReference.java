package P3;

public class CallByReference {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle(10);
		System.out.println(r1.lenght); /* Before calling method */
		CallByReference.modify(r1); /* Passing Reference value of an object */
		System.out.println(r1.lenght);
	}

	public static void modify(Rectangle r1) {
		r1.lenght = 30;
	}

}
