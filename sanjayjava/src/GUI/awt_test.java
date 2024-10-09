package GUI;
import java.awt.Button;
import java.awt.Frame;
public class awt_test extends Frame {

	awt_test(){
		Button b = new Button("Click");
		b.setBounds(30,100,80,30);// set position of button
		setSize(400,400);// frame size
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		awt_test a = new awt_test();

	}

}
