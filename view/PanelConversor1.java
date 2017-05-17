package mvc.view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.*;

@SuppressWarnings("serial")
public class PanelConversor1 extends JPanel implements ViewConversor {
	private JTextField inputJTF;
	private JTextField outputJTF;
	private JLabel resultJL;
	private JLabel mensajeJL;
	private JButton eurosToDollars;
	private JButton dollarsToEuros;

	public PanelConversor1() {
		inputJTF = new JTextField(10);
		outputJTF = new JTextField(10);
		outputJTF.setFocusable(false);
		resultJL = new JLabel(" ");
		eurosToDollars = new JButton("Euros to Dollars");
		dollarsToEuros = new JButton("Dollars to Euros");

		JPanel panelC = new JPanel();
		panelC.setLayout(new GridLayout(2, 2, 10, 10));
		panelC.setBorder(new EmptyBorder(10, 10, 10, 10));
		panelC.add(inputJTF);
		panelC.add(outputJTF);
		panelC.add(eurosToDollars);
		panelC.add(dollarsToEuros);

		setLayout(new GridLayout(2, 1, 0, 10));

		JPanel panelResult = new JPanel();
		resultJL.setBorder(BorderFactory.createTitledBorder("Message log"));
		panelResult.add(resultJL);

		add(panelC, BorderLayout.CENTER);
		add(panelResult, BorderLayout.SOUTH);
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
