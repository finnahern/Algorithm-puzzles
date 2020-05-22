import java.util.Scanner;

public class Palindrome{
	
	//Simple program that reads a word and determines if it's a palindrome or not.
	
	public static void main(String[] args){
	
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		String rev = "";
	
		for(int i = str.length() - 1; i >= 0; i--){
	
			rev = rev + str.charAt(i);
		}

		if(str.equals(rev)){
			
			System.out.println(str + " is a palindrome!");	
		
		}else{
			
			System.out.println(str + " is not a palindrome.");
		}	
		
	}
}