public class Enumerations {
	enum Size { SMALL, MEDIUM, LARGE, EXTRA_LARGE };

	static Size s = Size.LARGE;

	public static void main(String[] args) {
		System.out.println(s);
	}
}
