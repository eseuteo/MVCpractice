package mvc.view;

import java.awt.event.ActionListener;

public interface ViewConversor {
	// el controlador puede manejar ciertos eventos
		// y leer/escribir datos de la vista
		
		// lectura de datos del formulario
		double obtainMoney();
		
		// escritura de datos en el formulario
		void message(String msg);
		void result(String msg);
		void setQuantity(double quantity);

		// eventos exportados al controlador
		String EUROS_TO_DOLLARS = "E";
		String DOLLARS_TO_EUROS = "D";
		
	    // para registrar el controlador	
		void controller(ActionListener ctr);
}
