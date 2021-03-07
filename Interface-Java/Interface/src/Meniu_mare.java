import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import java.awt.Font;
import javax.swing.JLayeredPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Meniu_mare extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Meniu_mare frame = new Meniu_mare();
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
	public Meniu_mare() {
		setType(Type.POPUP);
		setTitle("Meniu Baza de date");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Meniu Principal");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel.setBounds(250, 50, 300, 50);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Afisare simpla");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Afisare afis=new Afisare();
				afis.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(300, 161, 200, 50);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Modificare");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Modificari meniu_modificari=new Modificari();
				meniu_modificari.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(300, 241, 200, 50);
		contentPane.add(btnNewButton_1);
		
		JButton btnAfisareFiltrata = new JButton("Afisare compusa");
		btnAfisareFiltrata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Afisare_filtrare afisare=new Afisare_filtrare();
				afisare.setVisible(true);
				dispose();
			}
		});
		btnAfisareFiltrata.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAfisareFiltrata.setBounds(300, 321, 200, 50);
		contentPane.add(btnAfisareFiltrata);
		
		JButton btnNewButton_1_1_1 = new JButton("Iesire");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1_1_1.setBounds(200, 500, 400, 40);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnPrezentareView = new JButton("Prezentare view");
		btnPrezentareView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prezentare_view view=new Prezentare_view();
				view.setVisible(true);
				dispose();
			}
		});
		btnPrezentareView.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPrezentareView.setBounds(300, 401, 200, 50);
		contentPane.add(btnPrezentareView);
	}

}
