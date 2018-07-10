package ui.windows;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import model.Auth;
import model.Estudiante;
import ui.vm.DashboardViewModel;

public class DashboardWindow  extends SimpleWindow<DashboardViewModel> {

	public DashboardWindow(WindowOwner parent, String legajoEstudiante) {
		super(parent, new DashboardViewModel(legajoEstudiante));
	}

	@Override
	protected void addActions(Panel actionsPanel) {
		new Button(actionsPanel)
			.setCaption("Asignaturas")
			.onClick(this::goToAsignaturas);
		new Button(actionsPanel)
			.setCaption("Editar Perfil")
			.onClick(this::goToEditarPerfil);
	}

	@Override
	protected void createFormPanel(Panel panel) {}
	
	protected void goToAsignaturas() {
		System.out.println("Quiero ir a asignaciones");
	}
	
	protected void goToEditarPerfil() {
		System.out.println("Quiero ir a editar perfil");
	}
}
