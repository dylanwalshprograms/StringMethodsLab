import java.util.Scanner;

public class StringLab {
	
	private static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(StringMethods.capitalize("capitalize"));
		System.out.println(StringMethods.wheresWaldo("Wheres Waldo?"));
		System.out.println(StringMethods.afterMath("She aced the math test!"));
		System.out.println(StringMethods.firstThingsFirst("b", "a"));
		System.out.println(StringMethods.reverse("Reverse"));
		StringMethods.soLong("bean", "pea");
		StringMethods.letterize("Java");
		StringMethods.camelCase("desert survival guide");
	}
}
