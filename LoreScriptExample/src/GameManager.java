import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class GameManager {
	Random random = new Random();
	List<String> moves = new ArrayList<>();
	
	int playerHp = 100;
	int enemyHp = 100;
	
	String[] names = {"John", "Jimmy", "Frank", "Louise", "Saitama", "Flourance", "Jake", "Sarah", "Goku"};
	String[] abilityNames = {"do spinning death wheel kicks!", "do the Kamehameha", "do crazy moves on the dance floor"};
	String[] abilityDesc = {"You kick Volf with your spining death wheel kick, dislocating his jaw and sending him out of the arena!",
			"You charge up for a moment, then unleash true super saiyan power, pulverizing Volf!",
			"You start dancing. Volf hits you in the face."};
	String[] specialResult = {"Volf is laying silently in a pile of seats just outside the arena. You are the clear winner.", 
			"Your enemy has disappeared, and as such you are the winner", "Your nose is broken and you cannot get up. You lose!"};

	int proposedName;
	int proposedAbility;
	
	int lockedName;
	int lockedAbility;
	
	private static GameManager singleton;
	private GameManager() {}
	
	public static GameManager getInstance() {
		if (singleton == null)
			singleton = new GameManager();
		return singleton;
		
	}
	
	public String getName() {
		return names[lockedName];
	}
	
	public String getAbilityName() {
		return abilityNames[lockedAbility];
	}
	
	public String getAbilityDescription() {
		return abilityDesc[lockedAbility];
	}
	
	public String getNameProposed() {
		proposedName = random.nextInt(names.length);
		return names[proposedName];
	}
	
	public String getAbilityProposed() {
		proposedAbility = random.nextInt(abilityNames.length);
		return abilityNames[proposedAbility];
	}
	
	public void lockName() {
		lockedName = proposedName;
	}
	
	public void lockAbility() {
		lockedAbility = proposedAbility;
	}
	
	public void unlock() {
		lockedName = -1;
		lockedAbility = -1;
	}
	
	public void logMove(String move) {
		moves.add(move);

	}
	
	public String getWinnerText() {
		if (moves.get(1).equals("Special")) {
			return specialResult[lockedAbility];
		}
		if (moves.get(1).equals("Sweep")) {
			if (enemyHp < 80) {
				return "Volf stays down after the sweep. You win the battle";
			}
			else {
				return "You thought you won, but in the nick of time, Volf got back up. Your opponent is still standing, so you lose!";
			}
		}
		return "Whatever you did, Volf is still standing, which means you lose!";
		
	}
}
