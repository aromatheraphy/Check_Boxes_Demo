	//program_frame.java
	
	import javax.swing.JFrame;

	public class program_frame {
		public static void main(String[] args) {
		
			JFrame frame = new JFrame("Check Boxes Demo");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			program_panel panel = new program_panel();
			frame.getContentPane().add(panel);
		
			frame.pack();
			frame.setVisible(true);
		}
	}
