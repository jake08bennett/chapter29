import java.io.* ;
import java.util.Scanner;

class Exercise3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
  	String inputName = "Banter";

	  	while (inputName.length() > 0) {
			System.out.println("\nEnter a name:");
  			inputName = input.next();
	  		switch (checkName(inputName)) {
  				case 0: System.out.println("Mr. " + inputName);
  						break;
  				case 1: System.out.println("Ms. " + inputName);
  						break;
  				default: System.out.println(inputName);
  			}
  		}
  	}

    public static int checkName(String name) {
      if (name.startsWith("Elroy") || name.startsWith("Fred")    ||name.startsWith("Graham")) {
        return 0;
      } else if (name.startsWith("Amy") || name.startsWith("Buffy")   ||name.startsWith("Cathy")) {
        return 1;
      }
      return 2;
    }
}