import java.util.Scanner;

public class GameMain {
	public static void main(String[] args) {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("                      Welcome to Guesser Game                      ");
		System.out.println("-------------------------------------------------------------------\n");
		Host host = new Host();
		host.setPlayersCount();
		host.askingGuesser();
		host.askingPlayer();
		host.checkingResult();
	}
}

//Player
class Player {
	String playerName;
	int playerSelectedNumber;
	int score;
	Scanner scanner = new Scanner(System.in);

	public Player[] selectPlayerDetails(int count) {
		Player[] players = new Player[count];
		System.out.println("-------------------------------------------------------------------");
		System.out.println("                         Enter Player Name                         ");
		System.out.println("-------------------------------------------------------------------");
		for (int i = 0; i < count; i++) {
			Player p = new Player();
			System.out.print("Player " + (i + 1) + " Enter your name: ");
			p.playerName = scanner.nextLine();
			players[i] = p;
		}
		System.out.println("\n-------------------------------------------------------------------");
		System.out.println("                          Take Your Guess                          ");
		System.out.println("-------------------------------------------------------------------");
		for (int i = 0; i < count; i++) {
			System.out.print(players[i].playerName + " choose your number: ");
			players[i].playerSelectedNumber = scanner.nextInt();
		}

		return players;
	}
}

//Guesser
class Guesser {
	int guessedNumber;
	Scanner scanner = new Scanner(System.in);

	public int selectingNumber() {
		System.out.println("----------------------------");
		System.out.print("Guesser select a number: ");
		guessedNumber = scanner.nextInt();
		System.out.println("----------------------------\n");
		return guessedNumber;
	}
}

//Game Host
class Host {
	int guessedNumber;
	int playerCount;
	int round = 1;
	Player[] players;
	Scanner scanner = new Scanner(System.in);

	public int setPlayersCount() {
		boolean isValid = false;
		while (!isValid) {
			System.out.print("Host enter the number of players: ");
			playerCount = scanner.nextInt();
			if (playerCount > 1) {
				isValid = true;
			} else {
				System.out.println("Need to have more than 1 player");
			}
		}
		return playerCount;
	}

	public void askingPlayer() {
		Player player = new Player();
		players = player.selectPlayerDetails(playerCount);
	}

	public void askingGuesser() {
		Guesser guesser = new Guesser();
		guessedNumber = guesser.selectingNumber();
	}

	public void checkingResult() {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("                              Result                               ");
		System.out.println("-------------------------------------------------------------------");
		for (int i = 0; i < playerCount; i++) {
			if (guessedNumber == players[i].playerSelectedNumber) {
				players[i].score += 5;
				System.out.print(players[i].playerName + " has guessed it correct. ");
				System.out.println("Score: " + players[i].score);
			} else {
				System.out.print(
						players[i].playerName + " number " + players[i].playerSelectedNumber + " is incorrect. ");
				System.out.println("Score: " + players[i].score);
			}
		}
		round++;
		if (round > 4) {
			declaringWinner();
		} else {
			nextRound();
		}
	}

	public void nextRound() {
		if (round == 4) {
			System.out.println("\nWelcome to the final round!");
			System.out.println("*****Note: Players will not be able to select the same number as opponent in this round*****");
			askingGuesser();
			nextRoundInput();
			checkingResult();
		} else if (round == 3) {
			System.out.println("\nWelcome to the semi-finals round!");
			askingGuesser();
			nextRoundInput();
			checkingResult();
		} else {
			System.out.println("\nWelcome to the quater-finals!");
			askingGuesser();
			nextRoundInput();
			checkingResult();
		}
	}

	public void nextRoundInput() {
		System.out.println("\n-------------------------------------------------------------------");
		System.out.println("                          Take Your Guess                          ");
		System.out.println("-------------------------------------------------------------------");
		if (round == 4) {
			for (int i = 0; i < playerCount; i++) {
				System.out.print(players[i].playerName + " choose your number: ");
				players[i].playerSelectedNumber = scanner.nextInt();
					if (i != 0) { // Condition to check if this is not the first element
						for (int j = (i - 1); j >= 0; j--) { // Iterating to check duplicate entries
							if (players[i].playerSelectedNumber == players[j].playerSelectedNumber) { // If duplicate found.
								System.out.println("Number already selected, choose a different number");
								i--;
							}
						}
					}
			}
		} else {
			for (int i = 0; i < playerCount; i++) {
				System.out.print(players[i].playerName + " choose your number: ");
				players[i].playerSelectedNumber = scanner.nextInt();
			}
		}

	}
//Declaring Winner
	public void declaringWinner() {
		Player winner = new Player();
		for (int i = 0; i < players.length - 1; i++) {
			if (players[i].score < players[i + 1].score) {
				winner = players[i + 1];
			} else {
				winner = players[i];
			}
		}
		System.out.println("\n-------------------------------------------------------------------");
		System.out.println("                               Winner                              ");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("The winner is " + winner.playerName + ". Congratulations you have a Highscore of "
				+ winner.score + " points.");
	}
}
