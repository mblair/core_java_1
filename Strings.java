public class Strings {
	public static void main(String[] args) {
		String prefix = "Yo ";
		String expletive = "[retracted]";
		String both = prefix + expletive;
		String cut_short = both.substring(0, 7);
		System.out.println(cut_short);
	}
}
