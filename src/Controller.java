import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * 
 * @author Arsalan Sadiq This class is a Controller class of MVC which controls
 *         all the functionality of each component. for each button clicked or
 *         key pressed, there is a specific way the components should behave,
 *         through which instantiate Model class and view class to implement
 *         each functionality
 *
 */
public class Controller implements ActionListener, KeyListener {

	private Model model;
	private View view;
	private int counter = 0;
	private int totalVal = 0;

	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("increment")) {
			counter = model.increment(counter);
			view.setTextinCurrent(Integer.toString(counter));
		}

		if (e.getActionCommand().equals("enter")) {

		}

		if (e.getActionCommand().equals("decrement")) {
			counter = model.decrement(counter, totalVal);
			view.setTextinCurrent(Integer.toString(counter));

		}
		if (totalVal < counter) {
			view.setlabelInfoYellow("inconsistent");
		} else if (counter < totalVal) {
			view.setlabelInfoRed("incomplete!");
		} else {
			view.setlabelInfoGreen("complete!");
		}
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			totalVal = Integer.parseInt(view.getTextinTotal());
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}
