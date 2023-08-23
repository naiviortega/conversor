package com.conversor.vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.conversor.moneda.Moneda;
import com.conversor.temperatura.Temperatura;

public class ConversorMenu {

	private String[] items;
	private JFrame frame;
	private JPanel panel;
	private JLabel texto;
	private JComboBox<String> opciones;

	public ConversorMenu() {
		items = new String[] { "Conversor de Moneda", "Conversor de Temperatura" };
		frame = new JFrame("Menú");
		panel = new JPanel();
		texto = new JLabel("Seleccione una opción de conversión");
		opciones = new JComboBox<>(items);

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
		frame.setLocationRelativeTo(null);

		frame.add(panel);
		panel.add(texto);
		panel.add(opciones);

		opciones.addActionListener(new ActionListener() {
			String op;
			String input;
			double valor;

			@Override
			public void actionPerformed(ActionEvent e) {
				op = opciones.getSelectedItem().toString();
				frame.dispose();

				if (op == "Conversor de Moneda") {					
					do {
						input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir");
						if (input.matches("[0-9].*")) {
							valor = Double.parseDouble(input);
							Moneda moneda = new Moneda(valor);
						} else {
							JOptionPane.showMessageDialog(panel, "Ingrese un valor númerico");
						}
					} while (!input.matches("[0-9].*"));
				} else {
					do {
						input = JOptionPane.showInputDialog("Ingresa el valor de temperatura que deseas convertir");
						if (input.matches("[0-9].*")) {
							valor = Double.parseDouble(input);
							Temperatura moneda = new Temperatura(valor);
						} else {
							JOptionPane.showMessageDialog(panel, "Ingrese un valor númerico");
						}
					} while (!input.matches("[0-9].*"));
				}
			}
		});
	}

}
