package ui.windows;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.PasswordField;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import model.Estudiante;
import ui.vm.DashboardViewModel;
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
			.bindValueToProperty("legajo");
		
		new Label(formPanel)
			.setText("Ingrese su contraseña");
		
		new PasswordField(formPanel)
			.setWidth(300)
			.bindValueToProperty("password");
	}
	
	protected void ingresar() {
		Boolean loginCorrecto = this.getModelObject().login();
		if(loginCorrecto) {
			System.out.println("Login correcto! Bienvenido al sistema de lectura de notas");
			SimpleWindow<DashboardViewModel> dashboard = new DashboardWindow(this, this.getModelObject().getLegajo());
			dashboard.open();
		} else {
			System.out.println("Login incorrecto! Combinación legajo/contraseña erronea o estudiante inexistente");
		}
	}
}
