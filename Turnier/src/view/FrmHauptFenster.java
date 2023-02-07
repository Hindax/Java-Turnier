package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class FrmHauptFenster {

	private JFrame frame;
	private JTable tbl_Turniere;
	private JButton btnTurnierAnlegen;
	private JButton btnTurniereLaden;
	private JLabel lblStatus;

	/**
	 * Load the window externally.
	 */
	public static FrmHauptFenster init() {
	FrmHauptFenster window = new FrmHauptFenster();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		return window;
	}

	/**
	 * Create the application.
	 */
	public FrmHauptFenster() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 533, 377);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnTurnierAnlegen = new JButton("Turnier anlegen");
		btnTurnierAnlegen.setBounds(67, 31, 129, 66);
		frame.getContentPane().add(btnTurnierAnlegen);
		
		btnTurniereLaden = new JButton("Turniere laden");
		btnTurniereLaden.setBounds(325, 31, 129, 66);
		frame.getContentPane().add(btnTurniereLaden);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(67, 108, 387, 159);
		frame.getContentPane().add(scrollPane);
		
		tbl_Turniere = new JTable();
		scrollPane.setViewportView(tbl_Turniere);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Meldungen", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(16, 288, 484, 44);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblStatus = new JLabel("");
		lblStatus.setBounds(6, 6, 472, 36);
		panel.add(lblStatus);
	}
}
