package javam.evolution;

public class SwitchExample {
	
	private static String valueForDay(int day) {
		return switch (day) {
			case 0,1 -> "Sunday";
			case 2 -> "Monday";
			case 3 -> "Tuesday";
			case 4 -> "Wednesday";
			case 5 -> "Thursday";
			case 6 -> "Friday";
			case 7 -> {
				System.out.println("Its Sabbath!");
				yield "Saturday";
			}
			default -> "its an unknown weekday";
		};
	}
	
	public static void main(String[] args) {
		System.out.println(valueForDay(1));
	}

}
