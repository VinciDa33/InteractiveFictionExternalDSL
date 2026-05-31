import org.mdsd.lorescript.generated.LoreScriptTriggerHandler;

public class GameTriggerHandler implements LoreScriptTriggerHandler{

	@Override
	public void lockName() {
		GameManager.getInstance().lockName();
	}

	@Override
	public void lockAbility() {
		GameManager.getInstance().lockAbility();
		
	}

	@Override
	public void clearPlayer() {
		GameManager.getInstance().unlock();
		
	}

	@Override
	public void logMove(String move) {
		GameManager.getInstance().logMove(move);
		
	}

	@Override
	public void enemyDamage(int dmg) {
		GameManager.getInstance().enemyHp -= dmg;
		
	}

	@Override
	public void playerDamage(int dmg) {
		GameManager.getInstance().playerHp -= dmg;
		
	}
	
}
