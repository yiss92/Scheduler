import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ToDo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ToDo dialog = new ToDo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ToDo() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		Today today = new Today();
		DayDao daydao = new DayDao();
		
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("\uC2DC\uAC04");
			lblNewLabel.setBounds(89, 31, 57, 15);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("New label");
			lblNewLabel_1.setBounds(158, 31, 233, 15);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("\uB0B4\uC6A9");
			lblNewLabel_2.setBounds(89, 67, 57, 15);
			contentPanel.add(lblNewLabel_2);
		}
		{
			textField = new JTextField();
			textField.setBounds(150, 64, 266, 21);
			contentPanel.add(textField);
			textField.setColumns(10);
			
			today.setTitle(textField.getText());
		}
		
		JButton btnNewButton = new JButton("\uC77C\uC815\uB9CC\uB4E4\uAE30");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				daydao.insert(today);
				
				Modified modified = new Modified();
				modified.setVisible(true);
				contentPanel.setVisible(false);
				dispose();
			}
		});
		btnNewButton.setBounds(89, 218, 99, 25);
		contentPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC77C\uC815\uC218\uC815");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Modified modified = new Modified();
				modified.setVisible(true);
				contentPanel.setVisible(false);
				dispose();
			}
		});
		btnNewButton_1.setBounds(227, 218, 99, 25);
		contentPanel.add(btnNewButton_1);
	}
}
