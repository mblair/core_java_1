public class ImmutableStrings {
	public static void main(String[] args) {
		String m = "Matt Blair";
		String formal_m = m.substring(0, 4) + "hew" + m.substring(4, 10);
		System.out.println(formal_m);
	}
}
