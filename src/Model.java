/**
 * 
 * @author Arsalan Sadiq Student number: 101020133 This class is a Model class
 *         of MVC which contains the functionality of each component in View
 *         class
 *
 */
public class Model {

	public int increment(int i) {
		return i = i + 1;
	}

	public int decrement(int i, int max) {
		if (i > max) {
			i = i - 1;
		} else {
			// error
		}
		return i;
	}
}
