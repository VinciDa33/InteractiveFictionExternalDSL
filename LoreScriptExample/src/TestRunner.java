import org.mdsd.lorescript.generated.MyLoreScript;

public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLoreScript mls = new MyLoreScript(new GameTriggerHandler(), new GameGetHandler());
		mls.run();
	}

}
