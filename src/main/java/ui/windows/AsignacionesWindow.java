package ui.windows;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import model.Asignacion;
import ui.vm.AsignacionesViewModel;


@SuppressWarnings("serial")
public class AsignacionesWindow extends SimpleWindow<AsignacionesViewModel>{

	public AsignacionesWindow(WindowOwner parent, String legajoEstudiante) {
		super(parent, new AsignacionesViewModel(legajoEstudiante));
	}

	@Override
	protected void addActions(Panel actionsPanel) {}

	@Override
	protected void createFormPanel(Panel formPanel) {
		this.setTitle("Asignaciones");
		
		Table tableAsignaciones = new Table<Asignacion>(formPanel, Asignacion.class);
		Column<Asignacion> columnaTitulo = new Column<Asignacion>(tableAsignaciones);
		columnaTitulo.setTitle("Titulo");
		
		Column<Asignacion> columnaNota = new Column<Asignacion>(tableAsignaciones);
		columnaNota.setTitle("Nota");
		
		Column<Asignacion> columnaAprobada = new Column<Asignacion>(tableAsignaciones);
		columnaAprobada.setTitle("Aprobada");
		
		
		columnaTitulo.bindContentsToProperty("titulo");
		columnaNota.bindContentsToProperty("nota");
		columnaAprobada.bindContentsToProperty("aprobada");
		tableAsignaciones.bindItemsToProperty("asignacionesDelEstudiante");

		tableAsignaciones.setHeight(300);
		tableAsignaciones.setWidth(600);
	}
}
