import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
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
		{
			JButton btnNewButton = new JButton("\uC218\uC815");
			btnNewButton.setBounds(79, 10, 99, 25);
			getContentPane().add(btnNewButton);
		}
		{
			JButton btnNewButton_1 = new JButton("\uC0AD\uC81C");
			btnNewButton_1.setBounds(209, 10, 99, 25);
			getContentPane().add(btnNewButton_1);
		}
		{
			textField = new JTextField();
			textField.setText("\uB0B4\uC6A9");
			textField.setBounds(79, 61, 317, 21);
			getContentPane().add(textField);
			textField.setColumns(10);
		}
		{
			JLabel lblNewLabel = new JLabel("\uC138\uBD80\uC815\uBCF4");
			lblNewLabel.setBounds(64, 121, 57, 15);
			getContentPane().add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("\uC7A5\uC18C");
			lblNewLabel_1.setBounds(74, 146, 57, 15);
			getContentPane().add(lblNewLabel_1);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(133, 143, 263, 21);
			getContentPane().add(textField_1);
			textField_1.setColumns(10);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("\uC124\uBA85");
			lblNewLabel_2.setBounds(64, 183, 57, 15);
			getContentPane().add(lblNewLabel_2);
		}
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(79, 208, 317, 43);
		getContentPane().add(textArea);
	}
}
