public class BuildingStrings {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		builder.append("My ");
		builder.append("name ");
		builder.append("is ");
		builder.append("Matthew ");
		builder.append("Blair!");
		builder.insert(3, "email address is me@matthewblair.net and my ");
		String mb = builder.toString();
		System.out.println(mb);
	}
}
