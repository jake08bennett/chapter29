import java.io.* ;
import java.util.Scanner;

class Exercise5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNextLine()) {
      String line = input.nextLine();
      if (line.startsWith("//")) {
        System.out.println(line);
      }
    }
	}
}
