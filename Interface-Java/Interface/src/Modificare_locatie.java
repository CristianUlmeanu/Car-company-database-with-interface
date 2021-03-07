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

public class Modificare_locatie extends JFrame {

	private JPanel contentPane;
	public String tabel_initial;
	public String modificare;
	private JTable table;
	private JTextField Locatie_ID;
	private JTextField Fabrica_ID;
	private JTextField Showroom_ID;
	private JTextField Strada;
	private JTextField Oras;
	private JTextField Tara;
	private JTextField Stat;
	private JTextField Cod_postal;
	private JTextField Numar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modificare_locatie frame = new Modificare_locatie();
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
	public Modificare_locatie() {
		setTitle("Meniu Baza de date");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("Modificare Locatie");
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
		btnNewButton.setBounds(10, 101, 448, 41);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds(10, 141, 448, 400);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int i=table.getSelectedRow();
				TableModel model=table.getModel();
				Locatie_ID.setText(model.getValueAt(i, 0).toString());
				if(model.getValueAt(i, 1)==null)
				Fabrica_ID.setText("null");
				else Fabrica_ID.setText(model.getValueAt(i, 1).toString());
				if(model.getValueAt(i, 2)==null)
					Showroom_ID.setText("null");
				else
				Showroom_ID.setText(model.getValueAt(i, 2).toString());
				Oras.setText(model.getValueAt(i, 5).toString());
				Strada.setText(model.getValueAt(i, 6).toString());
				Numar.setText(model.getValueAt(i, 7).toString());
				Cod_postal.setText(model.getValueAt(i, 8).toString());
				Tara.setText(model.getValueAt(i, 3).toString());
				Stat.setText(model.getValueAt(i, 4).toString());
			}
		});
		scrollPane.setViewportView(table);
		
		Locatie_ID = new JTextField();
		Locatie_ID.setBounds(516, 161, 120, 20);
		contentPane.add(Locatie_ID);
		Locatie_ID.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Locatie_ID");
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
		
		Showroom_ID = new JTextField();
		Showroom_ID.setColumns(10);
		Showroom_ID.setBounds(516, 261, 120, 20);
		contentPane.add(Showroom_ID);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Showroom_ID");
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
				String query="UPDATE "+tabel_initial+" set fabrica_ID=?, showroom_id=?, tara=?, stat=?, oras=?, strada=?, numar=?, cod_postal=? where Locatie_ID="+value;
				PreparedStatement statement=connection.prepareStatement(query);
				if(Fabrica_ID.getText().equals("null")==true)
				statement.setNull(1, Types.INTEGER);
				else
				statement.setString(1, Fabrica_ID.getText());
				if(Showroom_ID.getText().equals("null")==true)
				statement.setNull(2, Types.INTEGER);
				else
				statement.setString(2, Showroom_ID.getText());
				statement.setString(3, Tara.getText());
				statement.setString(4, Stat.getText());
				statement.setString(5, Oras.getText());
				statement.setString(6, Strada.getText());
				statement.setString(7, Numar.getText());
				statement.setString(8, Cod_postal.getText());
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
		
		Strada = new JTextField();
		Strada.setColumns(10);
		Strada.setBounds(646, 211, 120, 20);
		contentPane.add(Strada);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Strada");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1.setBounds(646, 192, 100, 20);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		Oras = new JTextField();
		Oras.setColumns(10);
		Oras.setBounds(646, 161, 120, 20);
		contentPane.add(Oras);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Oras");
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_1.setBounds(646, 142, 100, 20);
		contentPane.add(lblNewLabel_1_1_2_1);
		
		Tara = new JTextField();
		Tara.setColumns(10);
		Tara.setBounds(516, 310, 120, 20);
		contentPane.add(Tara);
		
		JLabel lblNewLabel_1_1_2_1_1 = new JLabel("Tara");
		lblNewLabel_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_1_1.setBounds(516, 291, 100, 20);
		contentPane.add(lblNewLabel_1_1_2_1_1);
		
		Stat = new JTextField();
		Stat.setColumns(10);
		Stat.setBounds(516, 360, 120, 20);
		contentPane.add(Stat);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Stat");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1.setBounds(516, 341, 100, 20);
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
		
		Cod_postal = new JTextField();
		Cod_postal.setColumns(10);
		Cod_postal.setBounds(646, 310, 120, 20);
		contentPane.add(Cod_postal);
		
		JLabel lblNewLabel_1_1_1_1_1_2 = new JLabel("Cod_postal");
		lblNewLabel_1_1_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_2.setBounds(646, 291, 100, 20);
		contentPane.add(lblNewLabel_1_1_1_1_1_2);
		
		Numar = new JTextField();
		Numar.setColumns(10);
		Numar.setBounds(646, 260, 120, 20);
		contentPane.add(Numar);
		
		JLabel lblNewLabel_1_1_2_1_2 = new JLabel("Numar");
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
