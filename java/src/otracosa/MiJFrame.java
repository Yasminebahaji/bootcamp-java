package otracosa;
	import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
	import javax.swing.JFrame;
import javax.swing.JPanel;

	public class  MiJFrame extends JFrame{
		public static void main(String[] args) {
			MiJFrame mjf = new MiJFrame();
		}
		public void contruyePanelInferior(){
	        JPanel panelInferior = new JPanel();
	        panelInferior.setLayout(new FlowLayout());
	        panelInferior.setBackground(Color.green);
		}
			private static final long serialVersionUID =1L;
			 MiJFrame(){
				setTitle("BorderLayout");
				setSize(500,500);
				setVisible(true);
				setLayout(new BorderLayout());
				
					
				
				JButton btn1 = new JButton ("btn 1");
				JButton btn2 = new JButton ("btn 2");
				JButton btn3 = new JButton ("btn 3");
				JButton btn4 = new JButton ("btn 4");
				JButton btn5 = new JButton ("btn 5");
				
				add(btn1, BorderLayout.NORTH);
				add(btn2, BorderLayout.EAST);
				add(btn3, BorderLayout.CENTER);
				add(btn4, BorderLayout.WEST);
				add(btn5, BorderLayout.SOUTH);

				
			}
	}

	
