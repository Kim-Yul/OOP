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
		System.out.printf("2020년 10월 07일 현재 %1$s(%2$d)의 키는 %3$d cm 입니다.", name, years, height);
		
	} // method main
	
} // class BASIC_IO