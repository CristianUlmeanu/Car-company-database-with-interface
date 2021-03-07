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

public class Modificare_client extends JFrame {

	private JPanel contentPane;
	public String tabel_initial;
	public String modificare;
	private JTable table;
	private JTextField Client_ID;
	private JTextField Showroom_ID;
	private JTextField Nume_client;
	private JTextField Numar_masini;
	private JTextField CNP;
	private JTextField Prenume_client;
	private JTextField Numar_telefon;
	private JTextField Email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modificare_client frame = new Modificare_client();
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
	public Modificare_client() {
		setTitle("Meniu Baza de date");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("Modificare Client");
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
		btnNewButton.setBounds(10, 101, 452, 41);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds(10, 141, 452, 400);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int i=table.getSelectedRow();
				TableModel model=table.getModel();
				Client_ID.setText(model.getValueAt(i, 0).toString());
				if(model.getValueAt(i, 1)==null)
					Showroom_ID.setText("null");
				else
				Showroom_ID.setText(model.getValueAt(i, 1).toString());
				Nume_client.setText(model.getValueAt(i, 2).toString());
				Prenume_client.setText(model.getValueAt(i, 3).toString());
				CNP.setText(model.getValueAt(i, 4).toString());
				Numar_masini.setText(model.getValueAt(i, 5).toString());
				Numar_telefon.setText(model.getValueAt(i, 6).toString());
				Email.setText(model.getValueAt(i, 7).toString());
			}
		});
		scrollPane.setViewportView(table);
		
		Client_ID = new JTextField();
		Client_ID.setBounds(506, 160, 120, 20);
		contentPane.add(Client_ID);
		Client_ID.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Client_ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(506, 141, 100, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Inserare date");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(496, 100, 280, 41);
		contentPane.add(lblNewLabel_2);
		
		Showroom_ID = new JTextField();
		Showroom_ID.setColumns(10);
		Showroom_ID.setBounds(506, 210, 120, 20);
		contentPane.add(Showroom_ID);
		
		JLabel lblNewLabel_1_1 = new JLabel("Showroom_ID");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(506, 191, 100, 20);
		contentPane.add(lblNewLabel_1_1);
		
		Nume_client = new JTextField();
		Nume_client.setColumns(10);
		Nume_client.setBounds(506, 260, 120, 20);
		contentPane.add(Nume_client);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Nume_client");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(506, 241, 100, 20);
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
				String query="UPDATE "+tabel_initial+" set Showroom_ID=?, nume_client=?, prenume_client=?, CNP=?, numar_masini=?, numar_telefon=?, email=? where Client_ID="+value;
				PreparedStatement statement=connection.prepareStatement(query);
				if(Showroom_ID.getText().equals("null")==true)
					statement.setNull(1, Types.INTEGER);
				else
				statement.setString(1, Showroom_ID.getText());
				statement.setString(2, Nume_client.getText());
				statement.setString(3, Prenume_client.getText());
				statement.setString(4, CNP.getText());
				statement.setString(5, Numar_masini.getText());
				statement.setString(6, Numar_telefon.getText());
				statement.setString(7, Email.getText());
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
		btnNewButton_1.setBounds(506, 501, 120, 40);
		contentPane.add(btnNewButton_1);
		
		Numar_masini = new JTextField();
		Numar_masini.setColumns(10);
		Numar_masini.setBounds(636, 210, 120, 20);
		contentPane.add(Numar_masini);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Numar_masini");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1.setBounds(636, 191, 100, 20);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		CNP = new JTextField();
		CNP.setColumns(10);
		CNP.setBounds(636, 160, 120, 20);
		contentPane.add(CNP);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("CNP");
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_1.setBounds(636, 141, 100, 20);
		contentPane.add(lblNewLabel_1_1_2_1);
		
		Prenume_client = new JTextField();
		Prenume_client.setColumns(10);
		Prenume_client.setBounds(506, 309, 120, 20);
		contentPane.add(Prenume_client);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Prenume_client");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setBounds(506, 290, 100, 20);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		Numar_telefon = new JTextField();
		Numar_telefon.setColumns(10);
		Numar_telefon.setBounds(636, 260, 120, 20);
		contentPane.add(Numar_telefon);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Numar_telefon");
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_2.setBounds(636, 241, 100, 20);
		contentPane.add(lblNewLabel_1_1_1_2);
		
		Email = new JTextField();
		Email.setColumns(10);
		Email.setBounds(636, 309, 120, 20);
		contentPane.add(Email);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("Email");
		lblNewLabel_1_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_2_1.setBounds(636, 290, 100, 20);
		contentPane.add(lblNewLabel_1_1_1_2_1);
		
		JButton btnNewButton_1_1 = new JButton("Back");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Modificari m=new Modificari();
				m.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_1.setBounds(636, 501, 120, 40);
		contentPane.add(btnNewButton_1_1);
	}
}
