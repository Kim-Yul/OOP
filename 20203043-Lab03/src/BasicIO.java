import java.util.*;

// An exploration of basic input and output.
class BasicIO {

	// Reads and processes string input.
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		// get first input
		System.out.print("Enter your name: ");
		String name = stdin.nextLine();
		System.out.print("Enter your years: ");
		int years = stdin.nextInt();
		System.out.print("Enter your height: ");
		int height = stdin.nextInt();

		// display output on console
		System.out.println("your name is " + name + " and your years is " + years);
		System.out.println("your years -> Day : " + years + " -> " + years*365);
		System.out.printf("2020�� 10�� 07�� ���� %1$s(%2$d)�� Ű�� %3$d cm �Դϴ�.", name, years, height);
		
	} // method main
	
} // class BASIC_IO