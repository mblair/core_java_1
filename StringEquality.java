public class StringEquality {
	public static void main(String[] args) {
		String lower_m = "matt";
		String upper_m = "Matt";
		String lower_matt = "matt";
		if (lower_m.equals(lower_matt)) {
			System.out.println("Yep.");
		}
		
		if (upper_m.equalsIgnoreCase(lower_matt)) {
			System.out.println("That too.");
		}
	}
}
