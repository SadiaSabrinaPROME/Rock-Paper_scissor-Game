
public class Game extends GameItems {

	private User user;
	private Computer computer;
	private CHOICES UserChoice;
	private CHOICES ComputerChoice;
	private RESULT result;
	private static int wins;
	private static int loses;
	private static int ties;
	
public Game()
{
	super();
	user = new User();
	computer = new Computer();

}
public void play()
{
	UserChoice = user.getChoice();
	ComputerChoice = computer.getChoice();
	result = getResults();
	displayResults();
	scoreBoard();
}

public void displayScoreBoard() {
	System.out.println("You have won " +wins+ "times");
	System.out.println("You have lost " +loses+ "times");
	System.out.println("Tie Happened " +ties+ "times");
}

public void scoreBoard() {

if (result== RESULT.WIN)
	wins++;
else if (result== RESULT.LOSE)
	loses++;
else 
	ties++;
	
}
private void displayResults() {
	switch(result) {
	case WIN:
		System.out.println(UserChoice + " beats " +ComputerChoice + "\n .Player Wins!");
		break;
	case LOSE:
		System.out.println(UserChoice + " loses to " +ComputerChoice + "\n Computer Wins!");
		break;
	case TIE:
		System.out.println(UserChoice + " equals to " +ComputerChoice + "\n Its a DRAW!!");
		break;
		
	}
}
private RESULT getResults() {
	if(UserChoice == ComputerChoice)
		return RESULT.TIE;
	switch(UserChoice) {
	case ROCK:
		return (ComputerChoice == CHOICES.SCISSORS? RESULT.WIN : RESULT.LOSE);
	case PAPER:
		return (ComputerChoice == CHOICES.ROCK? RESULT.WIN : RESULT.LOSE);
	case SCISSORS:
		return (ComputerChoice == CHOICES.PAPER? RESULT.WIN : RESULT.LOSE);
	}
	return RESULT.LOSE;
}
}
