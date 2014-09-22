import java.util.Scanner;

public class GuessTheNumber {
	
	private static int LOWER_LIMIT = 1;
	private static int UPPER_LIMIT = 100;
	private static Scanner in;
	
	public static void main (String[] args){

		 // Initiate a new Scanner
		in = new Scanner(System.in);
        
		System.out.println("Think of a number between " + LOWER_LIMIT +" and " + UPPER_LIMIT + ".");
		binarySearch(LOWER_LIMIT, UPPER_LIMIT);
}

	private static void binarySearch(int lower, int higher) {
		int lh = lower;
		int rh = higher;
		int numberOfGuesses = 1;
		String userAnswer;
		int mid;
		while(lh <= rh) {
			
			mid = (lh + rh) / 2;
			System.out.println("Is it " + mid + "?");
			userAnswer = in.next();
			
			if(userAnswer.equalsIgnoreCase("yes")) {
				System.out.println("I guessed your number! It took me " +numberOfGuesses+" guesses.");
				break;
			}
			
			numberOfGuesses++;
			System.out.println("Is it less than " + mid + "?");
			userAnswer = in.next();
			
			if(userAnswer.equalsIgnoreCase("yes")) {
				rh = mid - 1;
			}else{
				lh = mid + 1;
			}
		}
	}
}
