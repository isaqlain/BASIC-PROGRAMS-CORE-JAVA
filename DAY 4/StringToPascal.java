package P5;

public class StringToPascal {

	public static void main(String[] args) {
		String str = "zero code innovation ltd";
		System.out.print(toCamelCase(str));
	}

	public static String toCamelCase(String init) {
		if (init == null)
			return "Null values not accepted";
		if (init == "")
			return "No string provided";
		StringBuilder ret = new StringBuilder(init.length());
		for (String word : init.split(" ")) {
			if (!word.isEmpty()) {
				ret.append(Character.toUpperCase(word.charAt(0)));
				ret.append(word.substring(1).toLowerCase());
			}
			if (!(ret.length() == init.length()))
				ret.append(" ");
		}
		String s = ret.toString();
		String s1 = s.replaceAll("\\s", "");
		return s1;
	}
}
