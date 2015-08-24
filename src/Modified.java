import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Modified extends JDialog {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Modified dialog = new Modified();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Modified() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JButton button = new JButton("\uC218\uC815");
		button.setBounds(77, 10, 99, 25);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("\uC0AD\uC81C");
		button_1.setBounds(207, 10, 99, 25);
		getContentPane().add(button_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(77, 61, 317, 21);
		getContentPane().add(textField);
		
		JLabel label = new JLabel("\uC138\uBD80\uC815\uBCF4");
		label.setBounds(62, 121, 57, 15);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\uC7A5\uC18C");
		label_1.setBounds(72, 146, 57, 15);
		getContentPane().add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(131, 143, 263, 21);
		getContentPane().add(textField_1);
		
		JLabel label_2 = new JLabel("\uC124\uBA85");
		label_2.setBounds(62, 183, 57, 15);
		getContentPane().add(label_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(77, 208, 317, 43);
		getContentPane().add(textArea);
	}
}
