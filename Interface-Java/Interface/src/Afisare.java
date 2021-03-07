import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.border.LineBorder;

import net.proteanit.sql.DbUtils;

import java.awt.Color;
import javax.swing.JScrollPane;

public class Afisare extends JFrame {

	private JPanel contentPane;
	private JTextField Input_afisare;
	private JTable table;
	private JTextField Order_Var;
	public String nume="";
	public String grupare="";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Afisare frame = new Afisare();
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
	public Afisare() {
		setTitle("Meniu Baza de date");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("Afisor Baza de date");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel.setBounds(250, 80, 300, 50);
		contentPane.add(lblNewLabel);
		
		Input_afisare = new JTextField();
		Input_afisare.setBounds(20, 260, 220, 30);
		contentPane.add(Input_afisare);
		Input_afisare.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Ce tabel vrei sa afisezi?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 230, 240, 20);
		contentPane.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(250, 171, 536, 382);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setSurrendersFocusOnKeystroke(true);
		table.setBorder(new EmptyBorder(0, 0, 0, 0));
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Meniu_mare meniu=new Meniu_mare();
				meniu.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(60, 494, 120, 40);
		contentPane.add(btnNewButton);
		
		JButton btnRulare = new JButton("Afisare");
		btnRulare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String URL="jdbc:oracle:thin:@localhost:1521:xe";
				String username="CarCompany";
				String password="123456";
				Connection connection=null;
				try {
				connection=DriverManager.getConnection(URL,username,password);
				String afisare_cod="";
				if(Order_Var.getText().equals("")==true) {
					afisare_cod="select * from "+Input_afisare.getText();}
				else{
					afisare_cod="select * from "+Input_afisare.getText()+" order by "+Order_Var.getText();}
				PreparedStatement stat=connection.prepareStatement(afisare_cod);
				ResultSet result=stat.executeQuery();
				table.setModel(DbUtils.resultSetToTableModel(result));
				nume=Input_afisare.getText();
				grupare=Order_Var.getText();
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
		btnRulare.setBounds(60, 394, 120, 40);
		contentPane.add(btnRulare);
		
		Order_Var = new JTextField();
		Order_Var.setColumns(10);
		Order_Var.setBounds(20, 335, 220, 30);
		contentPane.add(Order_Var);
		
		JLabel lblNewLabel_1_1 = new JLabel("Dupa ce vrei sa fie ordonat?");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(10, 305, 240, 20);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnRulare_1 = new JButton("Grupare");
		btnRulare_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Afisare_grup afisare=new Afisare_grup();
				nume=Input_afisare.getText();
				grupare=Order_Var.getText();
				afisare.nume_tabel=nume;
				afisare.ordonare=grupare;
				afisare.setVisible(true);
				dispose();		
			}
		});
		btnRulare_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRulare_1.setBounds(60, 444, 120, 40);
		contentPane.add(btnRulare_1);
	}
}


