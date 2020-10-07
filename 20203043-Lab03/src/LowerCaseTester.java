// Create Class to LowerCaseTester
class LowerCaseTester {
	
	// main() of LowerCaseTester
	public static void main(String[] args) {
	
		// Create String variable
		String testString = "This is a Test";
		String smallTestString = testString.toLowerCase();
		
		// display output on console
		System.out.println(smallTestString);
		String bigTestString = smallTestString.toUpperCase();
		System.out.println(bigTestString);
		
	}
	
}