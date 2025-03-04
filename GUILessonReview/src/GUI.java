//imports the layout of the GUI window
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


//main class called GUI
public class GUI {

	//constructor for the GUI class
	public GUI() {

		JFrame frame = new JFrame();

		JButton button = new JButton("Click me");
		JLabel label = new JLabel("Number of clicks: 0");


		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);

		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Our GUI review");
		frame.pack();
		frame.setVisible(true);


	}

	//main method - where everything is executed first
	public static void main(String[] args) {
		
		new GUI();



	}

}
