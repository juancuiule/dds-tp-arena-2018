package ui.windows;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import ui.vm.AsignacionesViewModel;


@SuppressWarnings("serial")
public class AsignacionesWindow extends SimpleWindow<AsignacionesViewModel>{

	public AsignacionesWindow(WindowOwner parent) {
		super(parent, new AsignacionesViewModel());
	}

	@Override
	protected void addActions(Panel actionsPanel) {
		
	}

	@Override
	protected void createFormPanel(Panel panel) {}
}
