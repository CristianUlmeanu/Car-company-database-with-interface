import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Modificare_showroom extends JFrame {

	private JPanel contentPane;
	public String tabel_initial;
	public String modificare;
	private JTable table;
	private JTextField Showroom_ID;
	private JTextField Fabrica_ID;
	private JTextField Nume_model;
	private JTextField Incepere_program;
	private JTextField Target_vanzari;
	private JTextField Sfarsit_program;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modificare_showroom frame = new Modificare_showroom();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Modificare_showroom() {
		setTitle("Meniu Baza de date");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("Modificare Showroom");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel.setBounds(250, 10, 300, 50);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Afisare tabel pentru referinta.");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String URL="jdbc:oracle:thin:@localhost:1521:xe";
				String username="CarCompany";
				String password="123456";
				Connection connection=null;
				try {
					connection=DriverManager.getConnection(URL,username,password);
					String afisare_tabel_initial="select * from "+tabel_initial;
					PreparedStatement statement=connection.prepareStatement(afisare_tabel_initial);
					ResultSet result=statement.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(result));
					}
					catch (SQLException a)
					{a.printStackTrace();
					}
				finally {
			        try {
			            if (connection != null) {
			                connection.close();
			            }
			        } catch (SQLException sqlee) {
			            sqlee.printStackTrace();
			        }
			    }
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(10, 101, 446, 41);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds(10, 141, 446, 400);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int i=table.getSelectedRow();
				TableModel model=table.getModel();
				Showroom_ID.setText(model.getValueAt(i, 0).toString());
				Fabrica_ID.setText(model.getValueAt(i, 1).toString());
				Nume_model.setText(model.getValueAt(i, 2).toString());
				Target_vanzari.setText(model.getValueAt(i, 3).toString());
				Incepere_program.setText(model.getValueAt(i, 4).toString());
				Sfarsit_program.setText(model.getValueAt(i, 5).toString());
			}
		});
		scrollPane.setViewportView(table);
		
		Showroom_ID = new JTextField();
		Showroom_ID.setBounds(516, 161, 120, 20);
		contentPane.add(Showroom_ID);
		Showroom_ID.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Showroom_ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(516, 142, 100, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Inserare date");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(506, 101, 280, 41);
		contentPane.add(lblNewLabel_2);
		
		Fabrica_ID = new JTextField();
		Fabrica_ID.setColumns(10);
		Fabrica_ID.setBounds(516, 211, 120, 20);
		contentPane.add(Fabrica_ID);
		
		JLabel lblNewLabel_1_1 = new JLabel("Fabrica_ID");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(516, 192, 100, 20);
		contentPane.add(lblNewLabel_1_1);
		
		Nume_model = new JTextField();
		Nume_model.setColumns(10);
		Nume_model.setBounds(516, 261, 120, 20);
		contentPane.add(Nume_model);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Nume_model");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(516, 242, 100, 20);
		contentPane.add(lblNewLabel_1_1_1);
		
		JButton btnNewButton_1 = new JButton("Modificare");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String URL="jdbc:oracle:thin:@localhost:1521:xe";
				String username="CarCompany";
				String password="123456";
				Connection connection=null;
				try {
				connection=DriverManager.getConnection(URL,username,password);
				int row=table.getSelectedRow();
				String value=(table.getModel().getValueAt(row,0).toString());
				String query="UPDATE "+tabel_initial+" set fabrica_ID=?, nume_model=?, target_vanzari=?, incepere_program=?, sfarsit_program=? where Showroom_ID="+value;
				PreparedStatement statement=connection.prepareStatement(query);
				statement.setString(1, Fabrica_ID.getText());
				statement.setString(2, Nume_model.getText());
				statement.setString(3, Target_vanzari.getText());
				statement.setString(4, Incepere_program.getText());
				statement.setString(5, Sfarsit_program.getText());
				statement.executeUpdate();
				JOptionPane.showMessageDialog(null,"Modificare a fost realizata cu success");
				}
				catch (SQLException a)
				{a.printStackTrace();
				}
				finally {
			        try {
			            if (connection != null) {
			                connection.close();
			            }
			        } catch (SQLException sqlee) {
			            sqlee.printStackTrace();
			        }
			    }
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(516, 502, 120, 40);
		contentPane.add(btnNewButton_1);
		
		Incepere_program = new JTextField();
		Incepere_program.setColumns(10);
		Incepere_program.setBounds(646, 211, 120, 20);
		contentPane.add(Incepere_program);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Incepere_program");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1.setBounds(646, 192, 100, 20);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		Target_vanzari = new JTextField();
		Target_vanzari.setColumns(10);
		Target_vanzari.setBounds(646, 161, 120, 20);
		contentPane.add(Target_vanzari);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Target_vanzari");
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_1.setBounds(646, 142, 100, 20);
		contentPane.add(lblNewLabel_1_1_2_1);
		
		Sfarsit_program = new JTextField();
		Sfarsit_program.setColumns(10);
		Sfarsit_program.setBounds(646, 260, 120, 20);
		contentPane.add(Sfarsit_program);
		
		JLabel lblNewLabel_1_1_2_1_2 = new JLabel("Sfarsit_program");
		lblNewLabel_1_1_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_1_2.setBounds(646, 241, 100, 20);
		contentPane.add(lblNewLabel_1_1_2_1_2);
		
		JButton btnNewButton_1_1 = new JButton("Back");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Modificari m=new Modificari();
				m.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_1.setBounds(646, 502, 120, 40);
		contentPane.add(btnNewButton_1_1);
	}
}
