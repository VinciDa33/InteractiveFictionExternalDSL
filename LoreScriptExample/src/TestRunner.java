import org.mdsd.lorescript.generated.MyLoreScript;

public class TestRunner {

	public static void main(String[] args) {
		MyLoreScript mls = new MyLoreScript(new GameTriggerHandler(), new GameGetHandler());
		mls.run();
	}

}
