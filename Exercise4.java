import java.io.* ;
import java.util.Scanner;

class Exercise4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter cook time: ");
		String time = input.next();

		System.out.println("Your time: " + convert(time));
	}

	public static String convert(String time) {
		if (time.length() <= 2) {
			return "0:" + time;
		}
		return time.substring(0,time.length()-2) + ":" + time.substring(time.length()-2);
	}
}