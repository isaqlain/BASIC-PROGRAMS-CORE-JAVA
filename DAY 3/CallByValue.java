package P3;

public class CallByValue {

	public static void main(String[] args) {

		int x = 10;
		CallByValue.modify(x);
		System.out.println(x);
	}

	public static void modify(int x) {

		x = 20;
	}

}
