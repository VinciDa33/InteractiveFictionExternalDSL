import java.util.Random;

import org.mdsd.lorescript.generated.LoreScriptGetHandler;

public class GameGetHandler implements LoreScriptGetHandler {

	String[] nameArr = {"John", "Jimmy", "Frank", "Louise", "Saitama", "Flourance", "Jake"};
	
	@Override
	public String get(String request) {
		if (request.equals("player_name")) {
			Random rand = new Random();
			int index = rand.nextInt(nameArr.length);
			return nameArr[index];
		}
		return "";
	}

}
