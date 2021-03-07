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

public class Modificare_view extends JFrame {

	private JPanel contentPane;
	public String tabel_initial;
	public String modificare;
	private JTable table;
	private JTextField Fabrica_ID;
	private JTextField Tip_caroserie;
	private JTextField Nume_model;
	private JTextField Tractiune;
	private JTextField Nume_companie;
	private JTextField Data_productie;
	private JTextField Serie_sasiu;
	private JTextField Motorizare;
	private JTextField Combustibil;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modificare_view frame = new Modificare_view();
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
	public Modificare_view() {
		setTitle("Meniu Baza de date");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("Modificare View");
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
		btnNewButton.setBounds(10, 101, 447, 41);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds(10, 141, 447, 400);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int i=table.getSelectedRow();
				TableModel model=table.getModel();
				Fabrica_ID.setText(model.getValueAt(i, 0).toString());
				Nume_model.setText(model.getValueAt(i, 1).toString());
				Serie_sasiu.setText(model.getValueAt(i, 4).toString());
				Data_productie.setText(model.getValueAt(i, 5).toString());
				Motorizare.setText(model.getValueAt(i, 6).toString());
				Combustibil.setText(model.getValueAt(i, 7).toString());
				Tip_caroserie.setText(model.getValueAt(i, 8).toString());
				Tractiune.setText(model.getValueAt(i, 9).toString());
			}
		});
		scrollPane.setViewportView(table);
		
		Fabrica_ID = new JTextField();
		Fabrica_ID.setBounds(516, 134, 120, 20);
		contentPane.add(Fabrica_ID);
		Fabrica_ID.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Fabrica_ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(516, 115, 100, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Inserare date");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(506, 74, 280, 41);
		contentPane.add(lblNewLabel_2);
		
		
		
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
				String query="UPDATE "+tabel_initial+" set nume_model=?, serie_sasiu=?, data_productie=to_date(?,'yyyy-mm-dd'), motorizare=?, combustibil=?, tip_caroserie=?, tractiune=? where "+tabel_initial+".Serie_sasiu='"+value+"'";
				PreparedStatement statement=connection.prepareStatement(query);
				statement.setString(1, Nume_model.getText());
				statement.setString(2, Serie_sasiu.getText());
				statement.setString(3, Data_productie.getText());
				statement.setString(4, Motorizare.getText());
				statement.setString(5, Combustibil.getText());
				statement.setString(6, Tip_caroserie.getText());
				statement.setString(7, Tractiune.getText());
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
		
		Tip_caroserie = new JTextField();
		Tip_caroserie.setColumns(10);
		Tip_caroserie.setBounds(646, 183, 120, 20);
		contentPane.add(Tip_caroserie);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Tip_caroserie");
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_1.setBounds(646, 164, 100, 20);
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
		
		Nume_model = new JTextField();
		Nume_model.setColumns(10);
		Nume_model.setBounds(516, 183, 120, 20);
		contentPane.add(Nume_model);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nume_model");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(516, 164, 100, 20);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_2_1_1 = new JLabel("Tractiune");
		lblNewLabel_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_1_1.setBounds(646, 213, 100, 20);
		contentPane.add(lblNewLabel_1_1_2_1_1);
		
		Tractiune = new JTextField();
		Tractiune.setColumns(10);
		Tractiune.setBounds(646, 232, 120, 20);
		contentPane.add(Tractiune);
		
		JLabel lblNewLabel_1_1_2_1_2 = new JLabel("Nume_companie");
		lblNewLabel_1_1_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_1_2.setBounds(646, 262, 100, 20);
		contentPane.add(lblNewLabel_1_1_2_1_2);
		
		Nume_companie = new JTextField();
		Nume_companie.setColumns(10);
		Nume_companie.setBounds(646, 281, 120, 20);
		contentPane.add(Nume_companie);
		
		Data_productie = new JTextField();
		Data_productie.setColumns(10);
		Data_productie.setBounds(516, 278, 120, 20);
		contentPane.add(Data_productie);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Data_productie");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2.setBounds(516, 259, 100, 20);
		contentPane.add(lblNewLabel_1_1_2);
		
		Serie_sasiu = new JTextField();
		Serie_sasiu.setColumns(10);
		Serie_sasiu.setBounds(516, 229, 120, 20);
		contentPane.add(Serie_sasiu);
		
		JLabel lblNewLabel_1_3 = new JLabel("Serie_sasiu");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(516, 210, 100, 20);
		contentPane.add(lblNewLabel_1_3);
		
		Motorizare = new JTextField();
		Motorizare.setColumns(10);
		Motorizare.setBounds(516, 330, 120, 20);
		contentPane.add(Motorizare);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Motorizare");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3_1.setBounds(516, 311, 100, 20);
		contentPane.add(lblNewLabel_1_3_1);
		
		Combustibil = new JTextField();
		Combustibil.setColumns(10);
		Combustibil.setBounds(646, 134, 120, 20);
		contentPane.add(Combustibil);
		
		JLabel lblNewLabel_1_1_2_2 = new JLabel("Combustibil");
		lblNewLabel_1_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_2.setBounds(646, 115, 100, 20);
		contentPane.add(lblNewLabel_1_1_2_2);
	}
}
