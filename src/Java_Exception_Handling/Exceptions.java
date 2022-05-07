import java.util.*;
import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		try {

			System.out.println("Enter a number to divide: ");
			int x = scanner.nextInt();

			System.out.println("Enter a number to divide by: ");
			int y = scanner.nextInt();

			int z = x/y;
			System.out.println("Result: " + z);
		}
		/*catch(ArithmeticException e) {
		  System.out.println("You Can not divide by zero! IDIOT! ");

		  }*/
		catch(Exception e) {
			System.out.println("Something went Wrong ");
		}
		finally {
			scanner.close();
			System.out.println("This will always print!! ");
		}
	}





}
