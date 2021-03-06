import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

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
	private JButton btnNewButton_2;
	private JButton button;
	private JButton button_1;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	
	private Today today = null;
	private DayDao daydao = null;
	

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
		
		JButton button = new JButton("\uC218\uC815");
		button.setFont(new Font("����", Font.PLAIN, 12));
		button.setBounds(77, 10, 99, 25);
		modified.getContentPane().add(button);
		
		JButton button_1 = new JButton("\uC0AD\uC81C");
		button_1.setFont(new Font("����", Font.PLAIN, 12));
		button_1.setBounds(207, 10, 99, 25);
		modified.getContentPane().add(button_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(77, 61, 317, 21);
		modified.getContentPane().add(textField);
		
		JLabel label = new JLabel("\uC138\uBD80\uC815\uBCF4");
		label.setFont(new Font("����", Font.PLAIN, 12));
		label.setBounds(62, 121, 57, 15);
		modified.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\uC7A5\uC18C");
		label_1.setFont(new Font("����", Font.PLAIN, 12));
		label_1.setBounds(72, 146, 57, 15);
		modified.getContentPane().add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(131, 143, 263, 21);
		modified.getContentPane().add(textField_1);
		
		JLabel label_2 = new JLabel("\uC124\uBA85");
		label_2.setFont(new Font("����", Font.PLAIN, 12));
		label_2.setBounds(62, 183, 57, 15);
		modified.getContentPane().add(label_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(77, 208, 317, 43);
		modified.getContentPane().add(textArea);				
	
		modified.setVisible(true);
	}

	public void doingtodo() {

		ToDo todo = new ToDo();
		JPanel contentPanel = new JPanel();
		JTextField textField;
		
		todo.setBounds(100, 100, 450, 300);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		todo.getContentPane().add(contentPanel, BorderLayout.CENTER);
		//yiss92
		today = new Today();
		daydao = new DayDao();
		
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

		//String temp="";
		today = daydao.selecteither();
		textField = new JTextField();
		textField.setEditable(false);
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//yiss92
				//String temp = " ";
				//Today today = new Today();
				
                
				try {
					if (daydao.getRs().next() != false) {
						modified();
						//textField.setText(today.getTitle());
						//temp = today.getTitle();
						//System.out.println(today.getTitle());
					} else {
						doingtodo();

					}

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			
			
		});
		textField.setText(today.getTitle());
		
		textField.setBounds(79, 37, 643, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("\uC694\uC77C");
		lblNewLabel.setBounds(377, 12, 72, 15);
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
		
		btnNewButton_2 = new JButton("\uC77C");
		btnNewButton_2.setBounds(489, 6, 63, 25);
		frame.getContentPane().add(btnNewButton_2);
		
		button = new JButton("\uC8FC");
		button.setBounds(565, 6, 63, 25);
		frame.getContentPane().add(button);
		
		button_1 = new JButton("\uC6D4");
		button_1.setBounds(644, 7, 63, 25);
		frame.getContentPane().add(button_1);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(80, 12, 57, 15);
		frame.getContentPane().add(lblNewLabel_3);
		lblNewLabel_3.setText("test");
		
		
		lblNewLabel_4 = new JLabel("\uB144");
		lblNewLabel_4.setBounds(149, 12, 57, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("\uC77C");
		lblNewLabel_5.setBounds(299, 13, 26, 15);
		frame.getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("\uC6D4");
		lblNewLabel_6.setBounds(230, 12, 57, 15);
		frame.getContentPane().add(lblNewLabel_6);
         
		// yiss92
		// .getClass().textField.setText(contracts.get(3).getTitle());
//		switch (contracts.size()) {
//		case 1:
//			textField_1.setText(contracts.get(0).getTitle());
//			break;
//
//		case 2:
//			textField_1.setText(contracts.get(0).getTitle());
//			textField_2.setText(contracts.get(1).getTitle());
//			break;
//
//		case 3:
//			textField_1.setText(contracts.get(1).getTitle());
//			textField_2.setText(contracts.get(2).getTitle());
//			textField_3.setText(contracts.get(3).getTitle());
//			break;
//
//		case 4:
//			textField_1.setText(contracts.get(0).getTitle());
//			textField_2.setText(contracts.get(1).getTitle());
//			textField_3.setText(contracts.get(2).getTitle());
//			textField_4.setText(contracts.get(3).getTitle());
//			break;
//
//		case 5:
//			textField_1.setText(contracts.get(0).getTitle());
//			textField_2.setText(contracts.get(1).getTitle());
//			textField_3.setText(contracts.get(2).getTitle());
//			textField_4.setText(contracts.get(3).getTitle());
//			textField_5.setText(contracts.get(4).getTitle());
//			break;
//
//		case 6:
//			textField_1.setText(contracts.get(0).getTitle());
//			textField_2.setText(contracts.get(1).getTitle());
//			textField_3.setText(contracts.get(2).getTitle());
//			textField_4.setText(contracts.get(3).getTitle());
//			textField_5.setText(contracts.get(4).getTitle());
//			textField_6.setText(contracts.get(5).getTitle());
//			break;
//
//		case 7:
//			textField_1.setText(contracts.get(0).getTitle());
//			textField_2.setText(contracts.get(1).getTitle());
//			textField_3.setText(contracts.get(2).getTitle());
//			textField_4.setText(contracts.get(3).getTitle());
//			textField_5.setText(contracts.get(4).getTitle());
//			textField_6.setText(contracts.get(5).getTitle());
//			textField_7.setText(contracts.get(6).getTitle());
//			break;
//
//		case 8:
//			textField_1.setText(contracts.get(0).getTitle());
//			textField_2.setText(contracts.get(1).getTitle());
//			textField_3.setText(contracts.get(2).getTitle());
//			textField_4.setText(contracts.get(3).getTitle());
//			textField_5.setText(contracts.get(4).getTitle());
//			textField_6.setText(contracts.get(5).getTitle());
//			textField_7.setText(contracts.get(6).getTitle());
//			textField_8.setText(contracts.get(7).getTitle());
//			break;
//
//		case 9:
//			textField_1.setText(contracts.get(0).getTitle());
//			textField_2.setText(contracts.get(1).getTitle());
//			textField_3.setText(contracts.get(2).getTitle());
//			textField_4.setText(contracts.get(3).getTitle());
//			textField_5.setText(contracts.get(4).getTitle());
//			textField_6.setText(contracts.get(5).getTitle());
//			textField_7.setText(contracts.get(6).getTitle());
//			textField_8.setText(contracts.get(7).getTitle());
//			textField_9.setText(contracts.get(8).getTitle());
//			break;
//
//		case 10:
//			textField_1.setText(contracts.get(0).getTitle());
//			textField_2.setText(contracts.get(1).getTitle());
//			textField_3.setText(contracts.get(2).getTitle());
//			textField_4.setText(contracts.get(3).getTitle());
//			textField_5.setText(contracts.get(4).getTitle());
//			textField_6.setText(contracts.get(5).getTitle());
//			textField_7.setText(contracts.get(6).getTitle());
//			textField_8.setText(contracts.get(7).getTitle());
//			textField_9.setText(contracts.get(8).getTitle());
//			textField_10.setText(contracts.get(9).getTitle());
//			break;
//
//		case 11:
//			textField_1.setText(contracts.get(0).getTitle());
//			textField_2.setText(contracts.get(1).getTitle());
//			textField_3.setText(contracts.get(2).getTitle());
//			textField_4.setText(contracts.get(3).getTitle());
//			textField_5.setText(contracts.get(4).getTitle());
//			textField_6.setText(contracts.get(5).getTitle());
//			textField_7.setText(contracts.get(6).getTitle());
//			textField_8.setText(contracts.get(7).getTitle());
//			textField_9.setText(contracts.get(8).getTitle());
//			textField_10.setText(contracts.get(9).getTitle());
//			textField_11.setText(contracts.get(10).getTitle());
//			break;
//
//		case 12:
//			textField_1.setText(contracts.get(0).getTitle());
//			textField_2.setText(contracts.get(1).getTitle());
//			textField_3.setText(contracts.get(2).getTitle());
//			textField_4.setText(contracts.get(3).getTitle());
//			textField_5.setText(contracts.get(4).getTitle());
//			textField_6.setText(contracts.get(5).getTitle());
//			textField_7.setText(contracts.get(6).getTitle());
//			textField_8.setText(contracts.get(7).getTitle());
//			textField_9.setText(contracts.get(8).getTitle());
//			textField_10.setText(contracts.get(9).getTitle());
//			textField_11.setText(contracts.get(10).getTitle());
//			textField_12.setText(contracts.get(11).getTitle());
//			break;
//
//		case 13:
//			textField_1.setText(contracts.get(0).getTitle());
//			textField_2.setText(contracts.get(1).getTitle());
//			textField_3.setText(contracts.get(2).getTitle());
//			textField_4.setText(contracts.get(3).getTitle());
//			textField_5.setText(contracts.get(4).getTitle());
//			textField_6.setText(contracts.get(5).getTitle());
//			textField_7.setText(contracts.get(6).getTitle());
//			textField_8.setText(contracts.get(7).getTitle());
//			textField_9.setText(contracts.get(8).getTitle());
//			textField_10.setText(contracts.get(9).getTitle());
//			textField_11.setText(contracts.get(10).getTitle());
//			textField_12.setText(contracts.get(11).getTitle());
//			textField_13.setText(contracts.get(12).getTitle());
//			break;
//
//		case 14:
//			textField_1.setText(contracts.get(0).getTitle());
//			textField_2.setText(contracts.get(1).getTitle());
//			textField_3.setText(contracts.get(2).getTitle());
//			textField_4.setText(contracts.get(3).getTitle());
//			textField_5.setText(contracts.get(4).getTitle());
//			textField_6.setText(contracts.get(5).getTitle());
//			textField_7.setText(contracts.get(6).getTitle());
//			textField_8.setText(contracts.get(7).getTitle());
//			textField_9.setText(contracts.get(8).getTitle());
//			textField_10.setText(contracts.get(9).getTitle());
//			textField_11.setText(contracts.get(10).getTitle());
//			textField_12.setText(contracts.get(11).getTitle());
//			textField_13.setText(contracts.get(12).getTitle());
//			textField_14.setText(contracts.get(13).getTitle());
//			break;
//
//		case 15:
//			textField_1.setText(contracts.get(0).getTitle());
//			textField_2.setText(contracts.get(1).getTitle());
//			textField_3.setText(contracts.get(2).getTitle());
//			textField_4.setText(contracts.get(3).getTitle());
//			textField_5.setText(contracts.get(4).getTitle());
//			textField_6.setText(contracts.get(5).getTitle());
//			textField_7.setText(contracts.get(6).getTitle());
//			textField_8.setText(contracts.get(7).getTitle());
//			textField_9.setText(contracts.get(8).getTitle());
//			textField_10.setText(contracts.get(9).getTitle());
//			textField_11.setText(contracts.get(10).getTitle());
//			textField_12.setText(contracts.get(11).getTitle());
//			textField_13.setText(contracts.get(12).getTitle());
//			textField_14.setText(contracts.get(13).getTitle());
//			textField_15.setText(contracts.get(14).getTitle());
//			break;
//
//		case 16:
//			textField_1.setText(contracts.get(0).getTitle());
//			textField_2.setText(contracts.get(1).getTitle());
//			textField_3.setText(contracts.get(2).getTitle());
//			textField_4.setText(contracts.get(3).getTitle());
//			textField_5.setText(contracts.get(4).getTitle());
//			textField_6.setText(contracts.get(5).getTitle());
//			textField_7.setText(contracts.get(6).getTitle());
//			textField_8.setText(contracts.get(7).getTitle());
//			textField_9.setText(contracts.get(8).getTitle());
//			textField_10.setText(contracts.get(9).getTitle());
//			textField_11.setText(contracts.get(10).getTitle());
//			textField_12.setText(contracts.get(11).getTitle());
//			textField_13.setText(contracts.get(12).getTitle());
//			textField_14.setText(contracts.get(13).getTitle());
//			textField_15.setText(contracts.get(14).getTitle());
//			textField_16.setText(contracts.get(15).getTitle());
//			break;
//
//		case 17:
//			textField_1.setText(contracts.get(0).getTitle());
//			textField_2.setText(contracts.get(1).getTitle());
//			textField_3.setText(contracts.get(2).getTitle());
//			textField_4.setText(contracts.get(3).getTitle());
//			textField_5.setText(contracts.get(4).getTitle());
//			textField_6.setText(contracts.get(5).getTitle());
//			textField_7.setText(contracts.get(6).getTitle());
//			textField_8.setText(contracts.get(7).getTitle());
//			textField_9.setText(contracts.get(8).getTitle());
//			textField_10.setText(contracts.get(9).getTitle());
//			textField_11.setText(contracts.get(10).getTitle());
//			textField_12.setText(contracts.get(11).getTitle());
//			textField_13.setText(contracts.get(12).getTitle());
//			textField_14.setText(contracts.get(13).getTitle());
//			textField_15.setText(contracts.get(14).getTitle());
//			textField_16.setText(contracts.get(15).getTitle());
//			textField_17.setText(contracts.get(16).getTitle());
//			break;
//
//		case 18:
//			textField_1.setText(contracts.get(0).getTitle());
//			textField_2.setText(contracts.get(1).getTitle());
//			textField_3.setText(contracts.get(2).getTitle());
//			textField_4.setText(contracts.get(3).getTitle());
//			textField_5.setText(contracts.get(4).getTitle());
//			textField_6.setText(contracts.get(5).getTitle());
//			textField_7.setText(contracts.get(6).getTitle());
//			textField_8.setText(contracts.get(7).getTitle());
//			textField_9.setText(contracts.get(8).getTitle());
//			textField_10.setText(contracts.get(9).getTitle());
//			textField_11.setText(contracts.get(10).getTitle());
//			textField_12.setText(contracts.get(11).getTitle());
//			textField_13.setText(contracts.get(12).getTitle());
//			textField_14.setText(contracts.get(13).getTitle());
//			textField_15.setText(contracts.get(14).getTitle());
//			textField_16.setText(contracts.get(15).getTitle());
//			textField_17.setText(contracts.get(16).getTitle());
//			textField_18.setText(contracts.get(17).getTitle());
//			break;
//
//		case 19:
//			textField_1.setText(contracts.get(0).getTitle());
//			textField_2.setText(contracts.get(1).getTitle());
//			textField_3.setText(contracts.get(2).getTitle());
//			textField_4.setText(contracts.get(3).getTitle());
//			textField_5.setText(contracts.get(4).getTitle());
//			textField_6.setText(contracts.get(5).getTitle());
//			textField_7.setText(contracts.get(6).getTitle());
//			textField_8.setText(contracts.get(7).getTitle());
//			textField_9.setText(contracts.get(8).getTitle());
//			textField_10.setText(contracts.get(9).getTitle());
//			textField_11.setText(contracts.get(10).getTitle());
//			textField_12.setText(contracts.get(11).getTitle());
//			textField_13.setText(contracts.get(12).getTitle());
//			textField_14.setText(contracts.get(13).getTitle());
//			textField_15.setText(contracts.get(14).getTitle());
//			textField_16.setText(contracts.get(15).getTitle());
//			textField_17.setText(contracts.get(16).getTitle());
//			textField_18.setText(contracts.get(17).getTitle());
//			textField_19.setText(contracts.get(18).getTitle());
//			break;
//
//		case 20:
//			textField_1.setText(contracts.get(0).getTitle());
//			textField_2.setText(contracts.get(1).getTitle());
//			textField_3.setText(contracts.get(2).getTitle());
//			textField_4.setText(contracts.get(3).getTitle());
//			textField_5.setText(contracts.get(4).getTitle());
//			textField_6.setText(contracts.get(5).getTitle());
//			textField_7.setText(contracts.get(6).getTitle());
//			textField_8.setText(contracts.get(7).getTitle());
//			textField_9.setText(contracts.get(8).getTitle());
//			textField_10.setText(contracts.get(9).getTitle());
//			textField_11.setText(contracts.get(10).getTitle());
//			textField_12.setText(contracts.get(11).getTitle());
//			textField_13.setText(contracts.get(12).getTitle());
//			textField_14.setText(contracts.get(13).getTitle());
//			textField_15.setText(contracts.get(14).getTitle());
//			textField_16.setText(contracts.get(15).getTitle());
//			textField_17.setText(contracts.get(16).getTitle());
//			textField_18.setText(contracts.get(17).getTitle());
//			textField_19.setText(contracts.get(18).getTitle());
//			textField_20.setText(contracts.get(19).getTitle());
//			break;
//
//		case 21:
//			textField_1.setText(contracts.get(0).getTitle());
//			textField_2.setText(contracts.get(1).getTitle());
//			textField_3.setText(contracts.get(2).getTitle());
//			textField_4.setText(contracts.get(3).getTitle());
//			textField_5.setText(contracts.get(4).getTitle());
//			textField_6.setText(contracts.get(5).getTitle());
//			textField_7.setText(contracts.get(6).getTitle());
//			textField_8.setText(contracts.get(7).getTitle());
//			textField_9.setText(contracts.get(8).getTitle());
//			textField_10.setText(contracts.get(9).getTitle());
//			textField_11.setText(contracts.get(10).getTitle());
//			textField_12.setText(contracts.get(11).getTitle());
//			textField_13.setText(contracts.get(12).getTitle());
//			textField_14.setText(contracts.get(13).getTitle());
//			textField_15.setText(contracts.get(14).getTitle());
//			textField_16.setText(contracts.get(15).getTitle());
//			textField_17.setText(contracts.get(16).getTitle());
//			textField_18.setText(contracts.get(17).getTitle());
//			textField_19.setText(contracts.get(18).getTitle());
//			textField_20.setText(contracts.get(19).getTitle());
//			textField_21.setText(contracts.get(20).getTitle());
//			break;
//
//		case 22:
//			textField_1.setText(contracts.get(0).getTitle());
//			textField_2.setText(contracts.get(1).getTitle());
//			textField_3.setText(contracts.get(2).getTitle());
//			textField_4.setText(contracts.get(3).getTitle());
//			textField_5.setText(contracts.get(4).getTitle());
//			textField_6.setText(contracts.get(5).getTitle());
//			textField_7.setText(contracts.get(6).getTitle());
//			textField_8.setText(contracts.get(7).getTitle());
//			textField_9.setText(contracts.get(8).getTitle());
//			textField_10.setText(contracts.get(9).getTitle());
//			textField_11.setText(contracts.get(10).getTitle());
//			textField_12.setText(contracts.get(11).getTitle());
//			textField_13.setText(contracts.get(12).getTitle());
//			textField_14.setText(contracts.get(13).getTitle());
//			textField_15.setText(contracts.get(14).getTitle());
//			textField_16.setText(contracts.get(15).getTitle());
//			textField_17.setText(contracts.get(16).getTitle());
//			textField_18.setText(contracts.get(17).getTitle());
//			textField_19.setText(contracts.get(18).getTitle());
//			textField_20.setText(contracts.get(19).getTitle());
//			textField_21.setText(contracts.get(20).getTitle());
//			textField_22.setText(contracts.get(21).getTitle());
//			break;
//
//		case 23:
//			textField_1.setText(contracts.get(0).getTitle());
//			textField_2.setText(contracts.get(1).getTitle());
//			textField_3.setText(contracts.get(2).getTitle());
//			textField_4.setText(contracts.get(3).getTitle());
//			textField_5.setText(contracts.get(4).getTitle());
//			textField_6.setText(contracts.get(5).getTitle());
//			textField_7.setText(contracts.get(6).getTitle());
//			textField_8.setText(contracts.get(7).getTitle());
//			textField_9.setText(contracts.get(8).getTitle());
//			textField_10.setText(contracts.get(9).getTitle());
//			textField_11.setText(contracts.get(10).getTitle());
//			textField_12.setText(contracts.get(11).getTitle());
//			textField_13.setText(contracts.get(12).getTitle());
//			textField_14.setText(contracts.get(13).getTitle());
//			textField_15.setText(contracts.get(14).getTitle());
//			textField_16.setText(contracts.get(15).getTitle());
//			textField_17.setText(contracts.get(16).getTitle());
//			textField_18.setText(contracts.get(17).getTitle());
//			textField_19.setText(contracts.get(18).getTitle());
//			textField_20.setText(contracts.get(19).getTitle());
//			textField_21.setText(contracts.get(20).getTitle());
//			textField_22.setText(contracts.get(21).getTitle());
//			textField_23.setText(contracts.get(22).getTitle());
//			break;
//
//		case 24:
//			textField_1.setText(contracts.get(0).getTitle());
//			textField_2.setText(contracts.get(1).getTitle());
//			textField_3.setText(contracts.get(2).getTitle());
//			textField_4.setText(contracts.get(3).getTitle());
//			textField_5.setText(contracts.get(4).getTitle());
//			textField_6.setText(contracts.get(5).getTitle());
//			textField_7.setText(contracts.get(6).getTitle());
//			textField_8.setText(contracts.get(7).getTitle());
//			textField_9.setText(contracts.get(8).getTitle());
//			textField_10.setText(contracts.get(9).getTitle());
//			textField_11.setText(contracts.get(10).getTitle());
//			textField_12.setText(contracts.get(11).getTitle());
//			textField_13.setText(contracts.get(12).getTitle());
//			textField_14.setText(contracts.get(13).getTitle());
//			textField_15.setText(contracts.get(14).getTitle());
//			textField_16.setText(contracts.get(15).getTitle());
//			textField_17.setText(contracts.get(16).getTitle());
//			textField_18.setText(contracts.get(17).getTitle());
//			textField_19.setText(contracts.get(18).getTitle());
//			textField_20.setText(contracts.get(19).getTitle());
//			textField_21.setText(contracts.get(20).getTitle());
//			textField_22.setText(contracts.get(21).getTitle());
//			textField_23.setText(contracts.get(22).getTitle());
//			textField_24.setText(contracts.get(23).getTitle());
//			break;
//
//		default:
//			System.out.println("�����Ͱ� �����ϴ�.");
//			break;
//		}
	}
}
