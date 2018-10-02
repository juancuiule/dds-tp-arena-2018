package ui.windows;

import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.PasswordField;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import ui.vm.ProfileViewModel;

@SuppressWarnings("serial")
public class ProfileWindow  extends SimpleWindow<ProfileViewModel> {

	public ProfileWindow(WindowOwner parent, String legajoEstudiante) {
		super(parent, new ProfileViewModel(legajoEstudiante));
	}

	@Override
	protected void addActions(Panel actionsPanel) {
		new Button(actionsPanel)
			.setCaption("Guardar")
			.onClick(this::save);
	}

	@Override
	protected void createFormPanel(Panel panel) {
		this.setTitle("Editar Perfil");
		
		Panel form = new Panel(panel);
		form.setLayout(new ColumnLayout(2));
		
		new Label(form).setText("Nombre");
		new TextBox(form)
			.setWidth(300)
			.bindValueToProperty("firstNameInput");
		
		new Label(form).setText("Apellido");
		new TextBox(form)
			.setWidth(300)
			.bindValueToProperty("lastNameInput");
		
		new Label(form).setText("Legajo");
		new TextBox(form)
			.setWidth(300)
			.bindValueToProperty("codeInput");
		
		new Label(form).setText("Usuario Github");
		new TextBox(form)
			.setWidth(300)
			.bindValueToProperty("githubUserInput");
		
		new Label(form).setText("Contraseña");
		new PasswordField(form)
			.setWidth(300)
			.bindValueToProperty("passwordInput");
		
		new Label(form).setText("Confirmar Contraseña");
		new PasswordField(form)
			.setWidth(300)
			.bindValueToProperty("passwordConfirmationInput");
	}
	
	protected void save() {
		this.getModelObject().save();
	}
}
