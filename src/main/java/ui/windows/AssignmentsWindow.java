package ui.windows;

import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import model.Assignment;
import ui.vm.AssignmentsViewModel;


@SuppressWarnings("serial")
public class AssignmentsWindow extends SimpleWindow<AssignmentsViewModel>{

	public AssignmentsWindow(WindowOwner parent, String legajoEstudiante) {
		super(parent, new AssignmentsViewModel(legajoEstudiante));
	}

	@Override
	protected void addActions(Panel actionsPanel) {}

	@Override
	protected void createFormPanel(Panel formPanel) {
		this.setTitle("Asignaciones");
		
		Table<Assignment> assignmentsTable = new Table<Assignment>(formPanel, Assignment.class);
		
		Column<Assignment> titleColumn = new Column<Assignment>(assignmentsTable);
		titleColumn.setTitle("Título");
		
		Column<Assignment> descriptionColumn = new Column<Assignment>(assignmentsTable);
		descriptionColumn.setTitle("Descripción");
		
		Column<Assignment> gradeColumn = new Column<Assignment>(assignmentsTable);
		gradeColumn.setTitle("Nota");
		
		Column<Assignment> approvedColumn = new Column<Assignment>(assignmentsTable);
		approvedColumn.setTitle("Aprobada");
		
		
		titleColumn.bindContentsToProperty("title");
		descriptionColumn.bindContentsToProperty("description");
		gradeColumn.bindContentsToProperty("grade");
		approvedColumn.bindContentsToProperty("approved");
		assignmentsTable.bindItemsToProperty("asignacionesDelEstudiante");

		assignmentsTable.setHeight(300);
		assignmentsTable.setWidth(600);
	}
}
