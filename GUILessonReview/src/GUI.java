//imports the layout of the GUI window
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


//main class called GUI
public class GUI implements ActionListener {

	int count = 0;
	private JLabel label;
	private JFrame frame;
	private JButton button;
	private JPanel panel;

	//constructor for the GUI class
	public GUI() {

		JFrame frame = new JFrame();

		button = new JButton("Click me");
		button.addActionListener(this);

		label = new JLabel("Number of clicks: 0");


		panel = new JPanel();
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


	//method which is used when clicked
	@Override
	public void actionPerformed(ActionEvent e) {
		
		count++; //takes the previous number of click and adds a new one each time it is clicked.
		label.setText("Number of clicks: " + count);  //new text for the label for each click made.
	}

}
