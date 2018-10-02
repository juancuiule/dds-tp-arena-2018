package ui.windows;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import model.Assignment;
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
		
		Table tableAsignaciones = new Table<Assignment>(formPanel, Assignment.class);
		Column<Assignment> columnaTitulo = new Column<Assignment>(tableAsignaciones);
		columnaTitulo.setTitle("Titulo");
		
		Column<Assignment> columnaNota = new Column<Assignment>(tableAsignaciones);
		columnaNota.setTitle("Nota");
		
		Column<Assignment> columnaAprobada = new Column<Assignment>(tableAsignaciones);
		columnaAprobada.setTitle("Aprobada");
		
		
		columnaTitulo.bindContentsToProperty("title");
		columnaNota.bindContentsToProperty("grade");
		columnaAprobada.bindContentsToProperty("approved");
		tableAsignaciones.bindItemsToProperty("asignacionesDelEstudiante");

		tableAsignaciones.setHeight(300);
		tableAsignaciones.setWidth(600);
	}
}
