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

public class Modificare_piesa extends JFrame {

	private JPanel contentPane;
	public String tabel_initial;
	public String modificare;
	private JTable table;
	private JTextField Piesa_ID;
	private JTextField Nume_companie;
	private JTextField Tip_piesa;
	private JTextField Pret;
	private JTextField Garantie;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modificare_piesa frame = new Modificare_piesa();
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
	public Modificare_piesa() {
		setTitle("Meniu Baza de date");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("Modificare Piesa");
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
		//table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int i=table.getSelectedRow();
				TableModel model=table.getModel();
				Piesa_ID.setText(model.getValueAt(i, 0).toString());
				Nume_companie.setText(model.getValueAt(i, 1).toString());
				Tip_piesa.setText(model.getValueAt(i, 2).toString());
				if(model.getValueAt(i, 3)==null)
					Garantie.setText("null");
				else
				Garantie.setText(model.getValueAt(i, 3).toString());
				Pret.setText(model.getValueAt(i, 4).toString());
			}
		});
		scrollPane.setViewportView(table);
		
		Piesa_ID = new JTextField();
		Piesa_ID.setBounds(516, 161, 120, 20);
		contentPane.add(Piesa_ID);
		Piesa_ID.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Piesa_ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(516, 142, 100, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Inserare date");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(506, 101, 280, 41);
		contentPane.add(lblNewLabel_2);
		
		Nume_companie = new JTextField();
		Nume_companie.setColumns(10);
		Nume_companie.setBounds(516, 211, 120, 20);
		contentPane.add(Nume_companie);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nume_companie");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(516, 192, 100, 20);
		contentPane.add(lblNewLabel_1_1);
		
		Tip_piesa = new JTextField();
		Tip_piesa.setColumns(10);
		Tip_piesa.setBounds(516, 261, 120, 20);
		contentPane.add(Tip_piesa);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Tip_piesa");
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
				String query="UPDATE "+tabel_initial+" set nume_companie=?, tip_piesa=?, garantie=?, pret=? where Piesa_ID="+value;
				PreparedStatement statement=connection.prepareStatement(query);
				statement.setString(1, Nume_companie.getText());
				statement.setString(2, Tip_piesa.getText());
				if (Garantie.getText().equals("null")==true)
					statement.setNull(3, Types.INTEGER);
				else
				statement.setString(3, Garantie.getText());
				statement.setString(4, Pret.getText());
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
		
		Pret = new JTextField();
		Pret.setColumns(10);
		Pret.setBounds(646, 211, 120, 20);
		contentPane.add(Pret);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Pret");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1.setBounds(646, 192, 100, 20);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		Garantie = new JTextField();
		Garantie.setColumns(10);
		Garantie.setBounds(646, 161, 120, 20);
		contentPane.add(Garantie);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Garantie");
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2_1.setBounds(646, 142, 100, 20);
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
		btnNewButton_1_1.setBounds(646, 502, 120, 40);
		contentPane.add(btnNewButton_1_1);
	}
}
