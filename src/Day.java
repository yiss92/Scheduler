import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Day {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Day window = new Day();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Day() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 795, 806);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Today ������ �߰�
		Today today = new Today();
		
		textField = new JTextField();
		today.setTitle(textField.getText());
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//Modified modified = new Modified();
				//new Modified();
				
				//modified.pack();
				//modified.setVisible(true);
				ToDo todo = new ToDo();
				todo.setVisible(true);
			}
		});
		textField.setBounds(79, 37, 696, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\uC694\uC77C");
		lblNewLabel.setBounds(103, 12, 292, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC624\uC804 12\uC2DC");
		lblNewLabel_1.setBounds(12, 68, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(79, 65, 696, 21);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		//add
		textField_1.setText("");
		
		JLabel label = new JLabel("\uC624\uC804 01\uC2DC");
		label.setBounds(12, 96, 57, 15);
		frame.getContentPane().add(label);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(79, 93, 696, 21);
		frame.getContentPane().add(textField_2);
		//add
		textField_2.setText("");
		
		JLabel label_1 = new JLabel("\uC624\uC804 02\uC2DC");
		label_1.setBounds(12, 124, 57, 15);
		frame.getContentPane().add(label_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(79, 121, 696, 21);
		frame.getContentPane().add(textField_3);
		//
		textField_3.setText("");
		
		JLabel label_2 = new JLabel("\uC624\uC804 03\uC2DC");
		label_2.setBounds(12, 152, 57, 15);
		frame.getContentPane().add(label_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(79, 149, 696, 21);
		frame.getContentPane().add(textField_4);
		//
		textField_4.setText("");
		
		JLabel label_3 = new JLabel("\uC624\uC804 04\uC2DC");
		label_3.setBounds(12, 180, 57, 15);
		frame.getContentPane().add(label_3);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(79, 177, 696, 21);
		frame.getContentPane().add(textField_5);
		//add
		textField_5.setText("");
		
		JLabel label_4 = new JLabel("\uC624\uC804 05\uC2DC");
		label_4.setBounds(12, 208, 57, 15);
		frame.getContentPane().add(label_4);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(79, 205, 696, 21);
		frame.getContentPane().add(textField_6);
		//add
		textField_6.setText("");
		
		JLabel label_5 = new JLabel("\uC624\uC804 06\uC2DC");
		label_5.setBounds(12, 236, 57, 15);
		frame.getContentPane().add(label_5);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(79, 233, 696, 21);
		frame.getContentPane().add(textField_7);
		//add
		textField_7.setText("");
		
		JLabel label_6 = new JLabel("\uC624\uC804 07\uC2DC");
		label_6.setBounds(12, 264, 57, 15);
		frame.getContentPane().add(label_6);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(79, 261, 696, 21);
		frame.getContentPane().add(textField_8);
		//add
		textField_8.setText("");
		
		JLabel label_7 = new JLabel("\uC624\uC804 08\uC2DC");
		label_7.setBounds(12, 292, 57, 15);
		frame.getContentPane().add(label_7);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(79, 289, 696, 21);
		frame.getContentPane().add(textField_9);
		//add
		textField_9.setText("");
		
		JLabel label_8 = new JLabel("\uC624\uC804 09\uC2DC");
		label_8.setBounds(12, 320, 57, 15);
		frame.getContentPane().add(label_8);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(79, 317, 696, 21);
		frame.getContentPane().add(textField_10);
		//add
		textField_10.setText("");
		
		JLabel label_9 = new JLabel("\uC624\uC804 10\uC2DC");
		label_9.setBounds(12, 348, 57, 15);
		frame.getContentPane().add(label_9);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(79, 345, 696, 21);
		frame.getContentPane().add(textField_11);
		//add
		textField_11.setText("");
		
		JLabel label_10 = new JLabel("\uC624\uC804 11\uC2DC");
		label_10.setBounds(12, 376, 57, 15);
		frame.getContentPane().add(label_10);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(79, 373, 696, 21);
		frame.getContentPane().add(textField_12);
		//add
		textField_12.setText("");
		
		JLabel label_11 = new JLabel("\uC624\uD6C4 12\uC2DC");
		label_11.setBounds(12, 404, 57, 15);
		frame.getContentPane().add(label_11);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(79, 401, 696, 21);
		frame.getContentPane().add(textField_13);
		//add
		textField_13.setText("");
		
		JLabel label_12 = new JLabel("\uC624\uD6C4 01\uC2DC");
		label_12.setBounds(12, 432, 57, 15);
		frame.getContentPane().add(label_12);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(79, 429, 696, 21);
		frame.getContentPane().add(textField_14);
		//add
		textField_14.setText("");
		
		JLabel label_13 = new JLabel("\uC624\uD6C4 02\uC2DC");
		label_13.setBounds(12, 460, 57, 15);
		frame.getContentPane().add(label_13);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(79, 457, 696, 21);
		frame.getContentPane().add(textField_15);
		//add
		textField_15.setText("");
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(79, 485, 696, 21);
		frame.getContentPane().add(textField_16);
		//add
		textField_16.setText("");
		
		JLabel label_14 = new JLabel("\uC624\uD6C4 03\uC2DC");
		label_14.setBounds(12, 488, 57, 15);
		frame.getContentPane().add(label_14);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(79, 516, 696, 21);
		frame.getContentPane().add(textField_17);
		//add
		textField_17.setText("");
		
		JLabel label_15 = new JLabel("\uC624\uD6C4 04\uC2DC");
		label_15.setBounds(12, 519, 57, 15);
		frame.getContentPane().add(label_15);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(79, 547, 696, 21);
		frame.getContentPane().add(textField_18);
		//add
		textField_18.setText("");
		
		JLabel label_16 = new JLabel("\uC624\uD6C4 05\uC2DC");
		label_16.setBounds(12, 550, 57, 15);
		frame.getContentPane().add(label_16);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(79, 578, 696, 21);
		frame.getContentPane().add(textField_19);
		//add
		textField_19.setText("");
		
		JLabel label_17 = new JLabel("\uC624\uD6C4 06\uC2DC");
		label_17.setBounds(12, 581, 57, 15);
		frame.getContentPane().add(label_17);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(79, 609, 696, 21);
		frame.getContentPane().add(textField_20);
		//add
		textField_20.setText("");
		
		JLabel label_18 = new JLabel("\uC624\uD6C4 07\uC2DC");
		label_18.setBounds(12, 612, 57, 15);
		frame.getContentPane().add(label_18);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(79, 640, 696, 21);
		frame.getContentPane().add(textField_21);
		//add
		textField_21.setText("");
		
		JLabel label_19 = new JLabel("\uC624\uD6C4 08\uC2DC");
		label_19.setBounds(12, 643, 57, 15);
		frame.getContentPane().add(label_19);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(79, 671, 696, 21);
		frame.getContentPane().add(textField_22);
		//add
		textField_22.setText("");
		
		JLabel label_20 = new JLabel("\uC624\uD6C4 09\uC2DC");
		label_20.setBounds(12, 674, 57, 15);
		frame.getContentPane().add(label_20);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(79, 702, 696, 21);
		frame.getContentPane().add(textField_23);
		//add
		textField_23.setText("");
		
		JLabel label_21 = new JLabel("\uC624\uD6C4 10\uC2DC");
		label_21.setBounds(12, 705, 57, 15);
		frame.getContentPane().add(label_21);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(79, 733, 696, 21);
		frame.getContentPane().add(textField_24);
		//add
		textField_24.setText("");
		
		JLabel label_22 = new JLabel("\uC624\uD6C4 11\uC2DC");
		label_22.setBounds(12, 736, 57, 15);
		frame.getContentPane().add(label_22);
	}
}
