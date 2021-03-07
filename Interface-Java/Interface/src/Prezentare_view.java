import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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
import javax.swing.JTextField;
import javax.swing.JScrollPane;

public class Prezentare_view extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField Input_afisare;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prezentare_view frame = new Prezentare_view();
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
	public Prezentare_view() {
		setTitle("Meniu Baza de date");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("Prezentare View");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel.setBounds(250, 10, 300, 50);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds(20, 140, 745, 320);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollPane.setViewportView(table);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Meniu_mare meniu=new Meniu_mare();
				meniu.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBack.setBounds(540, 490, 120, 40);
		contentPane.add(btnBack);
		
		JButton btnBack_1 = new JButton("Modificare");
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Input_afisare.getText().contains("View")==false)
					{Modificari meniu_modificari=new Modificari();
					meniu_modificari.setVisible(true);
					dispose();}
				else
				JOptionPane.showMessageDialog(null,"Nu pot fi modificate datele din viewul acesta");
			}
		});
		btnBack_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBack_1.setBounds(350, 490, 120, 40);
		contentPane.add(btnBack_1);
		
		JButton btnBack_1_1 = new JButton("Afisare");
		btnBack_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String URL="jdbc:oracle:thin:@localhost:1521:xe";
				String username="CarCompany";
				String password="123456";
				Connection connection=null;
				try {
				connection=DriverManager.getConnection(URL,username,password);
				String afisare_cod="select * from "+Input_afisare.getText();
				PreparedStatement stat=connection.prepareStatement(afisare_cod);
				ResultSet result=stat.executeQuery();
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
		btnBack_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBack_1_1.setBounds(160, 490, 120, 40);
		contentPane.add(btnBack_1_1);
		
		Input_afisare = new JTextField();
		Input_afisare.setBounds(354, 100, 411, 34);
		contentPane.add(Input_afisare);
		Input_afisare.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Cum se numeste viewul pe care doresti sa il afisezi?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(20, 101, 335, 34);
		contentPane.add(lblNewLabel_1);
		
	}

}
