package ui.windows;

import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.PasswordField;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import ui.vm.PerfilViewModel;

@SuppressWarnings("serial")
public class PerfilWindow  extends SimpleWindow<PerfilViewModel> {

	public PerfilWindow(WindowOwner parent, String legajoEstudiante) {
		super(parent, new PerfilViewModel(legajoEstudiante));
	}

	@Override
	protected void addActions(Panel actionsPanel) {
		new Button(actionsPanel)
			.setCaption("Guardar")
			.onClick(this::guardar);
	}

	@Override
	protected void createFormPanel(Panel panel) {
		this.setTitle("Editar Perfil");
		
		Panel form = new Panel(panel);
		form.setLayout(new ColumnLayout(2));
		
		new Label(form).setText("Nombre");
		new TextBox(form)
			.setWidth(300)
			.bindValueToProperty("nombreInput");
		
		new Label(form).setText("Legajo");
		new TextBox(form)
			.setWidth(300)
			.bindValueToProperty("legajoInput");
		
		new Label(form).setText("Usuario Github");
		new TextBox(form)
			.setWidth(300)
			.bindValueToProperty("usuarioGithubInput");
		
		new Label(form).setText("Contraseña");
		new PasswordField(form)
			.setWidth(300)
			.bindValueToProperty("passwordInput");
		new Label(form).setText("Confirmar Contraseña");
		new PasswordField(form)
			.setWidth(300)
			.bindValueToProperty("passwordConfirmationInput");
	}
	
	protected void guardar() {
		this.getModelObject().guardar();
	}
}
