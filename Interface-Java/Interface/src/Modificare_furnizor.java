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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Modificare_furnizor extends JFrame {

	private JPanel contentPane;
	public String tabel_initial;
	public String modificare;
	private JTable table;
	private JTextField Nume_companie;
	private JTextField Nume_contact;
	private JTextField Prenume_contact;
	private JTextField Email_contact;
	private JTextField Telefon_contact;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modificare_furnizor frame = new Modificare_furnizor();
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
	public Modificare_furnizor() {
		setTitle("Meniu Baza de date");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("Modificare Furnizor");
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
		btnNewButton.setBounds(10, 101, 449, 41);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds(10, 141, 449, 400);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int i=table.getSelectedRow();
				TableModel model=table.getModel();
				Nume_companie.setText(model.getValueAt(i, 0).toString());
				Nume_contact.setText(model.getValueAt(i, 1).toString());
				Prenume_contact.setText(model.getValueAt(i, 2).toString());
				Telefon_contact.setText(model.getValueAt(i, 3).toString());
				Email_contact.setText(model.getValueAt(i, 4).toString());
			}
		});
		scrollPane.setViewportView(table);
		
		Nume_companie = new JTextField();
		Nume_companie.setBounds(516, 160, 120, 20);
		contentPane.add(Nume_companie);
		Nume_companie.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nume_companie");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(516, 141, 100, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Inserare date");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(506, 100, 280, 41);
		contentPane.add(lblNewLabel_2);
		
		Nume_contact = new JTextField();
		Nume_contact.setColumns(10);
		Nume_contact.setBounds(516, 210, 120, 20);
		contentPane.add(Nume_contact);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nume_contact");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(516, 191, 100, 20);
		contentPane.add(lblNewLabel_1_1);
		
		Prenume_contact = new JTextField();
		Prenume_contact.setColumns(10);
		Prenume_contact.setBounds(516, 260, 120, 20);
		contentPane.add(Prenume_contact);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Prenume_contact");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(516, 241, 100, 20);
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
				String query="UPDATE "+tabel_initial+" set nume_contact=?, prenume_contact=?, telefon_contact=?, email_contact=? where Nume_companie='"+value+"'";
				PreparedStatement statement=connection.prepareStatement(query);
				statement.setString(1, Nume_contact.getText());
				statement.setString(2, Prenume_contact.getText());
				statement.setString(3, Telefon_contact.getText());
				statement.setString(4, Email_contact.getText());
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
		btnNewButton_1.setBounds(516, 501, 120, 40);
		contentPane.add(btnNewButton_1);
		
		Email_contact = new JTextField();
		Email_contact.setColumns(10);
		Email_contact.setBounds(646, 210, 120, 20);
		contentPane.add(Email_contact);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Email_contact");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1.setBounds(646, 191, 100, 20);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		Telefon_contact = new JTextField();
		Telefon_contact.setColumns(10);
		Telefon_contact.setBounds(646, 160, 120, 20);
		contentPane.add(Telefon_contact);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Telefon_contact");
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_1.setBounds(646, 141, 100, 20);
		contentPane.add(lblNewLabel_1_1_2_1);
		
		JButton btnNewButton_1_1 = new JButton("Back");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Modificari m=new Modificari();
				m.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_1.setBounds(646, 501, 120, 40);
		contentPane.add(btnNewButton_1_1);
	}
}
