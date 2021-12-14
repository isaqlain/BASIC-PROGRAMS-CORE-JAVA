package P5;

public class StringToToggle {

	public static void main(String[] args) {
		String str = "Zero codeInnovation ltd";
		System.out.print(toToggleCase(str));
	}

	public static String toToggleCase(String sentence) {
		String toggled = "";
		for (int i = 0; i < sentence.length(); i++) {
			char letter = sentence.charAt(i);
			if (Character.isUpperCase(sentence.charAt(i))) {
				letter = Character.toLowerCase(letter);
				toggled = toggled + letter;
			} else if (Character.isLowerCase(sentence.charAt(i))) {
				letter = Character.toUpperCase(letter);
				toggled = toggled + letter;
			}
		}
		return toggled;
	}
}
