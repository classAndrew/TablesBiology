import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import me.andrew.dataclass.PanelElements;
import me.andrew.tablefactory.TableFactory;
import me.andrew.types.Percentage;

import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JSplitPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class MainClass extends JFrame {

	private JPanel contentPane;
	private JTextField traitname1;
	private JTextField traitname2;
	private JTextField traitname1b;
	private JTextField traitname2b;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JSeparator separator_3;
	private JPanel panel_1;
	public static JTextField amounttxt;
	
	public JLabel d;
	public JLabel a;
	public JLabel c;
	public JLabel b;
	public JButton percantage;
	private JPanel panel_2;
	private JLabel label;
	private JTextField amounttxt2;
	private JButton button;
	private JButton button_1;

	public static void main(String[] args) {
		// asynchronous
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainClass frame = new MainClass();
					frame.setVisible(true);
					// may not work for mac users this part.
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public MainClass() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		Border bord = BorderFactory.createLineBorder(Color.WHITE, 0, false);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(12, 13, 247, 88);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		panel.setLayout(null);
		
		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(232, 114, 247, 88);
		contentPane.add(panel_2);
		
		TableFactory tabl = new TableFactory(panel);
		tabl.MakeTable(panel);
		
		TableFactory tabl2 = new TableFactory(panel_2);
		tabl2.MakeTable(panel_2);
		
		panel_1 = new JPanel();
		panel_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent m) {
				panel_1.setBounds(m.getXOnScreen() -110, m.getYOnScreen() - 110, panel_1.getWidth(), panel_1.getHeight());
			}
		});
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(211, 228, 299, 152);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		amounttxt = new JTextField();
		amounttxt.setText("500");
		amounttxt.setBounds(70, 13, 71, 22);
		panel_1.add(amounttxt);
		amounttxt.setColumns(10);
		
		JButton btnGenbutton = new JButton("Start!");
		btnGenbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Random rnm = new Random();
				
				// Case statements can also be used to be faster
				
				for (int i = 0; i < Integer.valueOf(amounttxt.getText()); i++){
					int num = rnm.nextInt(17);
					if (num <= 8) {
						tabl.a.setText(String.valueOf(Integer.valueOf(tabl.a.getText()) + 1)); 
					}
					else if (num >= 8 && num <= 11) {
						tabl.b.setText(String.valueOf(Integer.valueOf(tabl.b.getText()) + 1)); 
					}
					else if (num >= 12 && num <= 15) {
						tabl.c.setText(String.valueOf(Integer.valueOf(tabl.c.getText()) + 1)); 
					}
					else if (num == 16){
						tabl.d.setText(String.valueOf(Integer.valueOf(tabl.d.getText()) + 1));
					}
				}
			}
		});
		btnGenbutton.setBounds(153, 12, 65, 25);
		panel_1.add(btnGenbutton);
		
		JLabel lblLbl = new JLabel("Entities: ");
		lblLbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLbl.setBounds(2, 16, 56, 19);
		panel_1.add(lblLbl);
		
		percantage = new JButton("%");
		percantage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Percentage.textFieldBuffer = amounttxt;
				
				// can be looped if not already
				for (JLabel l : PanelElements.getElements(tabl)){
					l.setText(new Percentage(l, true).getPercentAsString());
				}

			}
		});
		percantage.setBounds(229, 12, 58, 25);
		panel_1.add(percantage);
		
		label = new JLabel("Entities: ");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(2, 48, 56, 19);
		panel_1.add(label);
		
		amounttxt2 = new JTextField();
		amounttxt2.setText("1000");
		amounttxt2.setColumns(10);
		amounttxt2.setBounds(70, 47, 71, 22);
		panel_1.add(amounttxt2);
		
		button = new JButton("Start!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Random rnm = new Random();
				
				// Case statements can also be used to be faster
				
				for (int i = 0; i < Integer.valueOf(amounttxt2.getText()); i++){
					int num = rnm.nextInt(17);
					if (num <= 8) {
						tabl2.a.setText(String.valueOf(Integer.valueOf(tabl2.a.getText()) + 1)); 
					}
					else if (num >= 8 && num <= 11) {
						tabl2.b.setText(String.valueOf(Integer.valueOf(tabl2.b.getText()) + 1)); 
					}
					else if (num >= 12 && num <= 15) {
						tabl2.c.setText(String.valueOf(Integer.valueOf(tabl2.c.getText()) + 1)); 
					}
					else if (num == 16){
						tabl2.d.setText(String.valueOf(Integer.valueOf(tabl2.d.getText()) + 1));
					}
				}	
			}
		});
		button.setBounds(153, 46, 65, 25);
		panel_1.add(button);
		
		button_1 = new JButton("%");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Percentage.textFieldBuffer = amounttxt2;
				
				// can be looped if not already
				for (JLabel l : PanelElements.getElements(tabl2)){
					l.setText(new Percentage(l, true).getPercentAsString());
				}
			}
		});
		button_1.setBounds(229, 46, 58, 25);
		panel_1.add(button_1);
		
	}
}
