//packages inserted here


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

	//initial count of number of clicks - assigned to 0
	int count = 0;

	//declared instant variables within the GUI class instead of within the GUI constructor originally
	private JLabel label;
	private JFrame frame;
	private JButton button;
	private JPanel panel;

	//constructor for the GUI class
	public GUI() {

		//used to activate the GUI window
		JFrame frame = new JFrame();

		//creates and shows the button with the text "Click me"
		button = new JButton("Click me");
		button.addActionListener(this);

		//labels for the number of clicks - hardcoded when there are zero clicks
		label = new JLabel("Number of clicks: 0");


		//contents or designs for the GUI window
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);


		//used to edit the layout of the GUI window
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
	public void actionPerformed(ActionEvent e) { //clickevent for when the button is activated
		
		count++; //takes the previous number of click and adds a new one each time it is clicked.
		label.setText("Number of clicks: " + count);  //new text for the label for each click made.
	}

}
