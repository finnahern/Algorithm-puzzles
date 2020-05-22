public class Fizzbuzz50{
	
	//FizzBuzz for 1-50
	
	public static void main(String[] args){
		
		for(int i = 1; i <= 50; i++){
			
			boolean divisibleByThree = i % 3 == 0;
			boolean divisibleByFive = i % 5 == 0;
		
			if(divisibleByThree && divisibleByFive){
		
				System.out.println(i+ " FizzBuzz");
			
			}else if(divisibleByThree){
			
				System.out.println(i + " Fizz");
			
			}else if(divisibleByFive){

				System.out.println(i + " Buzz");
		
			}else{

				System.out.println(i + " :(");
			}	
		}
	}	
}	