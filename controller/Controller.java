package mvc.controller;

import java.awt.event.*;
import mvc.model.*;
import mvc.view.*;

public class Controller implements ActionListener {
	private ViewConversor viewConversor;
	private Conversor conversor;
	
	public Controller(ViewConversor viewConversor, Conversor conversor){
		this.viewConversor = viewConversor;
		this.conversor = conversor;
		viewConversor.result("Conversor succesfully initiated");
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		String command = event.getActionCommand();
		viewConversor.result(" ");
		
		switch (command) {
		
		case ViewConversor.DOLLARS_TO_EUROS: {
			double quantity = viewConversor.obtainMoney();
			viewConversor.setQuantity(conversor.dollarsToEuros(quantity));
			viewConversor.result("Conversion succesfully done");
			break;
		}
		
		case ViewConversor.EUROS_TO_DOLLARS: {
			double quantity = viewConversor.obtainMoney();
			viewConversor.setQuantity(conversor.dollarsToEuros(quantity));
			viewConversor.result("Conversion succesfully done");
			break;
		}
		}
	}
}