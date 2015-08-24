import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Result extends JDialog {
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Result dialog = new Result();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Result() {
		setBounds(100, 100, 450, 370);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("title");
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 15));
		lblNewLabel.setBounds(40, 10, 57, 15);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC6D4 \uC77C (\uC218\uC694\uC77C)");
		lblNewLabel_1.setBounds(40, 49, 116, 15);
		getContentPane().add(lblNewLabel_1);
		
		JLabel label = new JLabel("\uC7A5\uC18C");
		label.setBounds(40, 104, 57, 15);
		getContentPane().add(label);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(51, 158, 364, 105);
		getContentPane().add(textArea);
		
		JLabel label_1 = new JLabel("\uC124\uBA85");
		label_1.setBounds(50, 129, 57, 15);
		getContentPane().add(label_1);
		
		JButton btnNewButton = new JButton("\uC0AD\uC81C");
		btnNewButton.setBounds(40, 297, 99, 25);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC218\uC815");
		btnNewButton_1.setBounds(316, 297, 99, 25);
		getContentPane().add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(73, 101, 342, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
	}
}
