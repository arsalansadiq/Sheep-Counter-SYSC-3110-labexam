import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 
 * @author Arsalan Sadiq This class is a View class of MVC which initalises the
 *         Jframe and sets all the buttons and labels and fields into working it
 *         uses instances of model and controller to control the functionality
 *         of each and every component present
 *
 */

public class View extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField total;
	private JTextField current;
	private JButton increment;
	private JButton decrement;
	private JLabel totLabel;
	private JLabel curLabel;
	private JLabel info;
	private Model model;
	private Controller controller;

	public View() {
		super("Sheep Counter");
		model = new Model();
		controller = new Controller(model, this);
		total = new JTextField();
		total.setActionCommand("enter");
		current = new JTextField();
		current.setEditable(false);
		totLabel = new JLabel("total");
		curLabel = new JLabel("current");
		increment = new JButton("increment");
		decrement = new JButton("decrement");
		info = new JLabel("");
		this.setLayout(new GridLayout(4, 2));
		this.add(totLabel);
		this.add(total);
		this.add(curLabel);
		this.add(current);
		this.add(increment);
		this.add(decrement);
		this.add(info);

		total.addActionListener(controller);
		current.addActionListener(controller);
		increment.addActionListener(controller);
		decrement.addActionListener(controller);
		total.addKeyListener((KeyListener) controller);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(100, 100);
		this.setSize(new Dimension(1024, 450));
		this.setResizable(true);
		this.setVisible(true);
		pack();

	}

	public void setlabelInfoRed(String s) {
		info.setText(s);
		info.setForeground(Color.RED);
	}

	public void setlabelInfoGreen(String s) {
		info.setText(s);
		info.setForeground(Color.GREEN);
	}

	public void setlabelInfoYellow(String s) {
		info.setText(s);
		info.setForeground(Color.YELLOW);
	}

	public void setfalseTotal() {
		total.setEditable(false);
	}

	public String getTextinTotal() {
		return total.getText();
	}

	public void setTextinCurrent(String s) {
		current.setText(s);
	}

	public static void main(String args[]) {
		new View();
	}

}
