import javax.swing.*; // swing library for GUI
import java.awt.event.*; // to handle events
public class calculator implements ActionListener {
	int a, b, c; // Used in calculation
	String s; // text from the text boxes will be read into this string
	JFrame f = new JFrame(); // frame is the window for all components like buttons, text boxes etc.
	JButton add = new JButton("add"); // new buttons
	JButton sub = new JButton("subtract");
	JButton exit = new JButton("exit");
	JTextField n1 = new JTextField(); // text fields for input
	JTextField n2 = new JTextField();
	JLabel l1 = new JLabel("Number 1: ");// labels for clear understanding
	JLabel l2 = new JLabel("Number 2: ");
	JLabel ans = new JLabel("Answer");
	calculator() {
		l1.setBounds(100, 50, 80, 20); // method setBounds defines the position and size of each component in the window
		l2.setBounds(100, 75, 80, 20);
		ans.setBounds(180, 150, 80, 20);
		n1.setBounds(185, 50, 150, 20);
		n2.setBounds(185, 75, 150, 20);
		add.setBounds(130, 200, 100, 40);
		sub.setBounds(240, 200, 100, 40);
		exit.setBounds(185, 250, 100, 40);

		add.addActionListener(this);// configure the buttons for action after listening to activity of "click"
		sub.addActionListener(this);
		exit.addActionListener(this);

		f.add(l1);// add all components to the frame
		f.add(l2);
		f.add(ans);
		f.add(add);
		f.add(sub);
		f.add(n1);
		f.add(n2);
		f.add(exit);
		f.setSize(400, 350);//set frame size
		f.setLayout(null);// set no boundaries for the frame
		f.setVisible(true);// set the frame to be visible
	}
	public void actionPerformed(ActionEvent e) { // function defines action of the buttons which are clicked
		if(e.getSource() == exit) {
			System.exit(0);// if exit button is clicked then terminate the program
		}
		s = n1.getText(); // get text from text box n1
		a = Integer.parseInt(s);// convert it into integer and store in variable a
		s = n2.getText();// get text from text box n2
		b = Integer.parseInt(s);// convert it into integer and store in variable b
		c = 0;
		if(e.getSource() == add) {
			c = a + b; // add a and b
		} else {
			c = a - b;// subtract a and b
		}
		s = String.valueOf(c);// convert value of c to string format
		ans.setText(s);	// display in the answer area
	}
	public static void main(String[] args) {
		new calculator();
	}
}