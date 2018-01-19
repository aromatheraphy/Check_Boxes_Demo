	//program_panel.java
	
	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	public class program_panel extends JPanel {
		private JLabel note;
		private JCheckBox type1, type2;
		public program_panel() {
			note = new JLabel("I am Utopian!");
			note.setFont(new Font("Halvetica", Font.PLAIN, 50));
		
			type1 = new JCheckBox("Make Font Bold");
			type1.setBackground(Color.GREEN);
		
			type2 = new JCheckBox("Make Font Italic");
			type2.setBackground(Color.ORANGE);
		
			Type_Listener listener_obj = new Type_Listener();
			type1.addItemListener(listener_obj);
			type2.addItemListener(listener_obj);
		
			add(note);
			add(type1);
			add(type2);
		
			
			setBackground(Color.WHITE);
			setPreferredSize(new Dimension(400, 150));
		}
		private class Type_Listener implements ItemListener{	
			public void itemStateChanged(ItemEvent event) {
				int type = Font.PLAIN;
				if(type1.isSelected())
					type = Font.BOLD;
				if(type2.isSelected())
					type = Font.ITALIC;
				note.setFont(new Font("Halvetica", type, 50));
			}
		}
	}
