package mvc.demo;

import mvc.model.Conversor;
import mvc.view.*;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import mvc.controller.*;

public class ConversorDemo {
	public static void main(String[] args) {
		ViewConversor viewConversor = new PanelConversor1();
		Conversor conversor = new Conversor();
		ActionListener controller = new Controller(viewConversor, conversor);
		viewConversor.controller(controller);
		
		JFrame ventana = new JFrame("Conversor");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setContentPane((JPanel) viewConversor);
		ventana.pack();
		ventana.setVisible(true);
	}
}
