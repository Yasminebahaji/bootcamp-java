package otracosa;
import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BorderLayoutExample() {
        setTitle("BorderLayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 300));

        // Crear los paneles para cada región con nombres
        JPanel northPanel = createPanel(Color.RED, "NORTH");
        JPanel southPanel = createPanel(Color.RED, "SOUTH");
        JPanel eastPanel = createPanel(Color.GREEN, "EAST");
        JPanel westPanel = createPanel(Color.GREEN, "WEST");
        JPanel centerPanel = createPanel(Color.YELLOW, "CENTER");

        // Establecer el BorderLayout para el JFrame
        setLayout(new BorderLayout());

        // Agregar los paneles a sus respectivas regiones
        add(northPanel, BorderLayout.NORTH);
        add(southPanel, BorderLayout.SOUTH);
        add(eastPanel, BorderLayout.EAST);
        add(westPanel, BorderLayout.WEST);
        add(centerPanel, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }

    private JPanel createPanel(Color backgroundColor, String panelName) {
        JPanel panel = new JPanel();
        panel.setBackground(backgroundColor);
        panel.add(new JLabel(panelName)); // Agregar un JLabel con el nombre en el panel
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BorderLayoutExample example = new BorderLayoutExample();
            example.setVisible(true);
        });
    }
}
