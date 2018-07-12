package ui.windows;

import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import ui.vm.AsignacionesViewModel;
import ui.vm.DashboardViewModel;
import ui.vm.PerfilViewModel;

@SuppressWarnings("serial")
public class DashboardWindow  extends SimpleWindow<DashboardViewModel> {

	public DashboardWindow(WindowOwner parent, String legajoEstudiante) {
		super(parent, new DashboardViewModel(legajoEstudiante));
	}

	@Override
	protected void addActions(Panel actionsPanel) {
		new Button(actionsPanel)
			.setCaption("Asignaciones")
			.onClick(this::goToAsignaciones);
		new Button(actionsPanel)
			.setCaption("Editar Perfil")
			.onClick(this::goToEditarPerfil);
	}

	@Override
	protected void createFormPanel(Panel panel) {
		this.setTitle("Dashoboard");
	}
	
	protected void goToAsignaciones() {
		System.out.println("Quiero ir a asignaciones");
		SimpleWindow<AsignacionesViewModel> asignaciones = new AsignacionesWindow(this, this.getModelObject().getLegajo());
		asignaciones.open();
	}
	
	protected void goToEditarPerfil() {
		System.out.println("Quiero ir a editar perfil");
		SimpleWindow<PerfilViewModel> perfil = new PerfilWindow(this, this.getModelObject().getLegajo());
		perfil.open();
	}
}
