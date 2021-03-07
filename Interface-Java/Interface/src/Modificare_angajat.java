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

public class Modificare_angajat extends JFrame {

	private JPanel contentPane;
	public String tabel_initial;
	public String modificare;
	private JTable table;
	private JTextField Angajat_ID;
	private JTextField Fabrica_ID;
	private JTextField Nume;
	private JTextField Salariu;
	private JTextField Pozitie;
	private JTextField Prenume;
	private JTextField Data_angajare;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modificare_angajat frame = new Modificare_angajat();
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
	public Modificare_angajat() {
		setTitle("Meniu Baza de date");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("Modificare Angajat");
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
				Angajat_ID.setText(model.getValueAt(i, 0).toString());
				if(model.getValueAt(i, 1)==null)
					Fabrica_ID.setText("null");
				else
				Fabrica_ID.setText(model.getValueAt(i, 1).toString());
				Nume.setText(model.getValueAt(i, 2).toString());
				Prenume.setText(model.getValueAt(i, 3).toString());
				Pozitie.setText(model.getValueAt(i, 4).toString());
				Salariu.setText(model.getValueAt(i, 5).toString());
				Data_angajare.setText(model.getValueAt(i, 6).toString());
			}
		});
		scrollPane.setViewportView(table);
		
		Angajat_ID = new JTextField();
		Angajat_ID.setBounds(506, 160, 120, 20);
		contentPane.add(Angajat_ID);
		Angajat_ID.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Angajat_ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(506, 141, 100, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Inserare date");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(496, 100, 280, 41);
		contentPane.add(lblNewLabel_2);
		
		Fabrica_ID = new JTextField();
		Fabrica_ID.setColumns(10);
		Fabrica_ID.setBounds(506, 210, 120, 20);
		contentPane.add(Fabrica_ID);
		
		JLabel lblNewLabel_1_1 = new JLabel("Fabrica_ID");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(506, 191, 100, 20);
		contentPane.add(lblNewLabel_1_1);
		
		Nume = new JTextField();
		Nume.setColumns(10);
		Nume.setBounds(506, 260, 120, 20);
		contentPane.add(Nume);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Nume");
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
				String query="UPDATE "+tabel_initial+" set fabrica_ID=?, nume=?, prenume=?, pozitie=?, salariu=?, data_angajare=to_date(?,'yyyy-mm-dd') where angajat_id="+value;
				PreparedStatement statement=connection.prepareStatement(query);
				if(Fabrica_ID.getText().equals("null")==true)
					statement.setNull(1, Types.INTEGER);
				else
				statement.setString(1, Fabrica_ID.getText());
				statement.setString(2, Nume.getText());
				statement.setString(3, Prenume.getText());
				statement.setString(4, Pozitie.getText());
				statement.setString(5, Salariu.getText());
				statement.setString(6, Data_angajare.getText());
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
		
		Salariu = new JTextField();
		Salariu.setColumns(10);
		Salariu.setBounds(636, 210, 120, 20);
		contentPane.add(Salariu);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Salariu");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1.setBounds(636, 191, 100, 20);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		Pozitie = new JTextField();
		Pozitie.setColumns(10);
		Pozitie.setBounds(636, 160, 120, 20);
		contentPane.add(Pozitie);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Pozitie");
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_1.setBounds(636, 141, 100, 20);
		contentPane.add(lblNewLabel_1_1_2_1);
		
		Prenume = new JTextField();
		Prenume.setColumns(10);
		Prenume.setBounds(506, 309, 120, 20);
		contentPane.add(Prenume);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Prenume");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setBounds(506, 290, 100, 20);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		Data_angajare = new JTextField();
		Data_angajare.setColumns(10);
		Data_angajare.setBounds(636, 260, 120, 20);
		contentPane.add(Data_angajare);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Data_angajare");
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_2.setBounds(636, 241, 100, 20);
		contentPane.add(lblNewLabel_1_1_1_2);
		
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
