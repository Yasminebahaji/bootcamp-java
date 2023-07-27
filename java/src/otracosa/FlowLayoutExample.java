package otracosa;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class FlowLayoutExample {

	public static void main(String[] args) {
	      JFrame frame = new JFrame("FlowLayout Example");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(300, 150);

	        // Creamos un panel con FlowLayout
	        JPanel panel = new JPanel(new FlowLayout());

	        // Creamos algunos botones y los agregamos al panel
	        panel.add(new JButton("Botón 1"));
	        panel.add(new JButton("Botón 2"));
	        panel.add(new JButton("Botón 3"));
	        panel.add(new JButton("Botón 4"));
	        panel.add(new JButton("Botón 5"));

	        // Agregamos el panel al frame
	        frame.add(panel);

	        // Hacemos el frame visible
	        frame.setVisible(true);

	}

}


