package mvc.view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.*;

@SuppressWarnings("serial")
public class PanelConversor2 extends JPanel implements ViewConversor{
	private JTextField inputJTF;
	private JTextField outputJTF;
	private JLabel resultJL;
	private JLabel mensajeJL;
	private JButton eurosToDollars;
	private JButton dollarsToEuros;

	public PanelConversor2() {
		inputJTF = new JTextField(10);
		outputJTF = new JTextField(10);
		outputJTF.setFocusable(false);
		resultJL = new JLabel(" ");
		eurosToDollars = new JButton("Euros to Dollars");
		dollarsToEuros = new JButton("Dollars to Euros");
		
		setLayout(new GridLayout(3,1,10,0));
		setBorder(new EmptyBorder(10,10,10,10));
		
		JPanel panelC = new JPanel();
		panelC.setLayout(new GridLayout(2, 1));
		panelC.setBorder(new EmptyBorder(10,10,10,10));
		inputJTF.setBorder(BorderFactory.createTitledBorder("Money to be converted"));
		outputJTF.setBorder(BorderFactory.createTitledBorder("Result"));
		panelC.add(inputJTF);
		panelC.add(outputJTF);
		
		resultJL.setBorder(BorderFactory.createTitledBorder("message log"));
		
		JPanel botonera = new JPanel();
		botonera.setLayout(new GridLayout(3, 1, 0, 5));
		botonera.add(eurosToDollars);
		botonera.add(dollarsToEuros);
		
		add(panelC, BorderLayout.NORTH);
		add(botonera, BorderLayout.EAST);
		add(resultJL, BorderLayout.WEST);
	}

	@Override
	public void message(String msg) {
		mensajeJL.setText(msg);
	}

	@Override
	public void controller(ActionListener ctr) {
		eurosToDollars.addActionListener(ctr);
		eurosToDollars.setActionCommand(EUROS_TO_DOLLARS);
		dollarsToEuros.addActionListener(ctr);
		dollarsToEuros.setActionCommand(DOLLARS_TO_EUROS);
	}

	@Override
	public void result(String msg) {
		resultJL.setText(msg);
	}

	@Override
	public void setQuantity(double quantity) {
		outputJTF.setText(String.format("%12.2f", quantity));
	}

	@Override
	public double obtainMoney() {
		return Double.parseDouble(inputJTF.getText());
	}
}
