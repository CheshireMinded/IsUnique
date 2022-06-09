import java.util.Scanner;

public class IsUnique {
	// driver
	public static void main(String[] args) {
		
	// create a scanner for input
		Scanner sc = new Scanner(System.in);
		
	// ask for input
		System.out.println("Enter String: ");
		String input = sc.nextLine();
		
	// if-else statement is unique or not unique
		if (isUnique(input)) {
			System.out.println("UNIQUE");
		} else {
			System.out.println("NOT unique");
		}
	// close the scanner
		sc.close();
	}
	
	static boolean isUnique(String str) {
		int var = 0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
			if((var & (1 << val)) > 0) {
				return false;
			}
			var |= (1 << val);
		}
		return true;
				
			}
		}
		
		
		

	
	
	
/*
 * 
 * Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures? 
 * 
 */
		

