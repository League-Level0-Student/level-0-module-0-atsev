import javax.swing.JOptionPane;

public class EverythingIsAwesome {
public static void main(String[] args) {
	String x = JOptionPane.showInputDialog("What do you like?");
	JOptionPane.showMessageDialog(null, x + " is really awesome!");
}
}
