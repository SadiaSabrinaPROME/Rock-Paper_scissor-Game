import java.util.Scanner;
public class MyMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Game game = new Game();
		char quit = ' ';
		while (quit!= 'E')
		{
			game.play();
			System.out.println("To continue press any key & to exit press E");
			quit= scan.nextLine().toUpperCase().charAt(0);
		}
		scan.close();
		game.displayScoreBoard();
		game.scoreBoard();
	}

}
