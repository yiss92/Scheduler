import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.List;

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
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;

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

	//yiss92
	public void modified() {
		Described modified = new Described();
		
		modified.setBounds(100, 100, 450, 300);
		modified.getContentPane().setLayout(null);
		{
			JButton btnNewButton = new JButton("\uC800\uC7A5");
			btnNewButton.setBounds(79, 10, 99, 25);
			modified.getContentPane().add(btnNewButton);
		}
		{
			JButton btnNewButton_1 = new JButton("\uC0AD\uC81C");
			btnNewButton_1.setBounds(209, 10, 99, 25);
			modified.getContentPane().add(btnNewButton_1);
		}
		{
			textField = new JTextField();
			textField.setBounds(79, 61, 317, 21);
			modified.getContentPane().add(textField);
			textField.setColumns(10);
		}
		{
			JLabel lblNewLabel = new JLabel("\uC138\uBD80\uC815\uBCF4");
			lblNewLabel.setBounds(64, 121, 57, 15);
			modified.getContentPane().add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("\uC7A5\uC18C");
			lblNewLabel_1.setBounds(74, 146, 57, 15);
			modified.getContentPane().add(lblNewLabel_1);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(133, 143, 263, 21);
			modified.getContentPane().add(textField_1);
			textField_1.setColumns(10);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("\uC124\uBA85");
			lblNewLabel_2.setBounds(64, 183, 57, 15);
			modified.getContentPane().add(lblNewLabel_2);
		}
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(79, 208, 317, 43);
		modified.getContentPane().add(textArea);				
	
		modified.setVisible(true);
	}

	public void doingtodo() {

		ToDo todo = new ToDo();
		JPanel contentPanel = new JPanel();
		JTextField textField;
		
		todo.setBounds(100, 100, 450, 300);
		todo.getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		todo.getContentPane().add(contentPanel, BorderLayout.CENTER);
		//yiss92
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
		}
		
		JButton btnNewButton = new JButton("\uC77C\uC815\uB9CC\uB4E4\uAE30");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//yiss92
				//yiss92
				int temp = 0;
				today.setTitle(textField.getText());
				daydao.insert(today,temp);
				
				modified();
				//dispose();
			}
		});
		btnNewButton.setBounds(89, 218, 99, 25);
		contentPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC77C\uC815\uC218\uC815");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				modified();
				//dispose();
			}
		});
		btnNewButton_1.setBounds(227, 218, 99, 25);
		contentPanel.add(btnNewButton_1);

		todo.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 795, 806);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// textField.setText("test");
		// yiss92
		// Day day = new Day();
		DayDao daydao = new DayDao();

		List<Today> contracts = daydao.selectList();
		System.out.println(contracts.size());

		textField = new JTextField();
		textField.setEditable(false);
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//yiss92
				String temp = " ";
				daydao.select(temp);

				try {
					if (daydao.getRs().next() != false) {
						modified();
					} else {
						doingtodo();

					}

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		textField.setBounds(79, 37, 643, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("\uC694\uC77C");
		lblNewLabel.setBounds(103, 12, 292, 15);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("\uC624\uC804 12\uC2DC");
		lblNewLabel_1.setBounds(12, 68, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				modified();
			}
		});
		textField_1.setBounds(79, 65, 643, 21);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel label = new JLabel("\uC624\uC804 01\uC2DC");
		label.setBounds(12, 96, 57, 15);
		frame.getContentPane().add(label);

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				modified();
			}
		});
		textField_2.setColumns(10);
		textField_2.setBounds(79, 93, 643, 21);
		frame.getContentPane().add(textField_2);

		JLabel label_1 = new JLabel("\uC624\uC804 02\uC2DC");
		label_1.setBounds(12, 124, 57, 15);
		frame.getContentPane().add(label_1);

		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				modified();
			}
		});
		textField_3.setColumns(10);
		textField_3.setBounds(79, 121, 643, 21);
		frame.getContentPane().add(textField_3);

		JLabel label_2 = new JLabel("\uC624\uC804 03\uC2DC");
		label_2.setBounds(12, 152, 57, 15);
		frame.getContentPane().add(label_2);

		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				modified();
			}
		});
		textField_4.setColumns(10);
		textField_4.setBounds(79, 149, 643, 21);
		frame.getContentPane().add(textField_4);

		JLabel label_3 = new JLabel("\uC624\uC804 04\uC2DC");
		label_3.setBounds(12, 180, 57, 15);
		frame.getContentPane().add(label_3);

		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				modified();
			}
		});
		textField_5.setColumns(10);
		textField_5.setBounds(79, 177, 643, 21);
		frame.getContentPane().add(textField_5);

		JLabel label_4 = new JLabel("\uC624\uC804 05\uC2DC");
		label_4.setBounds(12, 208, 57, 15);
		frame.getContentPane().add(label_4);

		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				modified();
			}
		});
		textField_6.setColumns(10);
		textField_6.setBounds(79, 205, 643, 21);
		frame.getContentPane().add(textField_6);

		JLabel label_5 = new JLabel("\uC624\uC804 06\uC2DC");
		label_5.setBounds(12, 236, 57, 15);
		frame.getContentPane().add(label_5);

		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				modified();
			}
		});
		textField_7.setColumns(10);
		textField_7.setBounds(79, 233, 643, 21);
		frame.getContentPane().add(textField_7);

		JLabel label_6 = new JLabel("\uC624\uC804 07\uC2DC");
		label_6.setBounds(12, 264, 57, 15);
		frame.getContentPane().add(label_6);

		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				modified();
			}
		});
		textField_8.setColumns(10);
		textField_8.setBounds(79, 261, 643, 21);
		frame.getContentPane().add(textField_8);

		JLabel label_7 = new JLabel("\uC624\uC804 08\uC2DC");
		label_7.setBounds(12, 292, 57, 15);
		frame.getContentPane().add(label_7);

		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				modified();
			}
		});
		textField_9.setColumns(10);
		textField_9.setBounds(79, 289, 643, 21);
		frame.getContentPane().add(textField_9);

		JLabel label_8 = new JLabel("\uC624\uC804 09\uC2DC");
		label_8.setBounds(12, 320, 57, 15);
		frame.getContentPane().add(label_8);

		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				modified();
			}
		});
		textField_10.setColumns(10);
		textField_10.setBounds(79, 317, 643, 21);
		frame.getContentPane().add(textField_10);

		JLabel label_9 = new JLabel("\uC624\uC804 10\uC2DC");
		label_9.setBounds(12, 348, 57, 15);
		frame.getContentPane().add(label_9);

		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				modified();
			}
		});
		textField_11.setColumns(10);
		textField_11.setBounds(79, 345, 643, 21);
		frame.getContentPane().add(textField_11);

		JLabel label_10 = new JLabel("\uC624\uC804 11\uC2DC");
		label_10.setBounds(12, 376, 57, 15);
		frame.getContentPane().add(label_10);

		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				modified();
			}
		});
		textField_12.setColumns(10);
		textField_12.setBounds(79, 373, 643, 21);
		frame.getContentPane().add(textField_12);

		JLabel label_11 = new JLabel("\uC624\uD6C4 12\uC2DC");
		label_11.setBounds(12, 404, 57, 15);
		frame.getContentPane().add(label_11);

		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				modified();
			}
		});
		textField_13.setColumns(10);
		textField_13.setBounds(79, 401, 643, 21);
		frame.getContentPane().add(textField_13);

		JLabel label_12 = new JLabel("\uC624\uD6C4 01\uC2DC");
		label_12.setBounds(12, 432, 57, 15);
		frame.getContentPane().add(label_12);

		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				modified();
			}
		});
		textField_14.setColumns(10);
		textField_14.setBounds(79, 429, 643, 21);
		frame.getContentPane().add(textField_14);

		JLabel label_13 = new JLabel("\uC624\uD6C4 02\uC2DC");
		label_13.setBounds(12, 460, 57, 15);
		frame.getContentPane().add(label_13);

		textField_15 = new JTextField();
		textField_15.setEditable(false);
		textField_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				modified();
			}
		});
		textField_15.setColumns(10);
		textField_15.setBounds(79, 457, 643, 21);
		frame.getContentPane().add(textField_15);

		textField_16 = new JTextField();
		textField_16.setEditable(false);
		textField_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				modified();
			}
		});
		textField_16.setColumns(10);
		textField_16.setBounds(79, 485, 643, 21);
		frame.getContentPane().add(textField_16);

		JLabel label_14 = new JLabel("\uC624\uD6C4 03\uC2DC");
		label_14.setBounds(12, 488, 57, 15);
		frame.getContentPane().add(label_14);

		textField_17 = new JTextField();
		textField_17.setEditable(false);
		textField_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				modified();
			}
		});
		textField_17.setColumns(10);
		textField_17.setBounds(79, 516, 643, 21);
		frame.getContentPane().add(textField_17);

		JLabel label_15 = new JLabel("\uC624\uD6C4 04\uC2DC");
		label_15.setBounds(12, 519, 57, 15);
		frame.getContentPane().add(label_15);

		textField_18 = new JTextField();
		textField_18.setEditable(false);
		textField_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				modified();
			}
		});
		textField_18.setColumns(10);
		textField_18.setBounds(79, 547, 643, 21);
		frame.getContentPane().add(textField_18);

		JLabel label_16 = new JLabel("\uC624\uD6C4 05\uC2DC");
		label_16.setBounds(12, 550, 57, 15);
		frame.getContentPane().add(label_16);

		textField_19 = new JTextField();
		textField_19.setEditable(false);
		textField_19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				modified();
			}
		});
		textField_19.setColumns(10);
		textField_19.setBounds(79, 578, 643, 21);
		frame.getContentPane().add(textField_19);

		JLabel label_17 = new JLabel("\uC624\uD6C4 06\uC2DC");
		label_17.setBounds(12, 581, 57, 15);
		frame.getContentPane().add(label_17);

		textField_20 = new JTextField();
		textField_20.setEditable(false);
		textField_20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				modified();
			}
		});
		textField_20.setColumns(10);
		textField_20.setBounds(79, 609, 643, 21);
		frame.getContentPane().add(textField_20);

		JLabel label_18 = new JLabel("\uC624\uD6C4 07\uC2DC");
		label_18.setBounds(12, 612, 57, 15);
		frame.getContentPane().add(label_18);

		textField_21 = new JTextField();
		textField_21.setEditable(false);
		textField_21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				modified();
			}
		});
		textField_21.setColumns(10);
		textField_21.setBounds(79, 640, 643, 21);
		frame.getContentPane().add(textField_21);

		JLabel label_19 = new JLabel("\uC624\uD6C4 08\uC2DC");
		label_19.setBounds(12, 643, 57, 15);
		frame.getContentPane().add(label_19);

		textField_22 = new JTextField();
		textField_22.setEditable(false);
		textField_22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				modified();
			}
		});
		textField_22.setColumns(10);
		textField_22.setBounds(79, 671, 643, 21);
		frame.getContentPane().add(textField_22);

		JLabel label_20 = new JLabel("\uC624\uD6C4 09\uC2DC");
		label_20.setBounds(12, 674, 57, 15);
		frame.getContentPane().add(label_20);

		textField_23 = new JTextField();
		textField_23.setEditable(false);
		textField_23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				modified();
			}
		});
		textField_23.setColumns(10);
		textField_23.setBounds(79, 702, 643, 21);
		frame.getContentPane().add(textField_23);

		JLabel label_21 = new JLabel("\uC624\uD6C4 10\uC2DC");
		label_21.setBounds(12, 705, 57, 15);
		frame.getContentPane().add(label_21);

		textField_24 = new JTextField();
		textField_24.setEditable(false);
		textField_24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				modified();
			}
		});
		textField_24.setColumns(10);
		textField_24.setBounds(79, 733, 643, 21);
		frame.getContentPane().add(textField_24);

		JLabel label_22 = new JLabel("\uC624\uD6C4 11\uC2DC");
		label_22.setBounds(12, 736, 57, 15);
		frame.getContentPane().add(label_22);

		// yiss92
		// .getClass().textField.setText(contracts.get(3).getToDo());
		switch (contracts.size()) {
		case 1:
			textField_1.setText(contracts.get(0).getToDo());
			break;

		case 2:
			textField_1.setText(contracts.get(0).getToDo());
			textField_2.setText(contracts.get(1).getToDo());
			break;

		case 3:
			textField_1.setText(contracts.get(0).getToDo());
			textField_2.setText(contracts.get(1).getToDo());
			textField_3.setText(contracts.get(2).getToDo());
			break;

		case 4:
			textField_1.setText(contracts.get(0).getToDo());
			textField_2.setText(contracts.get(1).getToDo());
			textField_3.setText(contracts.get(2).getToDo());
			textField_4.setText(contracts.get(3).getToDo());
			break;

		case 5:
			textField_1.setText(contracts.get(0).getToDo());
			textField_2.setText(contracts.get(1).getToDo());
			textField_3.setText(contracts.get(2).getToDo());
			textField_4.setText(contracts.get(3).getToDo());
			textField_5.setText(contracts.get(4).getToDo());
			break;

		case 6:
			textField_1.setText(contracts.get(0).getToDo());
			textField_2.setText(contracts.get(1).getToDo());
			textField_3.setText(contracts.get(2).getToDo());
			textField_4.setText(contracts.get(3).getToDo());
			textField_5.setText(contracts.get(4).getToDo());
			textField_6.setText(contracts.get(5).getToDo());
			break;

		case 7:
			textField_1.setText(contracts.get(0).getToDo());
			textField_2.setText(contracts.get(1).getToDo());
			textField_3.setText(contracts.get(2).getToDo());
			textField_4.setText(contracts.get(3).getToDo());
			textField_5.setText(contracts.get(4).getToDo());
			textField_6.setText(contracts.get(5).getToDo());
			textField_7.setText(contracts.get(6).getToDo());
			break;

		case 8:
			textField_1.setText(contracts.get(0).getToDo());
			textField_2.setText(contracts.get(1).getToDo());
			textField_3.setText(contracts.get(2).getToDo());
			textField_4.setText(contracts.get(3).getToDo());
			textField_5.setText(contracts.get(4).getToDo());
			textField_6.setText(contracts.get(5).getToDo());
			textField_7.setText(contracts.get(6).getToDo());
			textField_8.setText(contracts.get(7).getToDo());
			break;

		case 9:
			textField_1.setText(contracts.get(0).getToDo());
			textField_2.setText(contracts.get(1).getToDo());
			textField_3.setText(contracts.get(2).getToDo());
			textField_4.setText(contracts.get(3).getToDo());
			textField_5.setText(contracts.get(4).getToDo());
			textField_6.setText(contracts.get(5).getToDo());
			textField_7.setText(contracts.get(6).getToDo());
			textField_8.setText(contracts.get(7).getToDo());
			textField_9.setText(contracts.get(8).getToDo());
			break;

		case 10:
			textField_1.setText(contracts.get(0).getToDo());
			textField_2.setText(contracts.get(1).getToDo());
			textField_3.setText(contracts.get(2).getToDo());
			textField_4.setText(contracts.get(3).getToDo());
			textField_5.setText(contracts.get(4).getToDo());
			textField_6.setText(contracts.get(5).getToDo());
			textField_7.setText(contracts.get(6).getToDo());
			textField_8.setText(contracts.get(7).getToDo());
			textField_9.setText(contracts.get(8).getToDo());
			textField_10.setText(contracts.get(9).getToDo());
			break;

		case 11:
			textField_1.setText(contracts.get(0).getToDo());
			textField_2.setText(contracts.get(1).getToDo());
			textField_3.setText(contracts.get(2).getToDo());
			textField_4.setText(contracts.get(3).getToDo());
			textField_5.setText(contracts.get(4).getToDo());
			textField_6.setText(contracts.get(5).getToDo());
			textField_7.setText(contracts.get(6).getToDo());
			textField_8.setText(contracts.get(7).getToDo());
			textField_9.setText(contracts.get(8).getToDo());
			textField_10.setText(contracts.get(9).getToDo());
			textField_11.setText(contracts.get(10).getToDo());
			break;

		case 12:
			textField_1.setText(contracts.get(0).getToDo());
			textField_2.setText(contracts.get(1).getToDo());
			textField_3.setText(contracts.get(2).getToDo());
			textField_4.setText(contracts.get(3).getToDo());
			textField_5.setText(contracts.get(4).getToDo());
			textField_6.setText(contracts.get(5).getToDo());
			textField_7.setText(contracts.get(6).getToDo());
			textField_8.setText(contracts.get(7).getToDo());
			textField_9.setText(contracts.get(8).getToDo());
			textField_10.setText(contracts.get(9).getToDo());
			textField_11.setText(contracts.get(10).getToDo());
			textField_12.setText(contracts.get(11).getToDo());
			break;

		case 13:
			textField_1.setText(contracts.get(0).getToDo());
			textField_2.setText(contracts.get(1).getToDo());
			textField_3.setText(contracts.get(2).getToDo());
			textField_4.setText(contracts.get(3).getToDo());
			textField_5.setText(contracts.get(4).getToDo());
			textField_6.setText(contracts.get(5).getToDo());
			textField_7.setText(contracts.get(6).getToDo());
			textField_8.setText(contracts.get(7).getToDo());
			textField_9.setText(contracts.get(8).getToDo());
			textField_10.setText(contracts.get(9).getToDo());
			textField_11.setText(contracts.get(10).getToDo());
			textField_12.setText(contracts.get(11).getToDo());
			textField_13.setText(contracts.get(12).getToDo());
			break;

		case 14:
			textField_1.setText(contracts.get(0).getToDo());
			textField_2.setText(contracts.get(1).getToDo());
			textField_3.setText(contracts.get(2).getToDo());
			textField_4.setText(contracts.get(3).getToDo());
			textField_5.setText(contracts.get(4).getToDo());
			textField_6.setText(contracts.get(5).getToDo());
			textField_7.setText(contracts.get(6).getToDo());
			textField_8.setText(contracts.get(7).getToDo());
			textField_9.setText(contracts.get(8).getToDo());
			textField_10.setText(contracts.get(9).getToDo());
			textField_11.setText(contracts.get(10).getToDo());
			textField_12.setText(contracts.get(11).getToDo());
			textField_13.setText(contracts.get(12).getToDo());
			textField_14.setText(contracts.get(13).getToDo());
			break;

		case 15:
			textField_1.setText(contracts.get(0).getToDo());
			textField_2.setText(contracts.get(1).getToDo());
			textField_3.setText(contracts.get(2).getToDo());
			textField_4.setText(contracts.get(3).getToDo());
			textField_5.setText(contracts.get(4).getToDo());
			textField_6.setText(contracts.get(5).getToDo());
			textField_7.setText(contracts.get(6).getToDo());
			textField_8.setText(contracts.get(7).getToDo());
			textField_9.setText(contracts.get(8).getToDo());
			textField_10.setText(contracts.get(9).getToDo());
			textField_11.setText(contracts.get(10).getToDo());
			textField_12.setText(contracts.get(11).getToDo());
			textField_13.setText(contracts.get(12).getToDo());
			textField_14.setText(contracts.get(13).getToDo());
			textField_15.setText(contracts.get(14).getToDo());
			break;

		case 16:
			textField_1.setText(contracts.get(0).getToDo());
			textField_2.setText(contracts.get(1).getToDo());
			textField_3.setText(contracts.get(2).getToDo());
			textField_4.setText(contracts.get(3).getToDo());
			textField_5.setText(contracts.get(4).getToDo());
			textField_6.setText(contracts.get(5).getToDo());
			textField_7.setText(contracts.get(6).getToDo());
			textField_8.setText(contracts.get(7).getToDo());
			textField_9.setText(contracts.get(8).getToDo());
			textField_10.setText(contracts.get(9).getToDo());
			textField_11.setText(contracts.get(10).getToDo());
			textField_12.setText(contracts.get(11).getToDo());
			textField_13.setText(contracts.get(12).getToDo());
			textField_14.setText(contracts.get(13).getToDo());
			textField_15.setText(contracts.get(14).getToDo());
			textField_16.setText(contracts.get(15).getToDo());
			break;

		case 17:
			textField_1.setText(contracts.get(0).getToDo());
			textField_2.setText(contracts.get(1).getToDo());
			textField_3.setText(contracts.get(2).getToDo());
			textField_4.setText(contracts.get(3).getToDo());
			textField_5.setText(contracts.get(4).getToDo());
			textField_6.setText(contracts.get(5).getToDo());
			textField_7.setText(contracts.get(6).getToDo());
			textField_8.setText(contracts.get(7).getToDo());
			textField_9.setText(contracts.get(8).getToDo());
			textField_10.setText(contracts.get(9).getToDo());
			textField_11.setText(contracts.get(10).getToDo());
			textField_12.setText(contracts.get(11).getToDo());
			textField_13.setText(contracts.get(12).getToDo());
			textField_14.setText(contracts.get(13).getToDo());
			textField_15.setText(contracts.get(14).getToDo());
			textField_16.setText(contracts.get(15).getToDo());
			textField_17.setText(contracts.get(16).getToDo());
			break;

		case 18:
			textField_1.setText(contracts.get(0).getToDo());
			textField_2.setText(contracts.get(1).getToDo());
			textField_3.setText(contracts.get(2).getToDo());
			textField_4.setText(contracts.get(3).getToDo());
			textField_5.setText(contracts.get(4).getToDo());
			textField_6.setText(contracts.get(5).getToDo());
			textField_7.setText(contracts.get(6).getToDo());
			textField_8.setText(contracts.get(7).getToDo());
			textField_9.setText(contracts.get(8).getToDo());
			textField_10.setText(contracts.get(9).getToDo());
			textField_11.setText(contracts.get(10).getToDo());
			textField_12.setText(contracts.get(11).getToDo());
			textField_13.setText(contracts.get(12).getToDo());
			textField_14.setText(contracts.get(13).getToDo());
			textField_15.setText(contracts.get(14).getToDo());
			textField_16.setText(contracts.get(15).getToDo());
			textField_17.setText(contracts.get(16).getToDo());
			textField_18.setText(contracts.get(17).getToDo());
			break;

		case 19:
			textField_1.setText(contracts.get(0).getToDo());
			textField_2.setText(contracts.get(1).getToDo());
			textField_3.setText(contracts.get(2).getToDo());
			textField_4.setText(contracts.get(3).getToDo());
			textField_5.setText(contracts.get(4).getToDo());
			textField_6.setText(contracts.get(5).getToDo());
			textField_7.setText(contracts.get(6).getToDo());
			textField_8.setText(contracts.get(7).getToDo());
			textField_9.setText(contracts.get(8).getToDo());
			textField_10.setText(contracts.get(9).getToDo());
			textField_11.setText(contracts.get(10).getToDo());
			textField_12.setText(contracts.get(11).getToDo());
			textField_13.setText(contracts.get(12).getToDo());
			textField_14.setText(contracts.get(13).getToDo());
			textField_15.setText(contracts.get(14).getToDo());
			textField_16.setText(contracts.get(15).getToDo());
			textField_17.setText(contracts.get(16).getToDo());
			textField_18.setText(contracts.get(17).getToDo());
			textField_19.setText(contracts.get(18).getToDo());
			break;

		case 20:
			textField_1.setText(contracts.get(0).getToDo());
			textField_2.setText(contracts.get(1).getToDo());
			textField_3.setText(contracts.get(2).getToDo());
			textField_4.setText(contracts.get(3).getToDo());
			textField_5.setText(contracts.get(4).getToDo());
			textField_6.setText(contracts.get(5).getToDo());
			textField_7.setText(contracts.get(6).getToDo());
			textField_8.setText(contracts.get(7).getToDo());
			textField_9.setText(contracts.get(8).getToDo());
			textField_10.setText(contracts.get(9).getToDo());
			textField_11.setText(contracts.get(10).getToDo());
			textField_12.setText(contracts.get(11).getToDo());
			textField_13.setText(contracts.get(12).getToDo());
			textField_14.setText(contracts.get(13).getToDo());
			textField_15.setText(contracts.get(14).getToDo());
			textField_16.setText(contracts.get(15).getToDo());
			textField_17.setText(contracts.get(16).getToDo());
			textField_18.setText(contracts.get(17).getToDo());
			textField_19.setText(contracts.get(18).getToDo());
			textField_20.setText(contracts.get(19).getToDo());
			break;

		case 21:
			textField_1.setText(contracts.get(0).getToDo());
			textField_2.setText(contracts.get(1).getToDo());
			textField_3.setText(contracts.get(2).getToDo());
			textField_4.setText(contracts.get(3).getToDo());
			textField_5.setText(contracts.get(4).getToDo());
			textField_6.setText(contracts.get(5).getToDo());
			textField_7.setText(contracts.get(6).getToDo());
			textField_8.setText(contracts.get(7).getToDo());
			textField_9.setText(contracts.get(8).getToDo());
			textField_10.setText(contracts.get(9).getToDo());
			textField_11.setText(contracts.get(10).getToDo());
			textField_12.setText(contracts.get(11).getToDo());
			textField_13.setText(contracts.get(12).getToDo());
			textField_14.setText(contracts.get(13).getToDo());
			textField_15.setText(contracts.get(14).getToDo());
			textField_16.setText(contracts.get(15).getToDo());
			textField_17.setText(contracts.get(16).getToDo());
			textField_18.setText(contracts.get(17).getToDo());
			textField_19.setText(contracts.get(18).getToDo());
			textField_20.setText(contracts.get(19).getToDo());
			textField_21.setText(contracts.get(20).getToDo());
			break;

		case 22:
			textField_1.setText(contracts.get(0).getToDo());
			textField_2.setText(contracts.get(1).getToDo());
			textField_3.setText(contracts.get(2).getToDo());
			textField_4.setText(contracts.get(3).getToDo());
			textField_5.setText(contracts.get(4).getToDo());
			textField_6.setText(contracts.get(5).getToDo());
			textField_7.setText(contracts.get(6).getToDo());
			textField_8.setText(contracts.get(7).getToDo());
			textField_9.setText(contracts.get(8).getToDo());
			textField_10.setText(contracts.get(9).getToDo());
			textField_11.setText(contracts.get(10).getToDo());
			textField_12.setText(contracts.get(11).getToDo());
			textField_13.setText(contracts.get(12).getToDo());
			textField_14.setText(contracts.get(13).getToDo());
			textField_15.setText(contracts.get(14).getToDo());
			textField_16.setText(contracts.get(15).getToDo());
			textField_17.setText(contracts.get(16).getToDo());
			textField_18.setText(contracts.get(17).getToDo());
			textField_19.setText(contracts.get(18).getToDo());
			textField_20.setText(contracts.get(19).getToDo());
			textField_21.setText(contracts.get(20).getToDo());
			textField_22.setText(contracts.get(21).getToDo());
			break;

		case 23:
			textField_1.setText(contracts.get(0).getToDo());
			textField_2.setText(contracts.get(1).getToDo());
			textField_3.setText(contracts.get(2).getToDo());
			textField_4.setText(contracts.get(3).getToDo());
			textField_5.setText(contracts.get(4).getToDo());
			textField_6.setText(contracts.get(5).getToDo());
			textField_7.setText(contracts.get(6).getToDo());
			textField_8.setText(contracts.get(7).getToDo());
			textField_9.setText(contracts.get(8).getToDo());
			textField_10.setText(contracts.get(9).getToDo());
			textField_11.setText(contracts.get(10).getToDo());
			textField_12.setText(contracts.get(11).getToDo());
			textField_13.setText(contracts.get(12).getToDo());
			textField_14.setText(contracts.get(13).getToDo());
			textField_15.setText(contracts.get(14).getToDo());
			textField_16.setText(contracts.get(15).getToDo());
			textField_17.setText(contracts.get(16).getToDo());
			textField_18.setText(contracts.get(17).getToDo());
			textField_19.setText(contracts.get(18).getToDo());
			textField_20.setText(contracts.get(19).getToDo());
			textField_21.setText(contracts.get(20).getToDo());
			textField_22.setText(contracts.get(21).getToDo());
			textField_23.setText(contracts.get(22).getToDo());
			break;

		case 24:
			textField_1.setText(contracts.get(0).getToDo());
			textField_2.setText(contracts.get(1).getToDo());
			textField_3.setText(contracts.get(2).getToDo());
			textField_4.setText(contracts.get(3).getToDo());
			textField_5.setText(contracts.get(4).getToDo());
			textField_6.setText(contracts.get(5).getToDo());
			textField_7.setText(contracts.get(6).getToDo());
			textField_8.setText(contracts.get(7).getToDo());
			textField_9.setText(contracts.get(8).getToDo());
			textField_10.setText(contracts.get(9).getToDo());
			textField_11.setText(contracts.get(10).getToDo());
			textField_12.setText(contracts.get(11).getToDo());
			textField_13.setText(contracts.get(12).getToDo());
			textField_14.setText(contracts.get(13).getToDo());
			textField_15.setText(contracts.get(14).getToDo());
			textField_16.setText(contracts.get(15).getToDo());
			textField_17.setText(contracts.get(16).getToDo());
			textField_18.setText(contracts.get(17).getToDo());
			textField_19.setText(contracts.get(18).getToDo());
			textField_20.setText(contracts.get(19).getToDo());
			textField_21.setText(contracts.get(20).getToDo());
			textField_22.setText(contracts.get(21).getToDo());
			textField_23.setText(contracts.get(22).getToDo());
			textField_24.setText(contracts.get(23).getToDo());
			break;

		default:
			System.out.println("데이터가 없습니다.");
			break;
		}

		textField_25 = new JTextField();
		textField_25.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//yiss92
				//조회후 값이 있다면 저장값 보여주고 수정가능하면 수정하기
			}
		});
		textField_25.setEditable(false);
		textField_25.setBounds(734, 37, 45, 21);
		frame.getContentPane().add(textField_25);
		textField_25.setColumns(10);

		textField_26 = new JTextField();
		textField_26.setEditable(false);
		textField_26.setColumns(10);
		textField_26.setBounds(734, 65, 45, 21);
		frame.getContentPane().add(textField_26);

		textField_27 = new JTextField();
		textField_27.setEditable(false);
		textField_27.setColumns(10);
		textField_27.setBounds(734, 93, 45, 21);
		frame.getContentPane().add(textField_27);

		textField_28 = new JTextField();
		textField_28.setEditable(false);
		textField_28.setColumns(10);
		textField_28.setBounds(734, 121, 45, 21);
		frame.getContentPane().add(textField_28);

		textField_29 = new JTextField();
		textField_29.setEditable(false);
		textField_29.setColumns(10);
		textField_29.setBounds(734, 149, 45, 21);
		frame.getContentPane().add(textField_29);

		textField_30 = new JTextField();
		textField_30.setEditable(false);
		textField_30.setColumns(10);
		textField_30.setBounds(734, 177, 45, 21);
		frame.getContentPane().add(textField_30);

		textField_31 = new JTextField();
		textField_31.setEditable(false);
		textField_31.setColumns(10);
		textField_31.setBounds(734, 205, 45, 21);
		frame.getContentPane().add(textField_31);

		textField_32 = new JTextField();
		textField_32.setEditable(false);
		textField_32.setColumns(10);
		textField_32.setBounds(734, 233, 45, 21);
		frame.getContentPane().add(textField_32);

		textField_33 = new JTextField();
		textField_33.setEditable(false);
		textField_33.setColumns(10);
		textField_33.setBounds(734, 261, 45, 21);
		frame.getContentPane().add(textField_33);

		textField_34 = new JTextField();
		textField_34.setEditable(false);
		textField_34.setColumns(10);
		textField_34.setBounds(734, 289, 45, 21);
		frame.getContentPane().add(textField_34);

		textField_35 = new JTextField();
		textField_35.setEditable(false);
		textField_35.setColumns(10);
		textField_35.setBounds(734, 317, 45, 21);
		frame.getContentPane().add(textField_35);

		textField_36 = new JTextField();
		textField_36.setEditable(false);
		textField_36.setColumns(10);
		textField_36.setBounds(734, 345, 45, 21);
		frame.getContentPane().add(textField_36);

		textField_37 = new JTextField();
		textField_37.setEditable(false);
		textField_37.setColumns(10);
		textField_37.setBounds(734, 373, 45, 21);
		frame.getContentPane().add(textField_37);

		textField_38 = new JTextField();
		textField_38.setEditable(false);
		textField_38.setColumns(10);
		textField_38.setBounds(734, 401, 45, 21);
		frame.getContentPane().add(textField_38);

		textField_39 = new JTextField();
		textField_39.setEditable(false);
		textField_39.setColumns(10);
		textField_39.setBounds(734, 429, 45, 21);
		frame.getContentPane().add(textField_39);

		textField_40 = new JTextField();
		textField_40.setEditable(false);
		textField_40.setColumns(10);
		textField_40.setBounds(734, 457, 45, 21);
		frame.getContentPane().add(textField_40);

		textField_41 = new JTextField();
		textField_41.setEditable(false);
		textField_41.setColumns(10);
		textField_41.setBounds(734, 485, 45, 21);
		frame.getContentPane().add(textField_41);

		textField_42 = new JTextField();
		textField_42.setEditable(false);
		textField_42.setColumns(10);
		textField_42.setBounds(734, 516, 45, 21);
		frame.getContentPane().add(textField_42);

		textField_43 = new JTextField();
		textField_43.setEditable(false);
		textField_43.setColumns(10);
		textField_43.setBounds(734, 547, 45, 21);
		frame.getContentPane().add(textField_43);

		textField_44 = new JTextField();
		textField_44.setEditable(false);
		textField_44.setColumns(10);
		textField_44.setBounds(734, 578, 45, 21);
		frame.getContentPane().add(textField_44);

		textField_45 = new JTextField();
		textField_45.setEditable(false);
		textField_45.setColumns(10);
		textField_45.setBounds(734, 609, 45, 21);
		frame.getContentPane().add(textField_45);

		textField_46 = new JTextField();
		textField_46.setEditable(false);
		textField_46.setColumns(10);
		textField_46.setBounds(734, 640, 45, 21);
		frame.getContentPane().add(textField_46);

		textField_47 = new JTextField();
		textField_47.setEditable(false);
		textField_47.setColumns(10);
		textField_47.setBounds(734, 671, 45, 21);
		frame.getContentPane().add(textField_47);

		textField_48 = new JTextField();
		textField_48.setEditable(false);
		textField_48.setColumns(10);
		textField_48.setBounds(734, 702, 45, 21);
		frame.getContentPane().add(textField_48);

		textField_49 = new JTextField();
		textField_49.setEditable(false);
		textField_49.setColumns(10);
		textField_49.setBounds(734, 733, 45, 21);
		frame.getContentPane().add(textField_49);
	}
}
