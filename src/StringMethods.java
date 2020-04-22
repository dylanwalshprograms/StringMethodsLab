
public class StringMethods {

	public static void main(String[] args) {
		
		System.out.println(capitalize("capitalize"));
		System.out.println(wheresWaldo("Wheres Waldo?"));
		System.out.println(firstThingsFirst("b", "a"));
		System.out.println(reverse("reverse"));
		soLong("bean", "pea");
		System.out.println(afterMath("She aced the mathematics test!"));
		letterize("Java");
		camelCase("desert survival guide");
		
	}
	
	public static String capitalize(String word) {
		return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
	}
	
	public static int wheresWaldo(String phrase) {
		if (phrase.contains("Waldo")) {
			return phrase.indexOf("Waldo");
		}
		else {
			return -1;
		}
	}
	
	public static String firstThingsFirst(String a, String b) {
		if (a.charAt(0) < b.charAt(0)) {
			return a + " " + b;
		}
		else {
			return b + " " +  a;
		}
	}
	
	public static String reverse(String s) {
		String reversed = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reversed += s.charAt(i);
		}
		return reversed;
	}
	
	public static void soLong(String a, String b) {
		if (a.length() > b.length()) {
			System.out.println(a);
		}
		else if (a.length() < b.length()) {
			System.out.println(b);
		}
		else {
			System.out.println(a + " " +  b);
		}
	}
	
	public static String afterMath(String phrase) {
		phrase = phrase.toLowerCase();
		if (phrase.contains("math")) {
			return phrase.substring(phrase.indexOf("math"));
		}
		else {
			return "dud";
		}
	}
	
	public static void letterize(String word) {
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
	}
	
	public static void camelCase(String s) {
		String convertedToCamelCase = "";
		
		for (int i = 0; i < s.length(); i++) {
			if (i > 0) {
				if (s.charAt(i) == ' ') {
					convertedToCamelCase += Character.toUpperCase(s.charAt(i + 1));
				}
				else if	(s.charAt(i - 1) == ' ') {
					convertedToCamelCase += "";
				}
				else {
					convertedToCamelCase += s.charAt(i);
				}	
			}
			else {
				convertedToCamelCase += Character.toLowerCase(s.charAt(i));
			}
		}
		System.out.println(convertedToCamelCase);
	}
}

