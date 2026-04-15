package com.sakshi;
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		Random random = new Random ();
		
		int totalScore = 0;
		boolean playAgain = true;
		
		System.out.println(" Welcome to the Number Guessing Game! ");
		
		while (playAgain){
			
			int numberToGuess = random.nextInt(100)+1;
			int attempts = 0;
			int maxAttempts = 7;
			boolean guessedCorrectly = false;
			
			System.out.println("\n I have selected a number between 1 and 100.");
			System.out.println("\n You have" + maxAttempts +"attempts to guess it!");
			
			while(attempts < maxAttempts) {
				
			
			System.out.println("Enter your guess");
			int userGuess = scanner.nextInt();
			attempts++;
			
			if(userGuess == numberToGuess) {
				System.out.println("CORRECT! You guessed the number in" + attempts + "attempts.");
				guessedCorrectly = true;
				
				//Score calculation (More points to fewer attempts)
				int score = (maxAttempts - attempts + 1)* 10;
				totalScore += score;
				
				System.out.println(" You Earned " + score + "Points.");
				break;	
			}
			else if(userGuess< numberToGuess) {
				System.out.println(" Too Low! Try again.");
			}
			else {
				System.out.println("Too High! Try again.");
			}
		}
		if (!guessedCorrectly) {
			System.out.println("You ran out of attempts! The number was:" + numberToGuess);
		}
		System.out.println("Total Score:" + totalScore);
		
		//Ask for another round 
		System.out.println("\n Do you want to play again? (yes/no):" );
		String choice = scanner.next();
		
		if(!choice.equalsIgnoreCase("yes")) {
			playAgain = false;
		}
	}
	System.out.println("\n Thanks for playing!");
	scanner.close();
}
}

