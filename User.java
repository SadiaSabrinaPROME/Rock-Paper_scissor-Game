import java.util.Scanner;

public class User extends GameItems {
 
	Scanner scan;
  
	public User()
	{
		super();
		scan = new Scanner(System.in);
	}
	public CHOICES getChoice() {
		System.out.println("Please Enter your CHOICE: R= Rock, P= Paper & S= Scissors");
		char userChoice = scan.nextLine().toUpperCase().charAt(0);
		
	switch(userChoice) {
	case 'R': 
		return CHOICES.ROCK;
	case 'P':
		return CHOICES.PAPER;
	case 'S':
		return CHOICES.SCISSORS;
	}
	//if neither of them, its invalid input
	System.out.println("Invalid input! Try Again");
	return getChoice();
	}
}
