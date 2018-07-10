package ui.windows;

import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import model.Estudiante;
import ui.vm.InicioDeSesionViewModel;

public class InicioDeSesionWindow extends SimpleWindow<InicioDeSesionViewModel> {

	public InicioDeSesionWindow(WindowOwner parent) {
		super(parent, new InicioDeSesionViewModel());
	}

	@Override
	protected void addActions(Panel panelActions) {
		
	}

	protected void createFormPanel(Panel formPanel) {
		this.setTitle("Lector de Notas");
	}
}
