package otracosa;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class GridLayouExample2 {

		    public static void main(String[] args) {
		        JFrame frame = new JFrame("GridLayout Example");
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.setSize(300, 300);

		        // Creamos un panel con GridLayout de 2 filas y 2 columnas
		        JPanel panel = new JPanel(new GridLayout(2, 2));

		        // Creamos seis botones y los agregamos al panel
		        panel.add(new JButton("North"));
		        panel.add(new JButton("South"));
		        panel.add(new JButton("East"));
		        panel.add(new JButton("West"));
		     

		        // Agregamos el panel al frame
		        frame.add(panel);

		        // Hacemos el frame visible
		        frame.setVisible(true);
		    }
		}