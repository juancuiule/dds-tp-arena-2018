package ui.windows;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.PasswordField;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import model.Auth;
import model.Estudiante;
import ui.vm.InicioDeSesionViewModel;

public class InicioDeSesionWindow extends SimpleWindow<InicioDeSesionViewModel> {

	public InicioDeSesionWindow(WindowOwner parent) {
		super(parent, new InicioDeSesionViewModel());
	}

	@Override
	protected void addActions(Panel actionsPanel) {
		new Button(actionsPanel)
			.setCaption("Ingresar")
			.onClick(this::ingresar);
	}

	@Override
	protected void createFormPanel(Panel formPanel) {
		this.setTitle("Lector de Notas - Inicio de Sesión");
		
		formPanel.setLayout(new VerticalLayout());
		
		new Label(formPanel)
			.setText("Ingrese su legajo");
		
		new TextBox(formPanel)
			.setWidth(300)
			.bindValueToProperty("loginLegajo");
		
		new Label(formPanel)
			.setText("Ingrese su contraseña");
		
		new PasswordField(formPanel)
			.setWidth(300)
			.bindValueToProperty("loginPassword");
	}
	
	protected void ingresar() {
		this.getModelObject().login();
	}
}
