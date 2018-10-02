import org.uqbar.arena.Application;
import org.uqbar.arena.windows.Window;

import ui.windows.InicioDeSesionWindow;
import model.Fixture;


public class LectorDeNotasApplication extends Application{

	public static void main(String[] args) {
		Fixture.initialize();
		new LectorDeNotasApplication().start();
	}
	
	@Override
	protected Window<?> createMainWindow() {
		return new InicioDeSesionWindow(this);
	}
}
