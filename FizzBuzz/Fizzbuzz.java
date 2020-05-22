import java.util.Scanner;

public class Fizzbuzz{
	
	//Write a program that can take a number and if the number is evenly divisible by 3, it should return "Fizz", 
	//if it's divisible by 5, it should return "Buzz", and if it's divisible by both 3 and 5, it should return "FizzBuzz"	
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		int x = Integer.valueOf(str);
		
		boolean divisibleByThree = x % 3 == 0;
		boolean divisibleByFive = x % 5 == 0;
		
		
		if(divisibleByThree && divisibleByFive){
			
			System.out.println("FizzBuzz");
			
		}else if(divisibleByThree){
			
			System.out.println("Fizz");
			
		}else if(divisibleByFive){

			System.out.println("Buzz");
		
		}else{

			System.out.println(":(");
		}			
	}	
}	