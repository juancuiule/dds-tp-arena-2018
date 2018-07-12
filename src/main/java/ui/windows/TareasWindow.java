package ui.windows;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import model.Estudiante;
import model.Tarea;
import ui.vm.TareasViewModel;


@SuppressWarnings("serial")
public class TareasWindow extends SimpleWindow<TareasViewModel>{

	public TareasWindow(WindowOwner parent, Estudiante estudiante) {
		super(parent, new TareasViewModel(estudiante));
	}


	protected void createFormPanel(Panel formPanel) {
		this.setTitle("Asignaciones");
		
		Table tableAsignaciones = new Table<>(formPanel, Tarea.class);
		Column<Tarea> columnaTitulo = new Column<Tarea>(tableAsignaciones);
		columnaTitulo.setTitle("Titulo");
		
		Column<Tarea> columnaNota = new Column<Tarea>(tableAsignaciones);
		columnaNota.setTitle("Nota");
		
		Column<Tarea> columnaAprobada = new Column<Tarea>(tableAsignaciones);
		columnaAprobada.setTitle("Aprobada");
		
		
		columnaTitulo.bindContentsToProperty("titulo");
//		columnaNota.bindContentsToProperty("nota");
//		columnaAprobada.bindContentsToProperty("aprobada");
//		tableAsignaciones.bindItemsToProperty("asignaciones");
//		
		tableAsignaciones.setHeight(300);
		tableAsignaciones.setWidth(600);
	}


	@Override
	protected void addActions(Panel actionsPanel) {}
}
