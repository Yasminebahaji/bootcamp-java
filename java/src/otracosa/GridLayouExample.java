package otracosa;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class GridLayouExample {

		    public static void main(String[] args) {
		        JFrame frame = new JFrame("GridLayout Example");
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.setSize(300, 300);

		        // Creamos un panel con GridLayout de 3 filas y 2 columnas
		        JPanel panel = new JPanel(new GridLayout(3, 2));

		        // Creamos seis botones y los agregamos al panel
		        panel.add(new JButton("Contactos"));
		        panel.add(new JButton("Message"));
		        panel.add(new JButton("Call Log"));
		        panel.add(new JButton("Games"));
		        panel.add(new JButton("Settigs"));
		        panel.add(new JButton("Aplications"));
		        panel.add(new JButton("Music"));
		        panel.add(new JButton("Gallery"));
		        panel.add(new JButton("Organiser"));

		        // Agregamos el panel al frame
		        frame.add(panel);

		        // Hacemos el frame visible
		        frame.setVisible(true);
		    }
		}


