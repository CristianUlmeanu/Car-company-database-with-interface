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
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Afisare_filtrare extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField Tabel1;
	private JTextField Tabel2;
	private JTextField Tabel3;
	private JTextField Conditie1;
	private JTextField Conditie2;
	private JTextField Leg1;
	private JTextField Leg2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Afisare_filtrare frame = new Afisare_filtrare();
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
	public Afisare_filtrare() {
		setTitle("Meniu Baza de date");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("Afisor compus");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel.setBounds(250, 60, 300, 50);
		contentPane.add(lblNewLabel);
		
		
		JScrollPane scrollPane= new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds(250, 140, 536, 400);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
				
		JLabel lblNewLabel_2 = new JLabel("Alegere tabele.");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(40, 128, 150, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tabel 1:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(10, 157, 91, 20);
		contentPane.add(lblNewLabel_3);
		
		Tabel1 = new JTextField();
		Tabel1.setBounds(101, 157, 139, 20);
		contentPane.add(Tabel1);
		Tabel1.setColumns(10);
		
		Tabel2 = new JTextField();
		Tabel2.setColumns(10);
		Tabel2.setBounds(101, 187, 139, 20);
		contentPane.add(Tabel2);
		
		JLabel lblNewLabel_3_1 = new JLabel("Tabel 2:");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_1.setBounds(10, 187, 91, 20);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Tabel 3:");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_1_1.setBounds(10, 217, 91, 20);
		contentPane.add(lblNewLabel_3_1_1);
		
		Tabel3 = new JTextField();
		Tabel3.setColumns(10);
		Tabel3.setBounds(101, 216, 139, 20);
		contentPane.add(Tabel3);
		
		JLabel lblNewLabel_2_1 = new JLabel("Alegere conditii.");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(40, 307, 150, 20);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Conditie 1:");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_2.setBounds(10, 337, 91, 20);
		contentPane.add(lblNewLabel_3_2);
		
		Conditie1 = new JTextField();
		Conditie1.setColumns(10);
		Conditie1.setBounds(101, 337, 139, 20);
		contentPane.add(Conditie1);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Conditie 2:");
		lblNewLabel_3_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_1_2.setBounds(10, 367, 91, 20);
		contentPane.add(lblNewLabel_3_1_2);
		
		Conditie2 = new JTextField();
		Conditie2.setColumns(10);
		Conditie2.setBounds(101, 367, 139, 20);
		contentPane.add(Conditie2);
		
		JButton btnRulare = new JButton("Afisare");
		btnRulare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String URL="jdbc:oracle:thin:@localhost:1521:xe";
				String username="CarCompany";
				String password="123456";
				Connection connection=null;
				try {
				connection=DriverManager.getConnection(URL,username,password);
				String comanda="select * from "+Tabel1.getText()+" join "+Tabel2.getText()+" using ("+Leg1.getText()+") join "+Tabel3.getText()+" using ("+Leg2.getText()+") where "+Conditie1.getText()+" and "+Conditie2.getText();
				PreparedStatement stat=connection.prepareStatement(comanda);
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
		btnRulare.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRulare.setBounds(60, 397, 120, 40);
		contentPane.add(btnRulare);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Meniu_mare meniu=new Meniu_mare();
				meniu.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBack.setBounds(60, 500, 120, 40);
		contentPane.add(btnBack);
		
		Leg1 = new JTextField();
		Leg1.setColumns(10);
		Leg1.setBounds(101, 247, 139, 20);
		contentPane.add(Leg1);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Legatura 1-2:");
		lblNewLabel_3_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_2_1.setBounds(10, 247, 91, 20);
		contentPane.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_1_2_1 = new JLabel("Legatura 2-3:");
		lblNewLabel_3_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_1_2_1.setBounds(10, 277, 91, 20);
		contentPane.add(lblNewLabel_3_1_2_1);
		
		Leg2 = new JTextField();
		Leg2.setColumns(10);
		Leg2.setBounds(101, 277, 139, 20);
		contentPane.add(Leg2);
		
		JButton btnRulare_1 = new JButton("Creare View");
		btnRulare_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String URL="jdbc:oracle:thin:@localhost:1521:xe";
				String username="CarCompany";
				String password="123456";
				Connection connection=null;
				try {
				connection=DriverManager.getConnection(URL,username,password);
				String comanda="create or replace view "+Tabel1.getText()+Tabel2.getText()+Tabel3.getText()+" as select * from "+Tabel1.getText()+" join "+Tabel2.getText()+" using ("+Leg1.getText()+") join "+Tabel3.getText()+" using ("+Leg2.getText()+") where "+Conditie1.getText()+" and "+Conditie2.getText();
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
		btnRulare_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRulare_1.setBounds(60, 447, 120, 40);
		contentPane.add(btnRulare_1);
	}
}
