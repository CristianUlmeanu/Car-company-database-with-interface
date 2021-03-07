import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Afisare_grup extends JFrame {

	private JPanel contentPane;
	private JTextField Input_conditie;
	public String nume_tabel;
	public String ordonare;
	private JTable table;
	private JTable table_1;
	private JButton btnRulare;
	private JButton btnBack;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JButton btnRulare_1;
	private JLabel lblNewLabel_2;
	private JTextField Input_cond;
	private JTextField Input_grup;
	private JLabel lblNewLabel_3;
	private JButton btnCreareView;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Afisare_grup frame = new Afisare_grup();
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
	public Afisare_grup() {
		setTitle("Meniu Baza de date");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("Afisor grupat");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel.setBounds(250, 10, 300, 50);
		contentPane.add(lblNewLabel);
		
		Input_conditie = new JTextField();
		Input_conditie.setBounds(315, 435, 220, 30);
		contentPane.add(Input_conditie);
		Input_conditie.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Pe ce aplici conditia?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(305, 405, 240, 20);
		contentPane.add(lblNewLabel_1);
		
		scrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds(20, 75, 370, 320);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(395, 75, 370, 320);
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		
		btnRulare = new JButton("Grupare");
		btnRulare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String URL="jdbc:oracle:thin:@localhost:1521:xe";
				String username="CarCompany";
				String password="123456";
			Connection connection=null;
			try {
			connection=DriverManager.getConnection(URL,username,password);
			String afisare_tabel_grupat="";
			if(ordonare.equals("")==true)
				afisare_tabel_grupat="select "+Input_grup.getText()+", "+Input_conditie.getText()+" from "+nume_tabel+" group by "+Input_grup.getText()+" , "+Input_conditie.getText()+" having "+Input_conditie.getText()+Input_cond.getText();
			else
				afisare_tabel_grupat="select "+Input_grup.getText()+", "+Input_conditie.getText()+" from "+nume_tabel+" group by "+Input_grup.getText()+" , "+Input_conditie.getText()+" having "+Input_conditie.getText()+Input_cond.getText()+" order by "+ordonare;
			PreparedStatement statement2=connection.prepareStatement(afisare_tabel_grupat);
			ResultSet result2=statement2.executeQuery();
			table_1.setModel(DbUtils.resultSetToTableModel(result2));
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
		btnRulare.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRulare.setBounds(645, 405, 120, 40);
		contentPane.add(btnRulare);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Afisare meniu_precedent=new Afisare();
				meniu_precedent.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBack.setBounds(645, 505, 120, 40);
		contentPane.add(btnBack);
		
		btnRulare_1 = new JButton("Afisare Tabel Initial");
		btnRulare_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String URL="jdbc:oracle:thin:@localhost:1521:xe";
				String username="CarCompany";
				String password="123456";
			Connection connection=null;
			try {
			connection=DriverManager.getConnection(URL,username,password);
			String afisare_tabel_initial="";
			if(ordonare.equals("")==true)
				afisare_tabel_initial="select * from "+nume_tabel;
			else
				afisare_tabel_initial="select * from "+nume_tabel+" order by "+ordonare;
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
		btnRulare_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRulare_1.setBounds(20, 420, 220, 40);
		contentPane.add(btnRulare_1);
		
		lblNewLabel_2 = new JLabel("Ce conditie impui?");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(305, 470, 240, 20);
		contentPane.add(lblNewLabel_2);
		
		Input_cond = new JTextField();
		Input_cond.setColumns(10);
		Input_cond.setBounds(315, 500, 220, 30);
		contentPane.add(Input_cond);
		
		Input_grup = new JTextField();
		Input_grup.setColumns(10);
		Input_grup.setBounds(20, 500, 220, 30);
		contentPane.add(Input_grup);
		
		lblNewLabel_3 = new JLabel("Dupa ce doresti sa grupezi?");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 470, 240, 20);
		contentPane.add(lblNewLabel_3);
		
		btnCreareView = new JButton("Creare view");
		btnCreareView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String URL="jdbc:oracle:thin:@localhost:1521:xe";
				String username="CarCompany";
				String password="123456";
				Connection connection=null;
				try {
				connection=DriverManager.getConnection(URL,username,password);
				String comanda="create or replace view "+Input_grup.getText()+"view as select "+Input_grup.getText()+", "+Input_conditie.getText()+" from "+nume_tabel+" group by "+Input_grup.getText()+" , "+Input_conditie.getText()+" having "+Input_conditie.getText()+Input_cond.getText();
				PreparedStatement stat=connection.prepareStatement(comanda);
				stat.executeUpdate();
				JOptionPane.showMessageDialog(null,"Crearea a fost realizata cu success");
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
		btnCreareView.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCreareView.setBounds(645, 455, 120, 40);
		contentPane.add(btnCreareView);
	}

}
