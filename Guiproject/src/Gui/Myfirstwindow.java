package Gui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;

import java.io.File;
import java.io.FileWriter;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Text;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import data.Person;

import org.eclipse.swt.widgets.Label;

public class Myfirstwindow {

	protected Shell shlMyFirstWindow;
	private Text vornameTF;
	private Text nachnameTF;
	private Text plzTF;
	private Text ortTF;
	private Text straﬂeTF;
	private Label VornameOut;
	private Label NachnameOut;
	private Label PLZOut;
	private Label OrtOut;
	private Label StraﬂeOut;
	private Label HausnummerOut;
	private Text hausnummerTF;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Myfirstwindow window = new Myfirstwindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlMyFirstWindow.open();
		shlMyFirstWindow.layout();
		while (!shlMyFirstWindow.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlMyFirstWindow = new Shell();
		shlMyFirstWindow.setSize(570, 382);
		shlMyFirstWindow.setText("BB Window");

		Button btnMeineErsterKnopf = new Button(shlMyFirstWindow, SWT.NONE);

		btnMeineErsterKnopf.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("Du hast es geschafft einen Knopf zu dr¸cken! Shampoo!");
				System.out.println(vornameTF.getText() + " " + nachnameTF.getText());
				System.out.println(plzTF.getText());
				System.out.println(ortTF.getText());
				System.out.println(straﬂeTF.getText());
				System.out.println(hausnummerTF.getText());

				getVornameOut().setText(vornameTF.getText());
				getNachnameOut().setText(nachnameTF.getText());
				getPLZOut().setText(plzTF.getText());
				getOrtOut().setText(ortTF.getText());
				getStraﬂeOut().setText(straﬂeTF.getText());
				getHausnummerOut().setText(hausnummerTF.getText());
			}
		});

		hausnummerTF = new Text(shlMyFirstWindow, SWT.BORDER);
		hausnummerTF.setBounds(94, 218, 97, 21);

		btnMeineErsterKnopf.setBounds(10, 15, 246, 73);
		btnMeineErsterKnopf.setText("Meine erster Knopf ");

		vornameTF = new Text(shlMyFirstWindow, SWT.BORDER);
		vornameTF.setBounds(71, 94, 185, 21);

		Label lblVorname = new Label(shlMyFirstWindow, SWT.NONE);
		lblVorname.setBounds(10, 94, 55, 15);
		lblVorname.setText("Vorname");

		Label lblNachname = new Label(shlMyFirstWindow, SWT.NONE);
		lblNachname.setBounds(10, 121, 64, 15);
		lblNachname.setText("Nachname");

		nachnameTF = new Text(shlMyFirstWindow, SWT.BORDER);
		nachnameTF.setBounds(81, 121, 153, 21);

		Label lblNewLabel = new Label(shlMyFirstWindow, SWT.NONE);
		lblNewLabel.setBounds(10, 151, 54, 16);
		lblNewLabel.setText("PLZ");

		Label lblNewLabel_3 = new Label(shlMyFirstWindow, SWT.NONE);
		lblNewLabel_3.setBounds(10, 197, 55, 15);
		lblNewLabel_3.setText("Stra\u00DFe");

		plzTF = new Text(shlMyFirstWindow, SWT.BORDER);
		plzTF.setBounds(75, 148, 116, 22);

		ortTF = new Text(shlMyFirstWindow, SWT.BORDER);
		ortTF.setBounds(71, 176, 120, 15);

		straﬂeTF = new Text(shlMyFirstWindow, SWT.BORDER);
		straﬂeTF.setBounds(71, 197, 120, 15);

		Label lblNewLabel_1 = new Label(shlMyFirstWindow, SWT.NONE);
		lblNewLabel_1.setBounds(10, 176, 55, 15);
		lblNewLabel_1.setText("Ort");

		Label lblHausnummer = new Label(shlMyFirstWindow, SWT.NONE);
		lblHausnummer.setBounds(10, 218, 73, 15);
		lblHausnummer.setText("Hausnummer");

		VornameOut = new Label(shlMyFirstWindow, SWT.NONE);
		VornameOut.setBounds(309, 94, 55, 21);

		NachnameOut = new Label(shlMyFirstWindow, SWT.NONE);
		NachnameOut.setBounds(320, 127, 55, 15);

		PLZOut = new Label(shlMyFirstWindow, SWT.NONE);
		PLZOut.setBounds(331, 154, 55, 15);

		OrtOut = new Label(shlMyFirstWindow, SWT.NONE);
		OrtOut.setBounds(309, 176, 55, 15);

		StraﬂeOut = new Label(shlMyFirstWindow, SWT.NONE);
		StraﬂeOut.setBounds(294, 197, 55, 15);
		StraﬂeOut.setText("");

		HausnummerOut = new Label(shlMyFirstWindow, SWT.NONE);
		HausnummerOut.setBounds(309, 224, 55, 15);
		HausnummerOut.setText("");

		Button btnSaveClean = new Button(shlMyFirstWindow, SWT.NONE);
		btnSaveClean.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Person p;// Variablen-Definition
				p = new Person();// Variablen-Instanz
				//
				p.setVorname(getVornameTF().getText());
				p.setNachname(getNachnameTF().getText());
				//
				System.out.println(p);
				//
				Person.getPersonenListe().add(p);
				System.out.println("_ _ _ _ _");
				System.out.println("Liste");
				System.out.println(Person.getPersonenListe());
				//
				getVornameTF().setText("");
				getNachnameTF().setText("");
				getPlzTF().setText("");
				getHausnummerTF().setText("");
				getStraﬂeTF().setText("");
				getOrtTF().setText("");
			}
		});
		btnSaveClean.setSelection(true);
		btnSaveClean.setBounds(348, 29, 120, 80);
		btnSaveClean.setText("save and clean");

		Button btnNewButton = new Button(shlMyFirstWindow, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Gson gson = new GsonBuilder().setPrettyPrinting().create();
				String jsonString = gson.toJson(Person.getPersonenListe());
				System.out.println(jsonString);
				//
				// im explorer %TEMP%
				try {
					FileWriter fw = new FileWriter(File.createTempFile("wpfjson", "json"));
					gson.toJson(Person.getPersonenListe(), fw);
					fw.flush();
					fw.close();
				} catch (Exception ex) {
				}
			}

		});
		btnNewButton.setBounds(319, 176, 167, 80);
		btnNewButton.setText("2GSON");

	}

	public Label getVornameOut() {
		return VornameOut;
	}

	public Label getNachnameOut() {
		return NachnameOut;
	}

	public Label getPLZOut() {
		return PLZOut;
	}

	public Label getOrtOut() {
		return OrtOut;
	}

	public Label getStraﬂeOut() {
		return StraﬂeOut;
	}

	public Label getHausnummerOut() {
		return HausnummerOut;
	}

	public Text getHausnummerTF() {
		return hausnummerTF;
	}

	public Text getVornameTF() {
		return vornameTF;
	}

	public Text getNachnameTF() {
		return nachnameTF;
	}

	public Text getPlzTF() {
		return plzTF;
	}

	public Text getOrtTF() {
		return ortTF;
	}

	public Text getStraﬂeTF() {
		return straﬂeTF;
	}
}