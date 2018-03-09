package me.andrew.tablefactory;

import java.awt.Color;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;



public class TableFactory {

	private JTextField traitname1;
	private JTextField traitname2;
	private JTextField traitname1b;
	private JTextField traitname2b;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JSeparator separator_3;
	public JLabel d;
	public JLabel a;
	public JLabel c;
	public JLabel b;
	public Border bord = BorderFactory.createLineBorder(Color.WHITE, 0, false);
	public TableFactory(JPanel panel){
		// just a constructor for a new object...
	}
	public void MakeTable(JPanel panel){
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBackground(Color.DARK_GRAY);
		separator.setBounds(161, 2, 1, 88);
		panel.add(separator);
		
		traitname1 = new JTextField();
		traitname1.setBounds(93, 2, 93, 25);
		traitname1.setBorder(bord);
		panel.add(traitname1);
		traitname1.setText("Trait 1");
		traitname1.setColumns(10);
		
		traitname2 = new JTextField();
		traitname2.setBorder(bord);
		traitname2.setBounds(185, 2, 50, 25);
		panel.add(traitname2);
		traitname2.setText("Trait 2");
		traitname2.setColumns(10);
		
		traitname1b = new JTextField();
		panel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent m) {
				
				panel.setBounds(m.getXOnScreen() -110, m.getYOnScreen() - 110, 247, 88);
				

			}
		});
		traitname1b.setText("Trait 1b");
		traitname1b.setBorder(bord);
		traitname1b.setColumns(10);
		traitname1b.setBounds(2, 28, 74, 27);
		panel.add(traitname1b);
		
		traitname2b = new JTextField();
		traitname2b.setBorder(bord);
		traitname2b.setText("Trait 1b");
		traitname2b.setColumns(10);
		traitname2b.setBounds(2, 56, 74, 28);
		panel.add(traitname2b);
		
		separator_1 = new JSeparator();
		separator_1.setBounds(2, 55, 275, 1);
		panel.add(separator_1);
		
		JLabel lblTablelabel = new JLabel("Table");
		lblTablelabel.setBounds(12, 6, 56, 16);
		panel.add(lblTablelabel);
		
		separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBackground(Color.DARK_GRAY);
		separator_2.setBounds(80, 2, 1, 88);
		panel.add(separator_2);
		
		separator_3 = new JSeparator();
		separator_3.setBounds(2, 27, 275, 1);
		panel.add(separator_3);
		
		a = new JLabel("0");
		a.setBounds(93, 33, 56, 16);
		panel.add(a);
		
		b = new JLabel("0");
		b.setBounds(179, 33, 56, 16);
		panel.add(b);
		
		c = new JLabel("0");
		c.setBounds(93, 62, 56, 16);
		panel.add(c);
		
		d = new JLabel("0");
		d.setBounds(179, 62, 56, 16);
		panel.add(d);
	}
}
