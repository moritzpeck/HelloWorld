package Gui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;

public class Myfirstwindow {

	protected Shell shlMyFirstWindow;
	private Text vorname;
	private Text nachname;
	private Text plz;
	private Text ort;
	private Text straﬂe;

	/**
	 * Launch the application.
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
		shlMyFirstWindow.setSize(450, 300);
		shlMyFirstWindow.setText("BB Window");
		
		Button btnMeineErsterKnopf = new Button(shlMyFirstWindow, SWT.NONE);
		btnMeineErsterKnopf.addMouseMoveListener(new MouseMoveListener() {
			public void mouseMove(MouseEvent me) {
				System.out.println("Maus auf " + me.x + "/" + me.y);
			}
		});
		btnMeineErsterKnopf.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("Du hast es geschafft einen Knopf zu dr¸cken! Shampoo!");
				System.out.println(vorname.getText() + " " + nachname.getText());
				System.out.println(plz.getText());
				System.out.println(ort.getText());
				System.out.println(straﬂe.getText());
				System.out.println();
			}
		});
		btnMeineErsterKnopf.setBounds(10, 10, 246, 73);
		btnMeineErsterKnopf.setText("Meine erster Knopf ");
		
		vorname = new Text(shlMyFirstWindow, SWT.BORDER);
		vorname.setBounds(71, 94, 185, 21);
		
		Label lblVorname = new Label(shlMyFirstWindow, SWT.NONE);
		lblVorname.setBounds(10, 94, 55, 15);
		lblVorname.setText("Vorname");
		
		Label lblNachname = new Label(shlMyFirstWindow, SWT.NONE);
		lblNachname.setBounds(10, 121, 64, 15);
		lblNachname.setText("Nachname");
		
		nachname = new Text(shlMyFirstWindow, SWT.BORDER);
		nachname.setBounds(81, 121, 153, 21);
		
		Label lblNewLabel = new Label(shlMyFirstWindow, SWT.NONE);
		lblNewLabel.setBounds(20, 154, 54, 31);
		lblNewLabel.setText("PLZ");
		
		Label lblNewLabel_3 = new Label(shlMyFirstWindow, SWT.NONE);
		lblNewLabel_3.setBounds(10, 197, 55, 15);
		lblNewLabel_3.setText("Stra\u00DFe");
		
		plz = new Text(shlMyFirstWindow, SWT.BORDER);
		plz.setBounds(75, 148, 116, 22);
		
		ort = new Text(shlMyFirstWindow, SWT.BORDER);
		ort.setBounds(71, 176, 120, 15);
		
		straﬂe = new Text(shlMyFirstWindow, SWT.BORDER);
		straﬂe.setBounds(71, 197, 120, 15);
		
		Text hausnummer1 = new Text(shlMyFirstWindow, SWT.BORDER);
		hausnummer1.setBounds(94, 218, 97, 21);
		
		Label lblNewLabel_1 = new Label(shlMyFirstWindow, SWT.NONE);
		lblNewLabel_1.setBounds(10, 176, 55, 15);
		lblNewLabel_1.setText("Ort");
		
		Label lblHausnummer = new Label(shlMyFirstWindow, SWT.NONE);
		lblHausnummer.setBounds(10, 218, 73, 15);
		lblHausnummer.setText("Hausnummer");

	}
}