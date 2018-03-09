package me.andrew.dataclass;

import java.util.ArrayList;

import javax.swing.JLabel;

import me.andrew.tablefactory.TableFactory;

public class PanelElements {
	public static ArrayList<JLabel> getElements(TableFactory f) {
		ArrayList<JLabel> elements = new ArrayList<JLabel>();
		elements.add(f.a);
		elements.add(f.b);
		elements.add(f.c);
		elements.add(f.d);
		return elements;
	}
	
}
