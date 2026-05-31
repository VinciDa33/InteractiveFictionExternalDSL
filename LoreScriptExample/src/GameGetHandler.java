import org.mdsd.lorescript.generated.LoreScriptGetHandler;


public class GameGetHandler implements LoreScriptGetHandler {
	
	@Override
	public String get(String request) {	
		if (request.equals("potentialPlayerName"))
			return GameManager.getInstance().getNameProposed();
		
		if (request.equals("potentialPlayerAbility"))
			return GameManager.getInstance().getAbilityProposed();
		
		if (request.equals("playerName"))
			return GameManager.getInstance().getName();
		
		if (request.equals("playerAbility"))
			return GameManager.getInstance().getAbilityName();
		
		if (request.equals("playerAbilityDescription"))
			return GameManager.getInstance().getAbilityDescription();
		
		if (request.equals("winnerText"))
			return GameManager.getInstance().getWinnerText();
		
		return null;
	}


}
